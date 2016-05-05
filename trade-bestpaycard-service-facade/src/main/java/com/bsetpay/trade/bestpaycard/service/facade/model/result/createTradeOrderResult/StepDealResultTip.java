package com.bsetpay.trade.bestpaycard.service.facade.model.result.createTradeOrderResult;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 环节处理结果提示
 * Created by WUH on 2016/5/3.
 */
@Setter
@Getter
@ToString
public class StepDealResultTip {
    /**
     * 环节标识
     */
    private String stepLogo;
    /**
     * 环节名称
     */
    private String stepName;
    /**
     * 环节处理结果提示
     */
    private String stepDealResultTip;
    /**
     * 发票打印信息
     */
    private String printInvoiceInfo;
    /**
     * 发票参考号
     */
    private String invoiceReference;
}
