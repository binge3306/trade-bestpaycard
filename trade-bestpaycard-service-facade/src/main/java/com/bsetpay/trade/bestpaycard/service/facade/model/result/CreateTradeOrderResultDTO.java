package com.bsetpay.trade.bestpaycard.service.facade.model.result;

import com.bsetpay.trade.bestpaycard.service.facade.model.result.createTradeOrderResult.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * 创建交易订单返回数据模型
 * Created by WUH on 2016/5/3.
 */
@Setter
@Getter
@ToString
public class CreateTradeOrderResultDTO {
    /**
     * 公共信息
     */
    private Common common;
    /**
     * 订单受理信息
     */
    private OrderAcceptanceInfo orderAcceptanceInfo;
    /**
     * 支付信息
     */
    private PayInfo payInfo;
    /**
     * 11888卡信息
     */
    private Card11888Info card11888Info;
    /**
     * 环节处理结果提示
     */
    private List<StepDealResultTip> tipList;
    /**
     * 发票项信息
     */
    private List<InvoiceItemInfo> itemInfoList;
    /**
     * 查询交易明细信息
     */
    private List<TradeDetailInfo> detailInfoList;
}
