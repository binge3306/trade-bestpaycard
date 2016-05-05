package com.bsetpay.trade.bestpaycard.service.facade.model.request;

import com.bsetpay.trade.bestpaycard.service.facade.model.request.createTradeOrderRequest.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * 创建交易订单请求数据模型
 * Created by WUH on 2016/5/3.
 */
@Setter
@Getter
@ToString
public class CreateTradeOrderRequestDTO {
    /**
     * 订单受理信息
     */
    private OrderAcceptInfo orderAcceptInfo;
    /**
     * 订单费用信息
     */
    private List<OrderFeeInfo> orderFeeInfoList;
    /**
     * 业务单信息
     */
    private List<BusiOrderInfo> busiOrderInfoList;
    /**
     * 业务单费用信息
     */
    private List<BusiOrderFeeInfo> busiOrderFeeInfoList;
    /**
     * 产品属性信息
     */
    private List<ProdPropertyInfo> prodPropertyInfoList;
    /**
     * 业务属性信息
     */
    private List<BusiPropertyInfo> busiPropertyInfoList;
    /**
     * 支付单信息
     */
    private List<PayOrderInfo> payOrderInfoList;
    /**
     * 投递信息
     */
    private DeliveryInfo deliveryInfo;
    /**
     * 投递对象信息
     */
    private List<DeliveryTargetInfo> targetInfoList;
}
