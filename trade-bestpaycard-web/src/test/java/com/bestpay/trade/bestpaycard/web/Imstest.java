package com.bestpay.trade.bestpaycard.web;
import com.bestpay.trade.bestpaycard.dal.mapper.TScsOrdAttrMapper;
import com.bestpay.trade.bestpaycard.dal.model.TScsOrdAttrDO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by WUH on 2016/4/29.
 */
public class Imstest extends BaseSpringTest {
    @Autowired(required = false)
    TScsOrdAttrMapper tScsOrdAttrMapper;
    @Test
    public void test(){
        TScsOrdAttrDO tScsOrdAttrDO = new TScsOrdAttrDO();
        tScsOrdAttrDO.setAttrId(1111);
        tScsOrdAttrDO.setOrdAttrId("1111");
        tScsOrdAttrDO.setOrderId("1111");
        tScsOrdAttrDO.setStat("S");
        tScsOrdAttrDO.setValue1("111");
        tScsOrdAttrDO.setValue2("111");
        tScsOrdAttrDO.setValue3("111");
        tScsOrdAttrDO.setValue4("111");

        int number = tScsOrdAttrMapper.insert(tScsOrdAttrDO);
        System.out.println(number);
    }

}
