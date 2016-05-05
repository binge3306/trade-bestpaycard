package com.bestpay.trade.bestpaycard.web;

import com.bsetpay.trade.bestpaycard.service.facade.model.request.CreateTradeOrderRequestDTO;
import com.bsetpay.trade.bestpaycard.service.facade.model.request.createTradeOrderRequest.*;
import com.bsetpay.trade.bestpaycard.service.facade.pay.CreateTradeOrderFacade;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WUH on 2016/5/4.
 */
public class CreateTradeOrderTest extends BaseSpringTest {

    @Autowired
    CreateTradeOrderFacade tradeOrderFacad;

    @Test
    public void payOrderTest(){
        CreateTradeOrderRequestDTO requestDTO = new CreateTradeOrderRequestDTO();
        OrderAcceptInfo orderAcceptInfo = new OrderAcceptInfo();
        orderAcceptInfo.setLoginType("asfd");
        requestDTO.setOrderAcceptInfo(orderAcceptInfo);

        OrderFeeInfo orderFeeInfo = new OrderFeeInfo();
        List<OrderFeeInfo> list = new ArrayList<OrderFeeInfo>();
        list.add(orderFeeInfo);
        requestDTO.setOrderFeeInfoList(list);

        BusiOrderInfo busiOrderInfo = new BusiOrderInfo();
        List<BusiOrderInfo> busiOrderInfoList = new ArrayList<BusiOrderInfo>();
        busiOrderInfoList.add(busiOrderInfo);
        requestDTO.setBusiOrderInfoList(busiOrderInfoList);

        BusiOrderFeeInfo busiOrderFeeInfo = new BusiOrderFeeInfo();
        List<BusiOrderFeeInfo> busiOrderFeeInfoList = new ArrayList<BusiOrderFeeInfo>();
        busiOrderFeeInfoList.add(busiOrderFeeInfo);
        requestDTO.setBusiOrderFeeInfoList(busiOrderFeeInfoList);

        List<ProdPropertyInfo> prodPropertyInfoList = new ArrayList<ProdPropertyInfo>();
        ProdPropertyInfo prodPropertyInfo = new ProdPropertyInfo();
        prodPropertyInfoList.add(prodPropertyInfo);
        requestDTO.setProdPropertyInfoList(prodPropertyInfoList);


        String a = "abcdefg   #fas";
        System.out.println(a.substring(0, a.length() - 1));
        System.out.println(a.replaceAll("#", ""));

        List<BusiPropertyInfo> busiPropertyInfoList = new ArrayList<BusiPropertyInfo>();
        BusiPropertyInfo busiPropertyInfo = new BusiPropertyInfo();
        busiPropertyInfoList.add(busiPropertyInfo);
        requestDTO.setBusiPropertyInfoList(busiPropertyInfoList);

        List<PayOrderInfo> payOrderInfoList = new ArrayList<PayOrderInfo>();
        PayOrderInfo payOrderInfo = new PayOrderInfo();
        payOrderInfoList.add(payOrderInfo);
        requestDTO.setPayOrderInfoList(payOrderInfoList);
        tradeOrderFacad.payOrder(requestDTO);
    }
}
