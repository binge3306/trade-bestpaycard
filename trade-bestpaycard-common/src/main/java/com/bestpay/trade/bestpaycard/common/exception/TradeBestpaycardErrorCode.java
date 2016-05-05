package com.bestpay.trade.bestpaycard.common.exception;

import com.bestpay.exception.ErrorCode;

/**
 * 业务异常码
 * <p/>
 * User: huguangpu Date: 2016/05/04 ProductName:trade-bestpaycard  Version: 1.0
 */
public enum TradeBestpaycardErrorCode implements ErrorCode {

    /**
     * 参数校验不通过 ，未明确具体参数的情况使用该枚举
     */
    PARAMETER_VALID_NOT_PASS("PARAMETER_VALID_NOT_PASS", "参数校验不通过"),

    /**
     * 执行数据库操作发生异常,具体查看数据库返回的异常信息
     */
    DATA_BASE_ERROR("DATA_BASE_ERROR", "数据库操作异常"),

    /**
     * 数据更新失败
     */
    DATA_UPDATE_ERROR("DATA_UPDATE_ERROR", "数据更新失败"),

    /**
     * 系统内部错误
     */
    SYSTEM_INNER_ERROR("SYSTEM_INNER_ERROR", "系统内部错误"),

    /**
     * 调用远程返回异常
     */
    REMOTE_RETURN_ERROR_EXCEPTION("REMOTE_ERROR_EXCEPTION", "调用远程返回异常"),

    /**
     * DATABASE_INSERT_FAILED:数据插入失败
     */
    DATABASE_INSERT_FAILED("DATABASE_INSERT_FAILED", "数据插入失败"),

    /**
     * DATABASE_UPDATE_FAILED:数据更新失败
     */
    DATABASE_UPDATE_FAILED("DATABASE_UPDATE_FAILED", "数据更新失败"),
    /**
     * 原订单信息不存在
     */
    ORI_ORDER_ERROR("ORI_ORDER_ERROR", "原订单信息不存在"),

    /**
     * DATABASE_QUERY_EMPTY:数据库查询结果为空
     */
    DATABASE_QUERY_EMPTY("DATABASE_QUERY_EMPTY", "数据库查询结果为空"),

    /**
     * DUIPLICAT_ORDER_ERROR:重复下单
     */
    DUIPLICAT_ORDER_ERROR("DUIPLICAT_ORDER_ERROR", "重复下单"),

    /**
     * WAITFORPAY_REORDER_ERROR:定单为待支付状态，请直接支付
     */
    WAITFORPAY_REORDER_ERROR("WAITFORPAY_REORDER_ERROR", "定单为待支付状态，请直接支付"),

    /**
     * TYPE_CONVERSION_ERROR:类型转换失败
     */
    TYPE_CONVERSION_ERROR("TYPE_CONVERSION_ERROR", "类型转换失败"),

    /**
     * CARD_HAS_BEEN_USED:卡已被使用
     */
    CARD_HAS_BEEN_USED("CARD_HAS_BEEN_USED","卡已被使用"),

    /**
     * CARD_NOT_ACTIVE:卡未激活
     */
    CARD_NOT_ACTIVE("CARD_NOT_ACTIVE","卡未激活"),

    /**
     * CARD_LOCKED:卡被锁定
     */
    CARD_LOCKED("CARD_LOCKED","卡被锁定"),

    /**
     * CARD_HAS_BEEN_CANCELED:卡已被注销
     */
    CARD_HAS_BEEN_CANCELED("CARD_HAS_BEEN_CANCELED","卡已被注销"),

    /**
     * CARD_EXPIRED:卡已过期
     */
    CARD_EXPIRED("CARD_EXPIRED","卡已过期"),

    /**
     * INSUFFICIENT_BALANCE:账户余额不足
     */
    INSUFFICIENT_BALANCE("INSUFFICIENT_BALANCE","账户余额不足"),

    /**
     * CARD_NOT_EXIST:卡号不存在
     */
    CARD_NOT_EXIST("CARD_NOT_EXIST","卡号不存在"),

    /**
     * DUIPLICAT_DEAL_LOG:交流流水号已存在
     */
    DUIPLICAT_DEAL_LOG("DUIPLICAT_DEAL_LOG","交流流水号已存在"),

    /**
     * ACCTINFO_NOT_EXIST:卡号不存在
     */
    ACCTINFO_NOT_EXIST("ACCTINFO_NOT_EXIST","账户号不存在"),





    /**
     * zk锁资源忙
     */
    ZKLOCK_RESOURCE_BUSY("ZKLOCK_RESOURCE_BUSY", "zk锁资源忙"),

    REBACK_NOT_FOUND_ERROR("REBACK_NOT_FOUND_ERROR", "返回结果为空")
    ;


    /**
     * 异常码
     */
    private String code;

    /**
     * 异常描述
     */
    private String desc;

    TradeBestpaycardErrorCode(String code, String desc) {
        this.desc = desc;
        this.code = code;
        }

@Override
public String getCode() {
        return this.code;
        }

@Override
public String getDesc() {
        return this.desc;
        }

        }
