package com.bestpay.trade.bestpaycard.dal.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * Created by WUH on 2016/5/2.
 */
@Getter
@Setter
@ToString
public class TScsActListDO {
    private String actListId;
    private Long actListSeq;
    private String orderId;
    private Long custId;
    private Long prodId;
    private Long actionId;
    private String objCode;
    private Long objCount;
    private Date createDate;
    private Date beginDate;
    private Date endDate;
    private String stat;
    private String retId;
    private Date retDate;
    private String retCode;
    private String retMsg;
    private String eventSeq;
    private String qryEventSeq;
    private String srcEventSeq;
    private Long sagActionId;
    private Long infActionId;
}
