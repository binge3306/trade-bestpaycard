package com.bsetpay.trade.bestpaycard.service.facade.model.request.createTradeOrderRequest;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * 订单受理信息表
 * Created by WUH on 2016/5/3.
 */
@Getter
@Setter
@ToString
public class OrderAcceptInfo {
    /**
     * 订单编码
     */
    private String orderCode;
    /**
     * 客户标识
     */
    private Long custId;
    /**
     * 业务类型
     */
    private String orderType;
    /**
     * 区域编码
     */
    private String areaCode;
    /**
     * 受理终端号
     */
    private String termId;
    /**
     * 登陆认证方式
     */
    private String loginType;
    /**
     * 备注
     */
    private String memo;
    /**
     * 终端流水号
     */
    private String termSeq;
    /**
     * 操作原始来源
     */
    private String operOrig;
    /**
     * 渠道类型
     */
    private String channelType;
}
