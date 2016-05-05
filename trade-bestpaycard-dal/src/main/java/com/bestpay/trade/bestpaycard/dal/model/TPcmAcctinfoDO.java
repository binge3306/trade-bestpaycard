package com.bestpay.trade.bestpaycard.dal.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * description:账户信息表模型
 * User: mac Date: 16/5/3 ProjectName: trade-bestpaycard Version: 1.0
 */
@Getter
@Setter
@ToString(callSuper = true)
public class TPcmAcctInfoDO extends BaseDO{

    /**
     * 账户号
     */
    private String acctCode;

    /**
     * 账户类型
     */
    private String acctType;

    /**
     * 币种类型
     */
    private String currencyCode;

    /**
     * 币种单位
     */
    private String currencyUnit;

    /**
     * 账号密码
     */
    private String acctPwd;

    /**
     * 账号消费次数限制
     */
    private int timeLmt;

    /**
     * 账号消费日限额
     */
    private int dayLmt;

    /**
     * 账户消费总限制
     */
    private int totalLmt;

    /**
     * 账户余额
     */
    private int totalBal;

    /**
     * 账户可用余额
     */
    private int validBal;

    /**
     * 账户冻结余额
     */
    private int frozenBal;

    /**
     * 状态
     */
    private String stat;

    /**
     * 状态原因
     */
    private String statReason;

    /**
     * 账户有效起始日期
     */
    private Date effDate;

    /**
     * 账户有效截止日期
     */
    private Date expDate;

    /**
     * 账户初始金额
     */
    private int initBal;
}
