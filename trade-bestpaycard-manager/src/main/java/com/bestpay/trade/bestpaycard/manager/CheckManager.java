package com.bestpay.trade.bestpaycard.manager;

import com.bestpay.trade.bestpaycard.dal.model.TPcmAcctInfoDO;
import com.bestpay.trade.bestpaycard.manager.model.ModifyBalReqBO;

/**
 * 验证接口
 * <p>
 *      1、卡信息验证
 * </p>
 * User: huguangpu Date: 2016/05/04 ProjectName: Trade-Bestpaycard Version: 1.0
 */
public interface CheckManager {

    /**
     * 卡信息验证
     * @param modifyBalReqBO
     */
    void checkAcctInfo(ModifyBalReqBO modifyBalReqBO);
}
