package com.bestpay.trade.bestpaycard.service.facade.model.result;

import com.bestpay.trade.bestpaycard.service.facade.model.BaseResultDTO;

/**
 * description:余额变更接口返回对象
 * User: huguangpu Date: 16/5/3 ProjectName: trade-bestpaycard Version: 1.0
 */
public class ModifyBalResultDTO extends BaseResultDTO{

    /**
     * 卡号
     */
    private String cardNo;

    /**
     * 交易号余额
     */
    private int endBal;
}