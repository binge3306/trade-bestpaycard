package com.bestpay.trade.bestpaycard.manager.impl;

import com.bestpay.trade.bestpaycard.common.exception.ExternalException;
import com.bestpay.trade.bestpaycard.common.exception.TradeBestpaycardErrorCode;
import com.bestpay.trade.bestpaycard.dal.mapper.TPcmAcctInfoMapper;
import com.bestpay.trade.bestpaycard.dal.model.TPcmAcctInfoDO;
import com.bestpay.trade.bestpaycard.manager.TPcmAcctInfoManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * description:账户余额变更manager
 * <p>
 *     1、通过账户号更新账号余额信息
 * </p>
 * User: huguangpu Date: 16/5/3 ProjectName: trade-bestpaycard Version: 1.0
 */
@Slf4j
public class TPcmAcctInfoManagerImpl implements TPcmAcctInfoManager{

    @Autowired
    TPcmAcctInfoMapper tPcmAcctInfoMapper;
    /**
     * 通过账户号更改余额
     * @param tPcmAcctInfoBO
     * @return 1代表更新成功，0代表更新失败
     */
    public int updateAcctBal(TPcmAcctInfoBO tPcmAcctInfoBO) {
        return 0;
    }

    /**
     * 通过账户号查询账户信息
     * @param acctCode
     * @return TPcmAcctInfoBO
     */
    public TPcmAcctInfoBO selectByAcctCode(String acctCode) {
        TPcmAcctInfoDO tPcmAcctInfoDO=tPcmAcctInfoMapper.selectByAcctCode(acctCode);
        if(tPcmAcctInfoDO==null){
            log.warn("warn tPcmAcctInfoDO:{}",tPcmAcctInfoDO, TradeBestpaycardErrorCode.CARD_NOT_EXIST.getDesc());
            throw new ExternalException(
                    TradeBestpaycardErrorCode.CARD_NOT_EXIST,TradeBestpaycardErrorCode.CARD_NOT_EXIST.getDesc());
        }
        TPcmAcctInfoBO tPcmAcctInfoBO= BeanMapperUtil.objConvert(tPcmAcctInfoDO,TPcmAcctInfoBO.class);
        return tPcmAcctInfoBO;
    }
}