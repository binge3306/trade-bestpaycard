package com.bestpay.trade.bestpaycard.web;

import com.bestpay.trade.bestpaycard.dal.mapper.TScsOrdFeeMapper;
import com.bestpay.trade.bestpaycard.dal.model.TScsOrdFeeDO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by WUH on 2016/5/2.
 */
public class ScsOrdFeeTest extends BaseSpringTest {
    @Autowired(required = false)
    private TScsOrdFeeMapper tScsOrdFeeMapper;

    @Test
    public void insert(){
        TScsOrdFeeDO tScsOrdFeeDO = new TScsOrdFeeDO();
        tScsOrdFeeDO.setOrderId("11");
        tScsOrdFeeDO.setCurrencyCode("1");
        tScsOrdFeeDO.setDiscMoney(11);
        tScsOrdFeeDO.setDueMoney(11);
        tScsOrdFeeDO.setOrdFeeId(11);
        tScsOrdFeeDO.setPayMoney(11);
        tScsOrdFeeDO.setPrimMoney(11);
        tScsOrdFeeDO.setStat("11");
        int number = tScsOrdFeeMapper.insert(tScsOrdFeeDO);
        System.out.println(number);
    }
}
