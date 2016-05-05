package com.bestpay.trade.bestpaycard.manager;

/**
 * description:账户余额变更manager
 * <p>
 *     1、通过账户号更新账号余额信息
 *     2、通过账户号查询账户信息
 * </p>
 * User: huguangpu Date: 16/5/3 ProjectName: trade-bestpaycard Version: 1.0
 */
public interface TPcmAcctInfoManager {

    /**
     * 通过账户号更改余额
     * @param tPcmAcctInfoBO
     */
    int updateAcctBal(TPcmAcctInfoBO tPcmAcctInfoBO);

    /**
     * 通过账户号查询账户信息
     * @param acctCode
     */
    TPcmAcctInfoBO selectByAcctCode(String acctCode);


}
