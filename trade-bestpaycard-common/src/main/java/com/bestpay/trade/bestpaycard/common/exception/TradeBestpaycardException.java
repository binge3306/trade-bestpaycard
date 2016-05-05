package com.bestpay.trade.bestpaycard.common.exception;

import com.bestpay.exception.BaseException;
import com.bestpay.exception.ErrorCode;

/**
 * 异常
 *
 * User: wen Date: 2015/08/06 Project: TradeProdAcquiring Version: 1.0
 */
public class TradeBestpaycardException extends BaseException {

    public TradeBestpaycardException(ErrorCode errorCode, Throwable cause) {
        this(errorCode, null, cause);
    }

    public TradeBestpaycardException(ErrorCode errorCode, String extraMsg, Throwable cause) {
        super(errorCode, extraMsg, cause);
    }

    public TradeBestpaycardException(ErrorCode errorCode) {
        this(errorCode, null, null);
    }

    public TradeBestpaycardException(ErrorCode errorCode, String extraMsg) {
        this(errorCode, extraMsg, null);
    }

}
