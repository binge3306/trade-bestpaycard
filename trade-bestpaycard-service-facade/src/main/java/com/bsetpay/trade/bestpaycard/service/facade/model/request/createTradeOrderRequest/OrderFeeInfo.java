package com.bsetpay.trade.bestpaycard.service.facade.model.request.createTradeOrderRequest;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 订单费用信息表
 * Created by WUH on 2016/5/3.
 */
@Setter
@Getter
@ToString
public class OrderFeeInfo {
    /**
     * 币种编码
     */
    private String currencyCode;
    /**
     * 订单原始金额
     */
    private Double primMoney;
    /**
     * 订单优惠金额
     */
    private Double discMoney;
    /**
     * 订单应付金额
     */
    private Double dueMoney;
}
