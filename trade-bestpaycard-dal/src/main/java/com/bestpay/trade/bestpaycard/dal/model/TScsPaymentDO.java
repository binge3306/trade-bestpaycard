package com.bestpay.trade.bestpaycard.dal.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * Created by WUH on 2016/5/3.
 */
@Getter
@Setter
@ToString
public class TScsPaymentDO {
    private String paymentId;
    private String orderId;
    private String payType;
    private String payOrg;
    private String acctTypeCode;
    private String acctName;
    private String acctCode;
    private String acctPwd;
    private Long paySeq;
    private String currencyCode;
    private Double payMoney;
    private String mediaType;
    private String mediaId;
    private String trackNo2;
    private String trackNo3;
    private String netCode;
    private Date createDate;
    private Date beginDate;
    private Date endDate;
    private String stat;
    private String retId;
    private Date retDate;
    private String retCode;
    private String retMsg;
    private String eventSeq;
    private String sendId;
    private String cardType;
    private String srcEventSeq;
    private String pgwPayOrg;
    private String infPayOrg;
}
