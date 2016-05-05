package com.bestpay.trade.bestpaycard.manager.impl;

import com.bestpay.trade.bestpaycard.common.exception.ExternalException;
import com.bestpay.trade.bestpaycard.common.exception.TradeBestpaycardErrorCode;
import com.bestpay.trade.bestpaycard.common.exception.TradeBestpaycardException;
import com.bestpay.trade.bestpaycard.dal.mapper.TPcmAcctInfoMapper;
import com.bestpay.trade.bestpaycard.dal.mapper.TPcmDealLogMapper;
import com.bestpay.trade.bestpaycard.dal.model.TPcmAcctInfoDO;
import com.bestpay.trade.bestpaycard.dal.model.TPcmDealLogDO;
import com.bestpay.trade.bestpaycard.manager.CheckManager;
import com.bestpay.trade.bestpaycard.manager.ModifyBalManager;
import com.bestpay.trade.bestpaycard.manager.conventer.TPcmDealLogConventer;
import com.bestpay.trade.bestpaycard.manager.model.ModifyBalReqBO;
import com.bestpay.trade.bestpaycard.manager.model.ModifyBalRsltBO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * description:变更余额manager实现类
 * <p>
 *     1、执行余额变更
 *     2、新增交易记录
 *     3、验证交易流水号是否重复
 *     4、创建交易日志流水号
 *     5、扣除订单金额
 *     6、更新账户余额到deal_log表
 * </p>
 * User: huguangpu Date: 16/5/4 ProjectName: trade-bestpaycard Version: 1.0
 */
@Slf4j
public class ModifyBalManagerImpl implements ModifyBalManager{


    @Autowired
    TPcmDealLogMapper tPcmDealLogMapper;

    @Autowired
    TPcmAcctInfoMapper tPcmAcctInfoMapper;

    @Autowired
    CheckManager checkManager;
    /**
     * 执行余额变更
     * @param modifyBalReqBO
     * @return ModifyBalRsltBO
     */
    @Transactional
    public ModifyBalRsltBO executeModifyBal(ModifyBalReqBO modifyBalReqBO) {
        ModifyBalRsltBO modifyBalRsltBO=new ModifyBalRsltBO();
        TPcmAcctInfoDO tPcmAcctInfoDO=tPcmAcctInfoMapper.selectByAcctCode(modifyBalReqBO.getCardNo());
        //账户号不存在
        if(tPcmAcctInfoDO==null){
            throw new ExternalException(
                    TradeBestpaycardErrorCode.ACCTINFO_NOT_EXIST,TradeBestpaycardErrorCode.ACCTINFO_NOT_EXIST.getDesc());
        }
        String acctCode=tPcmAcctInfoDO.getAcctCode();
        //给订单号加行锁
        tPcmAcctInfoMapper.lockAcctInfo(acctCode);
        //验证卡状态
        checkManager.checkAcctInfo(modifyBalReqBO);
        //新增交易记录
        TPcmDealLogDO tPcmDealLogDO=addDealLog(modifyBalReqBO);
        //扣除金额
        int totalVaid=updateBal(modifyBalReqBO,tPcmAcctInfoDO);
        tPcmDealLogDO.setEndBal(totalVaid);
        updateBalToDealLog(tPcmDealLogDO);
        modifyBalRsltBO.setCardNo(acctCode);
        modifyBalRsltBO.setEndBal(totalVaid);
        return null;
    }

    /**
     * 新增交易记录
     * @param modifyBalReqBO
     * @return 0表示新增失败，1表示新增成功
     */
    private TPcmDealLogDO addDealLog(ModifyBalReqBO modifyBalReqBO){
        //验证交易流水号是否存在
        checkTradeSeq(modifyBalReqBO);

        //创建交易日志流水号
        String logSeq=creatLogSeq();

        //将余额变更请求对象转换为交易日志对象
        TPcmDealLogDO tPcmDealLogDO= TPcmDealLogConventer.modifyBalReqToDealLogDO(modifyBalReqBO);

        tPcmDealLogDO.setLogSeq(logSeq);
        int addRows=tPcmDealLogMapper.insert(tPcmDealLogDO);
        if(addRows<1){
            throw new ExternalException(
                    TradeBestpaycardErrorCode.DATABASE_INSERT_FAILED,TradeBestpaycardErrorCode.DATABASE_INSERT_FAILED.getDesc());
        }
        return tPcmDealLogDO;
    }

    /**
     * 验证交易流水号是否重复
     * @param modifyBalReqBO
     */
    private void checkTradeSeq(ModifyBalReqBO modifyBalReqBO){
        TPcmDealLogDO tPcmDealLogDO=tPcmDealLogMapper.selectByTradeSeq(modifyBalReqBO.getTradeSeq());
        if(tPcmDealLogDO!=null){
            throw new TradeBestpaycardException(
                    TradeBestpaycardErrorCode.DUIPLICAT_DEAL_LOG,TradeBestpaycardErrorCode.DUIPLICAT_DEAL_LOG.getDesc());
        }
    }

    /**
     * 创建交易日志流水号
     * @return
     */
    private String creatLogSeq(){
        String logSeq=tPcmDealLogMapper.creatLogSeq();
        return logSeq;
    }

    /**
     * 扣除订单金额
     * @param modifyBalReqBO
     * @return
     */
    private int updateBal(ModifyBalReqBO modifyBalReqBO,TPcmAcctInfoDO tPcmAcctInfoDO){
        //验证卡有效期
        Date expDate=tPcmAcctInfoDO.getExpDate();
        if(expDate.after(expDate)){
            log.warn("warn expDate:{}",expDate,TradeBestpaycardErrorCode.CARD_EXPIRED.getDesc());
            throw new ExternalException(
                    TradeBestpaycardErrorCode.CARD_EXPIRED,TradeBestpaycardErrorCode.CARD_EXPIRED.getDesc());
        }
        //验证卡余额
        int validBal=tPcmAcctInfoDO.getValidBal();
        int tradeMoney=modifyBalReqBO.getDealAmount();
        if(validBal<tradeMoney){
            log.warn("warn validBal:{}",validBal,TradeBestpaycardErrorCode.INSUFFICIENT_BALANCE.getDesc());
            throw new ExternalException(
                    TradeBestpaycardErrorCode.INSUFFICIENT_BALANCE,TradeBestpaycardErrorCode.INSUFFICIENT_BALANCE.getDesc());
        }
        validBal=tPcmAcctInfoDO.getValidBal()-tradeMoney;
        int totalBal=tPcmAcctInfoDO.getTotalBal()-tradeMoney;
        tPcmAcctInfoDO.setValidBal(validBal);
        tPcmAcctInfoDO.setTotalBal(totalBal);
        int rows=tPcmAcctInfoMapper.updateBalance(tPcmAcctInfoDO);
        if(rows<1){
            throw new ExternalException(
                    TradeBestpaycardErrorCode.DATABASE_UPDATE_FAILED,TradeBestpaycardErrorCode.DATABASE_UPDATE_FAILED.getDesc());
        }
        return totalBal;
    }

    /**
     * 更新账户余额到deal_log表
     * @param tPcmDealLogDO
     */
    private void updateBalToDealLog(TPcmDealLogDO tPcmDealLogDO){
        int updateRows=tPcmDealLogMapper.updateBal(tPcmDealLogDO);
        if(updateRows<1){
            throw new ExternalException(
                    TradeBestpaycardErrorCode.DATABASE_UPDATE_FAILED,TradeBestpaycardErrorCode.DATABASE_UPDATE_FAILED.getDesc());
        }
    }



}