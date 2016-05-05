package com.bestpay.trade.bestpaycard.dal.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * Created by WUH on 2016/5/2.
 */
@Setter
@Getter
@ToString
public class TScsOrderDO {
    private String orderId;
    private String orderCode;
    private Long custId;
    private String orderType;
    private String areaCode;
    private String termId;
    private Date acctDate;
    private Date beginDate;
    private Date endDate;
    private Date effDate;
    private String loginType;
    private String stat;
    private String payStat;
    private String actStat;
    private String memo;
    private String termSeq;
    private String operOrig;
    private String operStat;
    private String channelType;
    private String extOrderId;
    private String srcOrderId;
    private String oldStat;
    private String oldPayStat;
    private String oldActStat;
    private String retCode;
    private String retMsg;
    private String extValue1;
    private String extValue2;
    private String extValue3;
    private String extValue4;
}
