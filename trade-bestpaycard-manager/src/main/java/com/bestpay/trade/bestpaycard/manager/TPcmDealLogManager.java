package com.bestpay.trade.bestpaycard.manager;

/**
 * description:交易日志manager
 * <p>
 *     1、新增一笔新的交易记录
 *     2、通过logSeq号更新交易金额和交易结果
 * </p>
 * User: huguangpu Date: 16/5/3 ProjectName: trade-bestpaycard Version: 1.0
 */
public interface TPcmDealLogManager {

    /**
     * 新增一笔新的交易记录
     * @param tPcmDealLogBO
     */
    int addDealLog(TPcmDealLogBO tPcmDealLogBO);

    /**
     * 通过logSeq号更新交易金额和交易结果
     * @param tPcmDealLogBO
     */
    int updateBalAndResult(TPcmDealLogBO tPcmDealLogBO);
}
