package com.bestpay.trade.bestpaycard.manager.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * description:余额变更请求对象BO
 * User: huguangpu Date: 16/5/4 ProjectName: trade-bestpaycard Version: 1.0
 */

@Setter
@Getter
@ToString(callSuper = true)
public class ModifyBalReqBO extends BaseBO{


    /**
     * 卡号
     */
    private String cardNo;

    /**
     * 卡密码
     */
    private String cardPwd;

    /**
     * 交易流水号
     */
    private String tradeSeq;

    /**
     * 交易类型
     */
    private String dealCode;

    /**
     * 渠道类型
     */
    private String channelType;

    /**
     * 交易来源
     */
    private String dealSrc;

    /**
     * 订单号
     */
    private String orderId;

    /**
     * 交易金额
     */
    private int dealAmount;

    /**
     * 账号类型
     */
    private String acctType;
}