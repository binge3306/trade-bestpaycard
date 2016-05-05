package com.bestpay.trade.bestpaycard.manager.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * description:余额变更结果BO
 * User: huguangpu Date: 16/5/4 ProjectName: trade-bestpaycard Version: 1.0
 */
@Getter
@Setter
@ToString(callSuper = true)
public class ModifyBalRsltBO extends BaseBO{

    /**
     * 卡号
     */
    private String cardNo;

    /**
     * 交易号余额
     */
    private int endBal;
}