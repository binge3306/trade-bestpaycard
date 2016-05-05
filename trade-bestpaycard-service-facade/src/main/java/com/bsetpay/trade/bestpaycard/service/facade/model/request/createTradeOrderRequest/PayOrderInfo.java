package com.bsetpay.trade.bestpaycard.service.facade.model.request.createTradeOrderRequest;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 支付单信息表
 * Created by WUH on 2016/5/3.
 */
@Getter
@Setter
@ToString
public class PayOrderInfo {
    /**
     * 支付方式编码
     */
    private String payType;
    /**
     * 支付机构编码
     */
    private String payOrg;
    /**
     * 账户类型编码
     */
    private String acctTypeCode;
    /**
     * 开户名称
     */
    private String acctName;
    /**
     * 账号
     */
    private String acctCode;
    /**
     * 支付密码
     */
    private String acctPwd;
    /**
     * 扣款序号
     */
    private Long paySeq;
    /**
     * 币种编码
     */
    private String currencyCode;
    /**
     * 支付金额
     */
    private Double payMoney;
    /**
     * 介质类型编码
     */
    private String mediaType;
    /**
     * 介质标识
     */
    private String mediaId;
    /**
     * 国际网络号
     */
    private String netCode;

    /**
     * 我方发出流水号
     */
    private String sendId;
    /**
     * 卡类型
     */
    private String cardType;
    /**
     *
     */
    private String srcEventSeq;
    /**
     * 前置支付机构
     */
    private String infPayOrg;
}
