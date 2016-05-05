package com.bsetpay.trade.bestpaycard.service.facade.model.request.createTradeOrderRequest;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 业务单费用信息
 * Created by WUH on 2016/5/3.
 */
@Getter
@Setter
@ToString
public class BusiOrderFeeInfo {
    /**
     * 币种编码
     */
    private String currencyCode;
    /**
     * 业务单原始金额
     */
    private Double primMoney;
    /**
     * 业务单优惠金额
     */
    private Double discMoney;
    /**
     * 业务单应付金额
     */
    private Double dueMoney;
    /**
     * 费用项标识
     */
    private Long fareId;
}
