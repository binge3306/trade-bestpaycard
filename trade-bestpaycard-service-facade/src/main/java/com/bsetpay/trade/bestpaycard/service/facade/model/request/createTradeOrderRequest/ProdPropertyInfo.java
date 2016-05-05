package com.bsetpay.trade.bestpaycard.service.facade.model.request.createTradeOrderRequest;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 产品属性信息
 * Created by WUH on 2016/5/3.
 */
@Getter
@Setter
@ToString
public class ProdPropertyInfo {
    /**
     * 产品编码
     */
    private Long prodId;
    /**
     * 产品属性编码
     */
    private Long attrId;
    /**
     * 属性值1
     */
    private String prodAttrValue1;
    /**
     * 属性值2
     */
    private String prodAttrValue2;
}
