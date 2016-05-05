package com.bestpay.trade.bestpaycard.manager.impl;

import com.bestpay.dubbo.result.Result;
import com.bestpay.trade.bestpaycard.dal.mapper.*;
import com.bestpay.trade.bestpaycard.dal.model.*;
import com.bestpay.trade.bestpaycard.manager.CreateTradeOrderManager;
import com.bestpay.trade.bestpaycard.manager.converter.CreateTradeOrderConverter;
import com.bsetpay.trade.bestpaycard.service.facade.model.request.CreateTradeOrderRequestDTO;
import com.bsetpay.trade.bestpaycard.service.facade.model.request.createTradeOrderRequest.OrderAcceptInfo;
import com.bsetpay.trade.bestpaycard.service.facade.model.request.createTradeOrderRequest.ProdPropertyInfo;
import com.bsetpay.trade.bestpaycard.service.facade.model.result.CreateTradeOrderResultDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by WUH on 2016/5/3.
 */
@Component("createTradeOrderManager")
@Slf4j
public class CreateTradeOrderManagerImpl implements CreateTradeOrderManager {

    /**
     * 订单受理信息表
     */
    @Autowired
    private TScsOrderMapper tScsOrderMapper;

    /**
     * 订单费用信息表
     */
    @Autowired
    private TScsOrdFeeMapper tScsOrdFeeMapper;

    /**
     * 业务单信息表
     */
    @Autowired
    private TScsActListMapper tScsActListMapper;

    /**
     * 业务单费用信息表
     */
    @Autowired
    private TScsActFeeMapper tScsActFeeMapper;

    /**
     * 产品属性信息表
     */
    @Autowired
    private TScsProdAttrMapper tScsProdAttrMapper;

    /**
     * 业务属性信息表
     */
    @Autowired
    private TScsActAttrMapper tScsActAttrMapper;
    /**
     * 支付单信息表
     */
    @Autowired
    private TScsPaymentMapper tScsPaymentMapper;

    @Override
    public Result<CreateTradeOrderResultDTO> payOrder(CreateTradeOrderRequestDTO createTradeOrderRequestDTO) {
        TScsOrderDO tScsOrderDO = CreateTradeOrderConverter.getOrderAcceptInfo(createTradeOrderRequestDTO);
        List<TScsOrdFeeDO> ordFeeDOList = CreateTradeOrderConverter.getOrderFeeInfoList(createTradeOrderRequestDTO);
        List<TScsActListDO> actListDOList = CreateTradeOrderConverter.getBusiOrderInfoList(createTradeOrderRequestDTO);
        List<TScsActFeeDO> actFeeDOList = CreateTradeOrderConverter.getBusiOrderFeeList(createTradeOrderRequestDTO);
        List<TScsProdAttrDO> prodAttrDOList = CreateTradeOrderConverter.getProdPropertyInfoList(createTradeOrderRequestDTO);
        List<TScsActAttrDO> actAttrDOList = CreateTradeOrderConverter.getBusiPropertyInfoList(createTradeOrderRequestDTO);
        List<TScsPaymentDO> paymentDOList = CreateTradeOrderConverter.getPayOrderInfoList(createTradeOrderRequestDTO);

        int number = tScsOrderMapper.insert(tScsOrderDO);

        for(TScsOrdFeeDO tScsOrdFeeDO: ordFeeDOList){
            number = tScsOrdFeeMapper.insert(tScsOrdFeeDO);
        }

        for(TScsActListDO tScsActListDO: actListDOList){
            number = tScsActListMapper.insert(tScsActListDO);
        }

        for(TScsActFeeDO tScsActFeeDO: actFeeDOList){
            number = tScsActFeeMapper.insert(tScsActFeeDO);
        }

        for(TScsProdAttrDO tScsProdAttrDO: prodAttrDOList){
            number = tScsProdAttrMapper.insert(tScsProdAttrDO);
        }

        for(TScsActAttrDO tScsActAttrDO: actAttrDOList){
            number = tScsActAttrMapper.insert(tScsActAttrDO);
        }

        for (TScsPaymentDO tScsPaymentDO: paymentDOList){
           number = tScsPaymentMapper.insert(tScsPaymentDO);
        }
        System.out.println(number);
        return null;
    }



}
