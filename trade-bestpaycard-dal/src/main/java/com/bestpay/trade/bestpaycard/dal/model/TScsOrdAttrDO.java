package com.bestpay.trade.bestpaycard.dal.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 订单属性模型
 * Created by WUH on 2016/5/2.
 */
@Getter
@Setter
@ToString
public class TScsOrdAttrDO {
    private String ordAttrId;
    private String orderId;
    private Integer AttrId;
    private String Value1;
    private String Value2;
    private String Value3;
    private String Value4;
    private String Stat;
}
