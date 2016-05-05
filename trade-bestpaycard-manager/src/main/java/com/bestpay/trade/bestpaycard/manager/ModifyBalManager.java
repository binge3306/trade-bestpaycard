package com.bestpay.trade.bestpaycard.manager;

import com.bestpay.trade.bestpaycard.manager.model.ModifyBalReqBO;
import com.bestpay.trade.bestpaycard.manager.model.ModifyBalRsltBO;

/**
 * description:变更余额manager
 * <p>
 *     1、执行余额变更
 * </p>
 * User: huguangpu Date: 16/5/3 ProjectName: trade-bestpaycard Version: 1.0
 */
public interface ModifyBalManager {

    /**
     * 执行余额变更
     * @param modifyBalReqBO
     */
    ModifyBalRsltBO executeModifyBal(ModifyBalReqBO modifyBalReqBO);



}
