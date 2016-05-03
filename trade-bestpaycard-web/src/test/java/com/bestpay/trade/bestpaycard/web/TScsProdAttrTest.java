package com.bestpay.trade.bestpaycard.web;

import com.bestpay.trade.bestpaycard.dal.mapper.TScsProdAttrMapper;
import com.bestpay.trade.bestpaycard.dal.model.TScsProdAttrDO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by WUH on 2016/5/2.
 */
public class TScsProdAttrTest extends BaseSpringTest {
    @Autowired(required = false)
    TScsProdAttrMapper tScsProdAttrMapper;

    @Test
    public void insert(){
        TScsProdAttrDO tScsProdAttrDO = new TScsProdAttrDO();
        tScsProdAttrDO.setActListId("11");
        tScsProdAttrDO.setAttrId(11L);
        tScsProdAttrDO.setProdId(11L);
        tScsProdAttrDO.setStat("11");
        tScsProdAttrDO.setValue1("11");
        tScsProdAttrDO.setValue2("11");

        int number = tScsProdAttrMapper.insert(tScsProdAttrDO);
        System.out.println(number);
    }
}
