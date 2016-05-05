package com.bestpay.trade.bestpaycard.dal.mapper;

import com.bestpay.trade.bestpaycard.dal.model.TPcmAcctInfoDO;

/**
 * description:账号信息表mapper
 * <p>
 *     1、通过账户号更新账号余额信息
 *     2、通过账户号查询账户信息
 * </p>
 * User: huguangpu Date: 16/5/3 ProjectName: trade-bestpaycard Version: 1.0
 */
public interface TPcmAcctInfoMapper {


    /**
     * 通过账户号查询账户信息
     * @param acctCode
     */
    TPcmAcctInfoDO selectByAcctCode(String acctCode);

    /**
     * 更新账户余额
     * @param tPcmAcctInfoDO
     * @return
     */
    int updateBalance(TPcmAcctInfoDO tPcmAcctInfoDO);

    /**
     * 给账户信息加行锁
     * @param acctCode
     */
    void lockAcctInfo(String acctCode);

}
