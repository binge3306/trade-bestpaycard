package com.bestpay.trade.bestpaycard.manager.conventer;

import com.bestpay.trade.bestpaycard.dal.model.TPcmDealLogDO;
import com.bestpay.trade.bestpaycard.manager.model.ModifyBalReqBO;

/**
 * description:交易日志对象转换类
 * <p>
 *     1、将余额变更请求对象转换为交易日志对象
 * </p>
 * User: huguangpu Date: 16/5/5 ProjectName: trade-bestpaycard Version: 1.0
 */
public class TPcmDealLogConventer {


    /**
     * 将余额变更请求对象转换为交易日志对象
     * @param modifyBalReqBO
     * @return
     */
    public static TPcmDealLogDO modifyBalReqToDealLogDO(ModifyBalReqBO modifyBalReqBO){
        TPcmDealLogDO tPcmDealLogDO=new TPcmDealLogDO();
        tPcmDealLogDO.setOrderId(modifyBalReqBO.getOrderId());
        tPcmDealLogDO.setAcctCode(modifyBalReqBO.getCardNo());
        tPcmDealLogDO.setCardNo(modifyBalReqBO.getCardNo());
        tPcmDealLogDO.setChannelType(modifyBalReqBO.getChannelType());
        tPcmDealLogDO.setDealAmount(modifyBalReqBO.getDealAmount());
        tPcmDealLogDO.setDealSrc(modifyBalReqBO.getDealSrc());
        tPcmDealLogDO.setTradeSeq(modifyBalReqBO.getTradeSeq());
        return tPcmDealLogDO;
    }
}