package com.bestpay.trade.bestpaycard.web;

import com.bestpay.trade.bestpaycard.dal.mapper.TScsPaymentMapper;
import com.bestpay.trade.bestpaycard.dal.model.TScsPaymentDO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by WUH on 2016/5/3.
 */
public class ScsPaymentTest extends BaseSpringTest {
    @Autowired(required = false)
    TScsPaymentMapper tScsPaymentMapper;

    @Test
    public void insert(){
        TScsPaymentDO tScsPaymentDO = new TScsPaymentDO();
        tScsPaymentDO.setPaymentId("11");
        tScsPaymentDO.setPayType("11");
        tScsPaymentDO.setStat("S");
        int number = tScsPaymentMapper.insert(tScsPaymentDO);
        System.out.println(number);
    }
}
