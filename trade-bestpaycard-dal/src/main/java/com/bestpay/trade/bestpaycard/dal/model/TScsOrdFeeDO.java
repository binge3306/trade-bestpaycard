package com.bestpay.trade.bestpaycard.dal.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by WUH on 2016/5/2.
 */
@Setter
@Getter
@ToString
public class TScsOrdFeeDO {
    private Long ordFeeId;
    private String orderId;
    private String currencyCode;
    private Double primMoney;
    private Double discMoney;
    private Double dueMoney;
    private Double payMoney;
    private String stat;
}
