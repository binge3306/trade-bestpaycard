package com.bsetpay.trade.bestpaycard.service.facade.model.request.createTradeOrderRequest;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 投递对象信息
 * Created by WUH on 2016/5/3.
 */
@Setter
@Getter
@ToString
public class DeliveryTargetInfo {
    /**
     * 投递对象类型编码
     */
    private String deliverTargetTypeCode;
    /**
     * 投递对象编码
     */
    private String deliverTargetCode;
}
