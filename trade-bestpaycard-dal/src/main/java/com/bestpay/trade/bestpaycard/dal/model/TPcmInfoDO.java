package com.bestpay.trade.bestpaycard.dal.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * description:卡模型
 * User: huguagnpu Date: 16/5/5 ProjectName: trade-bestpaycard Version: 1.0
 */
@Getter
@Setter
@ToString(callSuper = true)
public class TPcmInfoDO extends BaseDO{

    /**
     * 卡号
     */
    private String cardNO;

    /**
     * 卡序列号
     */
    private String cardSeqId;

    /**
     * 卡状态
     */
    private String cardState;

    /**
     * 卡密码
     */
    private String cardPwd;

    /**
     * 卡面值
     */
    private int cardValue;

    /**
     * 制卡时间
     */
    private Date createDate;

    /**
     * 失效时间
     */
    private Date expDate;

    /**
     * 生效时间
     */
    private Date effDate;

    /**
     * 卡类型标识
     */
    private int cardTypeId;

    /**
     * 卡延期标识
     */
    private int prolongFlag;

    /**
     * 制卡订单号
     */
    private String orderSeq;

    /**
     * 售卡标识
     */
    private int sellFlag;
}