package com.bestpay.trade.bestpaycard.dal.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * 系统序列获取公共dal
 * <p>
 *      1、序列号获取【根据序列号名称】
 * </p>
 * User: thank_wd  Date: 2015/09/06 ProjectName: billingcenter Version: 1.0
 */
public interface SequenceProduceMapper {

    /**
     * 序列号获取【根据序列号名称】
     *
     * @param seqName 序列号名称
     * @return 序列号值
     */
    String produceSequence(@Param(value = "seqName") String seqName);

}
