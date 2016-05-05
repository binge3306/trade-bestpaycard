package com.bsetpay.trade.bestpaycard.service.facade.model.result.createTradeOrderResult;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 查询交易明细信息
 * Created by WUH on 2016/5/3.
 */
@Setter
@Getter
@ToString
public class TradeDetailInfo {
    /**
     * 明细项标识
     */
    private String detailLogo;
    /**
     * 明细项标识
     */
    private String detailName;
    /**
     * 明细项数据类型
     */
    private String detailDataType;
    /**
     * 明细项内容
     */
    private String detailContent;
    /**
     * 显示标志
     */
    private Boolean isDisplay;
    /**
     * 控制标志
     */
    private Boolean needControl;
}
