package com.bestpay.trade.bestpaycard.dal.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * 支付信息表模型
 * Created by WUH on 2016/5/3.
 */
@Getter
@Setter
@ToString
public class TScsPaymentDO {
    /*支付单号*/
    private String paymentId;
    /*所属订单号*/
    private String orderId;
    /*支付方式编码*/
    private String payType;
    /*支付机构编码*/
    private String payOrg;
    /*账户类型编码*/
    private String acctTypeCode;
    /*开户名称*/
    private String acctName;
    /*账号*/
    private String acctCode;
    /*支付密码*/
    private String acctPwd;
    /*扣款序号*/
    private Long paySeq;
    /*币种编码*/
    private String currencyCode;
    /*支付金额*/
    private Double payMoney;
    /*介质类型编码*/
    private String mediaType;
    /*介质标识*/
    private String mediaId;
    /*磁道2信息*/
    private String trackNo2;
    /*磁道3信息*/
    private String trackNo3;
    /*国际网络号*/
    private String netCode;
    /*支付单生成时间*/
    private Date createDate;
    /*开始处理时间*/
    private Date beginDate;
    /*处理结束时间*/
    private Date endDate;
     /*S0A:未支付,S0D:处理中,S0S:支付成功,S0F:支付失败,S0R:已冲正,S0T:已退款,S0E:支付超时*/
    private String stat;
    /*对方返回流水号*/
    private String retId;
    /*对方返回时间*/
    private Date retDate;
    /*对方返回结果*/
    private String retCode;
    /*对方返回信息*/
    private String retMsg;
    /*系统参考号*/
    private String eventSeq;
    /*我方发出流水号*/
    private String sendId;
    /*卡类型*/
    private String cardType;
    /**/
    private String srcEventSeq;
    /*子支付机构*/
    private String pgwPayOrg;
    /*前置支付机构*/
    private String infPayOrg;
}
