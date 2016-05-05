package com.bsetpay.trade.bestpaycard.service.facade.model.request.createTradeOrderRequest;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 投递英语
 * Created by WUH on 2016/5/3.
 */
@Setter
@Getter
@ToString
public class DeliveryInfo {
    /**
     * 客户编码
     */
    private String custCode;
    /**
     * 投递地址
     */
    private String deliverAddress;
    /**
     * 标志性建筑物
     */
    private String landMark;
    /**
     * 邮编
     */
    private String postCode;
    /**
     * 收件人
     */
    private String recipient;
    /**
     * 收件人手机
     */
    private String recipientMobile;
    /**
     * 收件人电话
     */
    private String recipientPhone;
    /**
     * 备注信息
     */
    private String comment;
    /**
     * 收件人证件类型编码
     */
    private String certificateType;
    /**
     * 收件人证件号码
     */
    private String certificateNo;
}
