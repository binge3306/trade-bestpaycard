package com.bestpay.trade.bestpaycard.manager.impl;

import com.bestpay.trade.bestpaycard.common.exception.ExternalException;
import com.bestpay.trade.bestpaycard.common.exception.TradeBestpaycardErrorCode;
import com.bestpay.trade.bestpaycard.dal.mapper.TPcmAcctInfoMapper;
import com.bestpay.trade.bestpaycard.dal.mapper.TPcmInfoMapper;
import com.bestpay.trade.bestpaycard.dal.model.TPcmAcctInfoDO;
import com.bestpay.trade.bestpaycard.dal.model.TPcmInfoDO;
import com.bestpay.trade.bestpaycard.manager.CheckManager;
import com.bestpay.trade.bestpaycard.manager.model.ModifyBalReqBO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * 验证接口
 * <p>
 *      1、卡信息验证
 * </p>
 * User: huguangpu Date: 2016/05/04 ProjectName: Trade-Bestpaycard Version: 1.0
 */@Slf4j
public class CheckManagerImpl implements CheckManager {


    @Autowired
    TPcmInfoMapper tPcmInfoMapper;

    @Autowired
    TPcmAcctInfoMapper tPcmAcctInfoMapper;

    /**
     * 验证账号信息
     * @param modifyBalReqBO
     * @return
     */
    public void checkAcctInfo(ModifyBalReqBO modifyBalReqBO) {
        String acctCode=modifyBalReqBO.getCardNo();
        TPcmInfoDO tPcmInfoDO=tPcmInfoMapper.selectByCardNo(acctCode);
        //验证卡是否存在
        if(tPcmInfoDO==null){
            throw new ExternalException(
                    TradeBestpaycardErrorCode.CARD_NOT_EXIST,TradeBestpaycardErrorCode.CARD_NOT_EXIST.getDesc());
        }
        //验证卡状态
        String stat=tPcmInfoDO.getCardState();
        if(stat.equals("20E")){
            log.warn("warn cardStat:{}",stat, TradeBestpaycardErrorCode.CARD_HAS_BEEN_USED.getDesc());
            throw new ExternalException(
                    TradeBestpaycardErrorCode.CARD_HAS_BEEN_USED,TradeBestpaycardErrorCode.CARD_HAS_BEEN_USED.getDesc());
        }
        if(stat.equals("20U")){
            log.warn("warn cardStat:{}",stat, TradeBestpaycardErrorCode.CARD_NOT_ACTIVE.getDesc());
            throw new ExternalException(
                    TradeBestpaycardErrorCode.CARD_NOT_ACTIVE,TradeBestpaycardErrorCode.CARD_NOT_ACTIVE.getDesc());
        }
        if(stat.equals("20F")){
            log.warn("warn cardStat:{}",stat,TradeBestpaycardErrorCode.CARD_LOCKED.getDesc());
            throw new ExternalException(
                    TradeBestpaycardErrorCode.CARD_LOCKED,TradeBestpaycardErrorCode.CARD_LOCKED.getDesc());
        }
        if(stat.equals("20W")){
            log.warn("warn cardStat:{}",stat,TradeBestpaycardErrorCode.CARD_HAS_BEEN_CANCELED.getDesc());
            throw new ExternalException(
                    TradeBestpaycardErrorCode.CARD_HAS_BEEN_CANCELED,TradeBestpaycardErrorCode.CARD_HAS_BEEN_CANCELED.getDesc());
        }
    }
}