package com.bsetpay.trade.bestpaycard.service.facade.model.result.createTradeOrderResult;

import java.util.Date;

/**
 * 订单受理信息
 * Created by WUH on 2016/5/3.
 */
public class OrderAcceptanceInfo {
    /**
     * 订单编码
     */
    private String orderCode;
    /**
     * 客户编码
     */
    private String custCode;
    /**
     * 客户名称
     */
    private String custName;
    /**
     * 订单完成时间
     */
    private Date finishTime;
    /**
     * 支付系统参考号
     */
    private String paySystemRefNo;
    /**
     * 环节处理结果编码
     */
    private String resultCode;
}
