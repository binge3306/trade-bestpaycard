package com.bsetpay.trade.bestpaycard.service.facade.model.result.createTradeOrderResult;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 发票项信息
 * Created by WUH on 2016/5/3.
 */
@Setter
@Getter
@ToString
public class InvoiceItemInfo {
    /**
     * 发票项标识
     */
    private String invoiceItemLogo;
    /**
     * 发票项名称
     */
    private String invoiceItemName;
    /**
     * 发票项内容
     */
    private String invoiceItemContent;
}
