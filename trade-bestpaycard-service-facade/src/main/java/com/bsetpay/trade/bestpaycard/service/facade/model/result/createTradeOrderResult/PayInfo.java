package com.bsetpay.trade.bestpaycard.service.facade.model.result.createTradeOrderResult;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 支付信息
 * Created by WUH on 2016/5/3.
 */
@Setter
@Getter
@ToString
public class PayInfo {
    /**
     * 账号余额
     */
    private String accountBalance;
}
