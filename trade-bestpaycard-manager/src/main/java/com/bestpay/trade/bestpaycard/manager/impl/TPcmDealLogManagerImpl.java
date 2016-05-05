package com.bestpay.trade.bestpaycard.manager.impl;

import com.bestpay.trade.bestpaycard.manager.TPcmDealLogManager;

/**
 * description:交易日志manager
 * <p>
 *     1、新增一笔新的交易记录
 *     2、通过logSeq号更新交易金额和交易结果
 * </p>
 * User: huguangpu Date: 16/5/3 ProjectName: trade-bestpaycard Version: 1.0
 */
public class TPcmDealLogManagerImpl implements TPcmDealLogManager{

    /**
     * 新增一笔新的交易记录
     * @param tPcmDealLogBO
     * @return 1代表新增成功，0代表新增失败
     */
    public int addDealLog(TPcmDealLogBO tPcmDealLogBO) {
        return 0;
    }

    /**
     * 通过logSeq号更新交易金额和交易结果
     * @param tPcmDealLogBO
     * @return 0代表更新成功，0代表更新失败
     */
    public int updateBalAndResult(TPcmDealLogBO tPcmDealLogBO) {
        return 0;
    }
}