package com.bestpay.trade.bestpaycard.common.exception;

import com.bestpay.exception.ErrorCode;
import com.bestpay.trade.bestpaycard.common.utils.StringUtil;

/**
 * 外部调用异常
 * User: 黄少彬 Date: 2016/3/10 ProjectName: merchant Version: 1.0
 */
public class ExternalException extends RuntimeException {
    /**
     * 错误码信息
     */
    private ErrorCode errorCode;

    /**
     * 除了错误码本身描述的提示信息外，额外补充的信息
     */
    private String extraMsg;

    /**
     * 错误信息模板
     */
    private final static String MSG_TEMPLATE = "错误码:{0}, 描述:{1}, 异常信息:{2}";

    /**
     * 提供异常码和异常源构造异常
     *
     * @param errorCode 异常码
     * @param cause     异常原因
     * @throws NullPointerException <code>errorCode</code>不能为空，否则抛出异常
     * @see ErrorCode
     */
    public ExternalException(ErrorCode errorCode, Throwable cause) {
        this(errorCode, null, cause);
    }

    /**
     * 设置除了错误码本身描述的提示信息外，额外补充的信息
     * <p/>
     * 当错误码本身只是比较模糊的提示下，可以额外补充其他信息
     *
     * @param extraMsg 额外补充的信息
     */
    public ExternalException(ErrorCode errorCode, String extraMsg, Throwable cause) {
        super(getMessage(errorCode, extraMsg), cause);
        this.errorCode = errorCode;
        this.extraMsg = extraMsg;
    }

    /**
     * 提供异常码构造异常
     *
     * @param errorCode 异常码异常码 *
     */
    public ExternalException(String errorCode) {
        super(errorCode);
    }

    /**
     * 提供异常码构造异常
     *
     * @param errorCode 异常码异常码 *
     * @throws NullPointerException <code>errorCode</code>不能为空，否则抛出异常
     * @see ErrorCode
     */
    public ExternalException(ErrorCode errorCode) {
        this(errorCode, null, null);
    }

    /**
     * 设置除了错误码本身描述的提示信息外，额外补充的信息
     * <p/>
     * 当错误码本身只是比较模糊的提示下，可以额外补充其他信息
     *
     * @param extraMsg 额外补充的信息
     */
    public ExternalException(ErrorCode errorCode, String extraMsg) {
        this(errorCode, extraMsg, null);
    }

    /**
     * 获得异常码信息
     *
     * @return ErrorCode
     */
    public ErrorCode getErrorCode() {
        return errorCode;
    }

    /**
     * 返回除了错误码本身描述的提示信息外，额外补充的信息
     *
     * @return the extraMsg
     */
    public String getExtraMsg() {
        return extraMsg;
    }

    /**
     * 设置除了错误码本身描述的提示信息外，额外补充的信息
     *
     * @param extraMsg the extraMsg to set
     */
    public void setExtraMsg(String extraMsg) {
        this.extraMsg = extraMsg;
    }

    private static String getMessage(ErrorCode errorCode, String extraMessage) {
        extraMessage = (null != extraMessage) ? extraMessage : "";
        return StringUtil.formatMsg(MSG_TEMPLATE, errorCode.getCode(), errorCode.getDesc(), extraMessage);
    }
}
