package com.bestpay.trade.bestpaycard.dal.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * description:交易日志表模型
 * User: huguangpu Date: 16/5/3 ProjectName: trade-bestpaycard Version: 1.0
 */
@Getter
@Setter
@ToString(callSuper = true)
public class TPcmDealLogDO extends BaseDO{

    /**
     * 事件流水号
     */
    private String logSeq;

    /**
     * 交易流水号
     */
    private String tradeSeq;

    /**
     * 卡号
     */
    private String cardNo;

    /**
     * 交易代码
     */
    private String dealCode;

    /**
     * 收支标记
     */
    private String loanFlag;

    /**
     * 交易金额
     */
    private int dealAmount;

    /**
     * 交易后金额
     */
    private int endBal;

    /**
     * 渠道类型
     */
    private String channelType;

    /**
     * 交易来源
     */
    private String dealSrc;

    /**
     * 交易日期（MMDD格式）
     */
    private String dealDate;

    /**
     * 交易时间（HH24MISS格式字串）
     */
    private String dealTime;

    /**
     * 交易记录时间
     */
    private Date recordDate;

    /**
     * 交易结果编码
     */
    private String resultCode;

    /**
     * 交易结果说明
     */
    private String resultInfo;

    /**
     * 备注说明
     */
    private String Memo;

    /**
     * 原事件流水号
     */
    private String srcLogSeq;

    /**
     * 原交易流水号
     */
    private String srcTradeSeq;

    /**
     * 订单号
     */
    private String orderId;

    /**
     * 账号代码
     */
    private String acctCode;

    /**
     * 卡类型
     */
    private String cardType;



}