package com.bsetpay.trade.bestpaycard.service.facade.model.request.createTradeOrderRequest;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 业务属性信息
 * Created by WUH on 2016/5/3.
 */
@Setter
@Getter
@ToString
public class BusiPropertyInfo {
    /**
     * 属性值1
     */
    private String value1;
    /**
     * 属性值2
     */
    private String value2;
    /**
     * 属性值3
     */
    private String value3;
    /**
     * 属性值4
     */
    private String value4;
}
