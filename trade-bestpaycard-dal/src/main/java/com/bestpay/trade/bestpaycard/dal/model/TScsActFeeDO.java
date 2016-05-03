package com.bestpay.trade.bestpaycard.dal.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.nio.DoubleBuffer;

/**
 * Created by WUH on 2016/5/2.
 */
@Setter
@Getter
@ToString
public class TScsActFeeDO {
    private Long actFeeId;
    private String orderId;
    private String actListId;
    private String currencyCode;
    private Double primMoney;
    private Double discMoney;
    private Double dueMoney;
    private Double payMoney;
    private String stat;
    private Long fareId;
}
