package com.bestpay.trade.bestpaycard.dal.mapper;

import com.bestpay.trade.bestpaycard.dal.model.TPcmDealLogDO;

/**
 * description:交易日志mapper
 * <p>
 *     1、插入一个新的交易日志
 * </p>
 * User: huguangpu Date: 16/5/3 ProjectName: trade-bestpaycard Version: 1.0
 */
public interface TPcmDealLogMapper {

    /**
     * 插入一个新的交易日志
     * @param tPcmDealLogDO
     */
    int insert(TPcmDealLogDO tPcmDealLogDO);

    /**
     * 通过交易流水号查询交易记录
     * @param tradeSeq
     */
    TPcmDealLogDO selectByTradeSeq(String tradeSeq);

    /**
     * 创建交易日志流水号
     */
    String creatLogSeq();

    /**
     * 更新账户余额
     * @param tPcmDealLogDO
     */
    int updateBal(TPcmDealLogDO tPcmDealLogDO);
}