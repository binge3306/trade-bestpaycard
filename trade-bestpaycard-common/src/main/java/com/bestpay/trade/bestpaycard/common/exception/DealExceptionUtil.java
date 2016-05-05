package com.bestpay.trade.bestpaycard.common.exception;

import com.bestpay.dubbo.result.Result;
import org.apache.commons.lang3.StringUtils;


/**
 * 统一异常处理
 */
public class DealExceptionUtil {

    /**
     * 统一异常处理
     *
     * @param err 异常
     * @return 外部响应对象
     */
    public static <T> Result<T> doExceptionService(Throwable err) {

        if (err instanceof ExternalException) {
            ExternalException e = (ExternalException) err;
            return new Result<T>(e.getErrorCode().getCode(),
                    StringUtils.isBlank(e.getExtraMsg()) ? e.getErrorCode().getDesc() : e.getExtraMsg());
        }
        if (err instanceof TradeBestpaycardException) {
            TradeBestpaycardException e = (TradeBestpaycardException) err;
            return new Result<T>(e.getErrorCode().getCode(),
                    StringUtils.isBlank(e.getExtraMsg()) ? e.getErrorCode().getDesc() : e.getExtraMsg());
        }
        if (err instanceof IllegalArgumentException) {
            return new Result<T>(TradeBestpaycardErrorCode.PARAMETER_VALID_NOT_PASS.getCode(),
                    TradeBestpaycardErrorCode.PARAMETER_VALID_NOT_PASS.getDesc());
        }
        return new Result<T>(TradeBestpaycardErrorCode.SYSTEM_INNER_ERROR.getCode(), TradeBestpaycardErrorCode.SYSTEM_INNER_ERROR.getDesc());
    }
}
