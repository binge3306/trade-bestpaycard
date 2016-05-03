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
    private Integer ordFeeId;
    private String orderId;
    private String currencyCode;
    private Integer primMoney;
    private Integer discMoney;
    private Integer dueMoney;
    private Integer payMoney;
    private String stat;
}
