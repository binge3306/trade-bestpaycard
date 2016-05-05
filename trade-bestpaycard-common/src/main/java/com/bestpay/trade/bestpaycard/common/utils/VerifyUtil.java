package com.bestpay.trade.bestpaycard.common.utils;

import com.bestpay.trade.bestpaycard.common.exception.TradeBestpaycardErrorCode;
import com.bestpay.trade.bestpaycard.common.exception.TradeBestpaycardException;
import net.sf.oval.ConstraintViolation;
import net.sf.oval.Validator;
import org.apache.commons.lang3.StringUtils;

import java.util.List;


/**
 * 参数校验服务
 * <p>
 * 1、请求参数非空、格式验证，请求对象
 * 2、校验参数是否非空
 * 3、字符串参数是否非空
 * 4、检查数据库更新记录操作数
 * 5、字符串参数长度校验
 * </p>
 * User: wen Date: 2014/09/25 ProductName: agreement Version: 1.0
 * User: LZQ Date: 2014/09/25 ProductName: agreement Version: 1.0
 * User: shenbobo Date: 2015/08/10 ProductName: agreement Version: 1.0
 */
public class VerifyUtil {

    private static Validator validator = new Validator();

    /**
     * 1、请求参数非空、格式验证，请求对象
     *
     * @param object 请求校验参数
     */
    public static void validateObject(Object object) throws TradeBestpaycardException {
        List<ConstraintViolation> list = validator.validate(object);
        if (null != list && !list.isEmpty()) {
            throw new TradeBestpaycardException(TradeBestpaycardErrorCode.PARAMETER_VALID_NOT_PASS,
                    list.get(0).getMessage());
        }
    }

    /**
     * 2、校验参数是否非空
     *
     * @param object 待验证对象
     * @throws TradeBestpaycardException 参数为空
     */
    public static void validateNull(Object object) throws TradeBestpaycardException {
        if (object == null) {
            throw new TradeBestpaycardException(TradeBestpaycardErrorCode.PARAMETER_VALID_NOT_PASS);
        }
    }

    /**
     * 3、字符串参数是否非空
     *
     * @param params 待验证参数
     * @throws TradeBestpaycardException 参数为空
     */
    public static void validateStringNull(String... params) throws TradeBestpaycardException {
        for (String param : params) {
            if (StringUtils.isEmpty(param)) {
                throw new TradeBestpaycardException(TradeBestpaycardErrorCode.PARAMETER_VALID_NOT_PASS);
            }
        }
    }

    /**
     * 4、检查数据库更新记录操作数
     *
     * @param updNum 更新数
     */
    public static void checkUpdNum(int updNum) {
        if (updNum < 1) {
            throw new TradeBestpaycardException(TradeBestpaycardErrorCode.DATABASE_UPDATE_FAILED);
        }
    }

    /**
     * 5、字符串参数长度校验
     *
     * @param param 待验证参数
     * @throws TradeBestpaycardException
     */
    public static void validateStringLength(String param, int maxLenth) throws TradeBestpaycardException {
        if (StringUtils.isNotEmpty(param) && param.length() > maxLenth) {
            throw new TradeBestpaycardException(TradeBestpaycardErrorCode.PARAMETER_VALID_NOT_PASS,
                    param + "超过最大长度：" + maxLenth);
        }
    }

}


