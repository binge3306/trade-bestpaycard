package com.bsetpay.trade.bestpaycard.service.facade.model.result;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 公共信息
 * Created by WUH on 2016/5/3.
 */
@Setter
@Getter
@ToString
public class Common {
    /**
     * 请求编码
     */
    private String responseCode;
    /**
     * 请求结果说明
     */
    private String responseMsg;
}
