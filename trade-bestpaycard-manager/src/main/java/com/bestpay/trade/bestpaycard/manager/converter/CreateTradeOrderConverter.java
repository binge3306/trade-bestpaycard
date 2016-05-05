package com.bestpay.trade.bestpaycard.manager.converter;

import com.bestpay.trade.bestpaycard.dal.model.*;
import com.bsetpay.trade.bestpaycard.service.facade.model.request.CreateTradeOrderRequestDTO;
import com.bsetpay.trade.bestpaycard.service.facade.model.request.createTradeOrderRequest.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WUH on 2016/5/4.
 */
public class CreateTradeOrderConverter {
    public static TScsOrderDO getOrderAcceptInfo(CreateTradeOrderRequestDTO createTradeOrderRequestDTO){
        TScsOrderDO tScsOrderDO = new TScsOrderDO();
        OrderAcceptInfo orderAcceptInfo = createTradeOrderRequestDTO.getOrderAcceptInfo();
        tScsOrderDO.setOrderId(System.currentTimeMillis()+"");
        tScsOrderDO.setOrderCode(orderAcceptInfo.getOrderCode());
        tScsOrderDO.setCustId(orderAcceptInfo.getCustId());
        tScsOrderDO.setOrderType(orderAcceptInfo.getOrderType());
        tScsOrderDO.setAreaCode(orderAcceptInfo.getAreaCode());

        tScsOrderDO.setTermId(orderAcceptInfo.getTermId());
        tScsOrderDO.setLoginType(orderAcceptInfo.getLoginType());
        tScsOrderDO.setMemo(orderAcceptInfo.getMemo());
        tScsOrderDO.setTermSeq(orderAcceptInfo.getTermSeq());
        tScsOrderDO.setOperOrig(orderAcceptInfo.getOperOrig());

        tScsOrderDO.setChannelType(orderAcceptInfo.getChannelType());
        tScsOrderDO.setStat("S0A");
        tScsOrderDO.setPayStat("S0A");
        tScsOrderDO.setActStat("S0A");
        return tScsOrderDO;
    }

    public static List<TScsOrdFeeDO> getOrderFeeInfoList(CreateTradeOrderRequestDTO createTradeOrderRequestDTO){
        List<TScsOrdFeeDO> ordFeeList = new ArrayList<TScsOrdFeeDO>();
        TScsOrdFeeDO tScsOrdFeeDO = null;
        List<OrderFeeInfo> orderFeeInfoList = createTradeOrderRequestDTO.getOrderFeeInfoList();
        for(OrderFeeInfo orderFeeInfo: orderFeeInfoList){
            tScsOrdFeeDO = new TScsOrdFeeDO();
            tScsOrdFeeDO.setOrdFeeId(System.currentTimeMillis() % 1000000);
            tScsOrdFeeDO.setCurrencyCode(orderFeeInfo.getCurrencyCode());
            tScsOrdFeeDO.setPrimMoney(orderFeeInfo.getPrimMoney());
            tScsOrdFeeDO.setDiscMoney(orderFeeInfo.getDiscMoney());
            tScsOrdFeeDO.setDueMoney(orderFeeInfo.getDueMoney());
            tScsOrdFeeDO.setStat("S0A");
            ordFeeList.add(tScsOrdFeeDO);
        }
        return ordFeeList;
    }

    public static List<TScsActListDO> getBusiOrderInfoList(CreateTradeOrderRequestDTO createTradeOrderRequestDTO){
        List<TScsActListDO> actListDOList = new ArrayList<TScsActListDO>();
        TScsActListDO actListDO = null;
        List<BusiOrderInfo> busiOrderInfoList = createTradeOrderRequestDTO.getBusiOrderInfoList();
        for(BusiOrderInfo busiOrderInfo: busiOrderInfoList){
            actListDO = new TScsActListDO();
            actListDO.setActListId(System.currentTimeMillis() % 10000000000L+"");
            actListDO.setActListSeq(busiOrderInfo.getActListSeq());
            actListDO.setProdId(busiOrderInfo.getProdId());
            actListDO.setActionId(busiOrderInfo.getActionId());
            actListDO.setObjCode(busiOrderInfo.getObjCode());
            actListDO.setObjCount(busiOrderInfo.getObjCount());
            actListDO.setStat("S0A");
            actListDO.setQryEventSeq(busiOrderInfo.getQryEventSeq());
            actListDOList.add(actListDO);
        }
        return actListDOList;
    }

    public static List<TScsActFeeDO> getBusiOrderFeeList(CreateTradeOrderRequestDTO createTradeOrderRequestDTO){
        List<TScsActFeeDO> actFeeDOList = new ArrayList<TScsActFeeDO>();
        TScsActFeeDO tScsActFeeDO = null;
        List<BusiOrderFeeInfo> busiOrderFeeInfoList = createTradeOrderRequestDTO.getBusiOrderFeeInfoList();

        for(BusiOrderFeeInfo busiOrderFeeInfo: busiOrderFeeInfoList){
            tScsActFeeDO = new TScsActFeeDO();
            tScsActFeeDO.setActFeeId(System.currentTimeMillis() % 1000000);
            tScsActFeeDO.setCurrencyCode(busiOrderFeeInfo.getCurrencyCode());
            tScsActFeeDO.setPrimMoney(busiOrderFeeInfo.getPrimMoney());
            tScsActFeeDO.setDiscMoney(busiOrderFeeInfo.getDiscMoney());
            tScsActFeeDO.setDueMoney(busiOrderFeeInfo.getDueMoney());
            tScsActFeeDO.setStat("S0A");
            tScsActFeeDO.setFareId(System.currentTimeMillis() % 1000000);
            actFeeDOList.add(tScsActFeeDO);
        }
        return actFeeDOList;
    }

