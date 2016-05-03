package com.bestpay.trade.bestpaycard.web;

import com.bestpay.trade.bestpaycard.dal.mapper.TScsActAttrMapper;
import com.bestpay.trade.bestpaycard.dal.model.TScsActAttrDO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by WUH on 2016/5/2.
 */
public class ScsActAttrTest extends BaseSpringTest {
    @Autowired(required = false)
    TScsActAttrMapper tScsActAttrMapper;

    @Test
    public void insert(){
        TScsActAttrDO tScsActAttrDO = new TScsActAttrDO();
        tScsActAttrDO.setAttrId(11L);
        tScsActAttrDO.setActListId("11");
        tScsActAttrDO.setActionId(11L);
        tScsActAttrDO.setStat("11");
        tScsActAttrDO.setValue1("11");
        tScsActAttrDO.setValue2("11");
        tScsActAttrDO.setValue3("11");
        tScsActAttrDO.setValue4("11");

        int number = tScsActAttrMapper.insert(tScsActAttrDO);
        System.out.println(number);
    }
}
