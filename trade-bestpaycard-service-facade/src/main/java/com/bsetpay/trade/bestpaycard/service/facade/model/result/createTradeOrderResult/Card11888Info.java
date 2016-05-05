package com.bsetpay.trade.bestpaycard.service.facade.model.result.createTradeOrderResult;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 11888卡信息
 * Created by WUH on 2016/5/3.
 */
@Setter
@Getter
@ToString
public class Card11888Info {
    /**
     * 余额
     */
    private Double balance;
    /**
     * 消费金额
     */
    private Double consumeAmount;
    /**
     * 卡号
     */
    private String cardNo;
}