    public static List<TScsProdAttrDO> getProdPropertyInfoList(CreateTradeOrderRequestDTO createTradeOrderRequestDTO){
        List<TScsProdAttrDO> prodAttrDOList = new ArrayList<TScsProdAttrDO>();
        TScsProdAttrDO tScsProdAttrDO = null;
        List<ProdPropertyInfo> prodPropertyInfoList = createTradeOrderRequestDTO.getProdPropertyInfoList();
        for(ProdPropertyInfo prodPropertyInfo: prodPropertyInfoList){
            tScsProdAttrDO = new TScsProdAttrDO();
            tScsProdAttrDO.setAttrId(System.currentTimeMillis() % 1000000);
            tScsProdAttrDO.setProdId(System.currentTimeMillis() % 1000000);
            tScsProdAttrDO.setActListId(System.currentTimeMillis() + "");
            tScsProdAttrDO.setStat("S0A");
            tScsProdAttrDO.setValue1(prodPropertyInfo.getProdAttrValue1());
            tScsProdAttrDO.setValue2(prodPropertyInfo.getProdAttrValue2());
            prodAttrDOList.add(tScsProdAttrDO);
        }
        return prodAttrDOList;
    }

    public static List<TScsActAttrDO> getBusiPropertyInfoList(CreateTradeOrderRequestDTO createTradeOrderRequestDTO){
        List<TScsActAttrDO> actAttrDOList = new ArrayList<TScsActAttrDO>();
        TScsActAttrDO tScsActAttrDO = null;
        List<BusiPropertyInfo> busiPropertyInfoList = createTradeOrderRequestDTO.getBusiPropertyInfoList();

        for(BusiPropertyInfo busiPropertyInfo: busiPropertyInfoList){
            tScsActAttrDO = new TScsActAttrDO();
            tScsActAttrDO.setValue1(busiPropertyInfo.getValue1());
            tScsActAttrDO.setValue2(busiPropertyInfo.getValue2());
            tScsActAttrDO.setValue3(busiPropertyInfo.getValue3());
            tScsActAttrDO.setValue4(busiPropertyInfo.getValue4());
            tScsActAttrDO.setActListId(System.currentTimeMillis() + "");
            tScsActAttrDO.setActionId(System.currentTimeMillis() % 1000000);
            tScsActAttrDO.setAttrId(System.currentTimeMillis() % 1000000);
            tScsActAttrDO.setStat("S0A");

            actAttrDOList.add(tScsActAttrDO);
        }
        return actAttrDOList;
    }

    public static List<TScsPaymentDO> getPayOrderInfoList(CreateTradeOrderRequestDTO createTradeOrderRequestDTO){
        List<TScsPaymentDO> paymentDOList = new ArrayList<TScsPaymentDO>();
        TScsPaymentDO tScsPaymentDO = null;
        List<PayOrderInfo> payOrderInfoList = createTradeOrderRequestDTO.getPayOrderInfoList();

        for(PayOrderInfo payOrderInfo: payOrderInfoList){
            tScsPaymentDO = new TScsPaymentDO();
            tScsPaymentDO.setPaymentId(System.currentTimeMillis() + "");
            tScsPaymentDO.setOrderId(System.currentTimeMillis() + "");
            tScsPaymentDO.setPayType(payOrderInfo.getPayType());
            tScsPaymentDO.setPayOrg(payOrderInfo.getPayOrg());
            tScsPaymentDO.setAcctTypeCode(payOrderInfo.getAcctTypeCode());
            tScsPaymentDO.setAcctName(payOrderInfo.getAcctName());
            tScsPaymentDO.setAcctCode(payOrderInfo.getAcctCode());
            tScsPaymentDO.setAcctPwd(payOrderInfo.getAcctPwd());
            tScsPaymentDO.setPaySeq(payOrderInfo.getPaySeq());
            tScsPaymentDO.setCurrencyCode(payOrderInfo.getCurrencyCode());
            tScsPaymentDO.setPayMoney(payOrderInfo.getPayMoney());
            tScsPaymentDO.setMediaType(payOrderInfo.getMediaType());
            tScsPaymentDO.setMediaId(payOrderInfo.getMediaId());
            tScsPaymentDO.setNetCode(payOrderInfo.getNetCode());
            tScsPaymentDO.setStat("S0A");
            tScsPaymentDO.setSendId(payOrderInfo.getSendId());
            tScsPaymentDO.setCardType(payOrderInfo.getCardType());
            tScsPaymentDO.setEventSeq(payOrderInfo.getSrcEventSeq());
            tScsPaymentDO.setInfPayOrg(payOrderInfo.getInfPayOrg());
        }
        return paymentDOList;
    }

//    public static List<TScsPaymentDO> get
}
