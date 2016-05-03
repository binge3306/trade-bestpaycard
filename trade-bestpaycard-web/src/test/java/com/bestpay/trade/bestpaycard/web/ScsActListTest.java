package com.bestpay.trade.bestpaycard.web;

import com.bestpay.trade.bestpaycard.dal.mapper.TScsActListMapper;
import com.bestpay.trade.bestpaycard.dal.model.TScsActListDO;
import org.codehaus.jackson.map.MapperConfig;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by WUH on 2016/5/2.
 */
public class ScsActListTest extends BaseSpringTest {
    @Autowired(required = false)
    private TScsActListMapper tScsActListMapper;

    @Test
    public void insert(){
        TScsActListDO tScsActListDO = new TScsActListDO();
        tScsActListDO.setActListId("11");
        tScsActListDO.setActListSeq(11L);
        tScsActListDO.setOrderId("11");
        tScsActListDO.setCustId(11L);
        tScsActListDO.setProdId(11L);
        tScsActListDO.setActionId(11L);
        tScsActListDO.setObjCode("11");
        tScsActListDO.setObjCount(11L);
        tScsActListDO.setStat("11");
        tScsActListDO.setRetId("11");
        tScsActListDO.setRetCode("11");
        tScsActListDO.setRetMsg("11");
        tScsActListDO.setEventSeq("11");
        tScsActListDO.setQryEventSeq("11");
        tScsActListDO.setSrcEventSeq("11");
        tScsActListDO.setSagActionId(11L);
        tScsActListDO.setInfActionId(11L);

        int number = tScsActListMapper.insert(tScsActListDO);
        System.out.println(number);


    }
}
