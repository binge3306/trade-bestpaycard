package com.bestpay.trade.bestpaycard.web;

import com.bestpay.trade.bestpaycard.dal.mapper.TScsActFeeMapper;
import com.bestpay.trade.bestpaycard.dal.model.TScsActFeeDO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by WUH on 2016/5/2.
 */
public class ScsActFeeTest extends BaseSpringTest {
    @Autowired(required = false)
    private TScsActFeeMapper tScsActFeeMapper;

    @Test
    public void insert(){
        TScsActFeeDO tScsActFeeDO = new TScsActFeeDO();
        tScsActFeeDO.setActFeeId(11L);
        tScsActFeeDO.setOrderId("11");
        tScsActFeeDO.setActListId("11");
        tScsActFeeDO.setCurrencyCode("11");
        tScsActFeeDO.setPrimMoney(11.0);
        tScsActFeeDO.setDiscMoney(11.0);
        tScsActFeeDO.setDueMoney(11.0);
        tScsActFeeDO.setDueMoney(11.0);
        tScsActFeeDO.setPayMoney(11.0);
        tScsActFeeDO.setStat("11");
        tScsActFeeDO.setFareId(11L);

        int number = tScsActFeeMapper.insert(tScsActFeeDO);
        System.out.println(number);
    }
}
