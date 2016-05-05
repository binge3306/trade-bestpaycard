package com.bsetpay.trade.bestpaycard.service.facade.model.request.createTradeOrderRequest;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.libs.com.zwitserloot.cmdreader.Sequential;

/**
 * 业务单信息模型
 * Created by WUH on 2016/5/3.
 */
@Getter
@Setter
@ToString
public class BusiOrderInfo {
    /**
     * 业务单序号
     */
    private Long actListSeq;
    /**
     * 产品标识
     */
    private Long prodId;
    /**
     * 业务标识
     */
    private Long actionId;
    /**
     * 业务对象
     */
    private String objCode;
    /**
     * 业务数量
     */
    private Long objCount;
    /**
     * 查询系统参考号
     */
    private String qryEventSeq;
}
