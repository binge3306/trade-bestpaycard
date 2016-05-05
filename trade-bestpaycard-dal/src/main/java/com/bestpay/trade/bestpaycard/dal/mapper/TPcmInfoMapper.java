package com.bestpay.trade.bestpaycard.dal.mapper;

import com.bestpay.trade.bestpaycard.dal.model.TPcmInfoDO;

/**
 * description:卡Mapper
 * <p>
 *     1、通过卡号查询卡信息
 * </p>
 * User: mac Date: 16/5/5 ProjectName: trade-bestpaycard Version: 1.0
 */
public interface TPcmInfoMapper {

    /**
     * 通过卡号查询卡信息
     * @return
     */
    TPcmInfoDO selectByCardNo(String cardNo);
}