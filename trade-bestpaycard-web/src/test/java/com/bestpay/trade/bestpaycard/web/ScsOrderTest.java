package com.bestpay.trade.bestpaycard.web;

import com.bestpay.trade.bestpaycard.dal.mapper.TScsOrderMapper;
import com.bestpay.trade.bestpaycard.dal.model.TScsOrderDO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * Created by WUH on 2016/5/2.
 */
public class ScsOrderTest extends BaseSpringTest {
    @Autowired(required = false)
    private TScsOrderMapper tScsOrderMapper;

    @Test
    public void insert(){
        TScsOrderDO tScsOrderDO = new TScsOrderDO();
        tScsOrderDO.setOrderId("17");
        tScsOrderDO.setLoginType("11");
        tScsOrderDO.setStat("11");
        tScsOrderDO.setPayStat("11");
        tScsOrderDO.setActStat("11");

        tScsOrderDO.setOrderCode("11");
        tScsOrderDO.setCustId(11);
        tScsOrderDO.setOrderType("11");
        tScsOrderDO.setAreaCode("11");
        tScsOrderDO.setTermId("11");

        tScsOrderDO.setMemo("11");
        tScsOrderDO.setTermSeq("11");
        tScsOrderDO.setOperOrig("11");
        tScsOrderDO.setOperStat("11");
        tScsOrderDO.setChannelType("11");

        tScsOrderDO.setExtOrderId("11");
        tScsOrderDO.setSrcOrderId("11");
        tScsOrderDO.setOldStat("11");
        tScsOrderDO.setOldPayStat("11");
        tScsOrderDO.setOldActStat("11");
        tScsOrderDO.setRetCode("11");

        tScsOrderDO.setRetMsg("11");
        tScsOrderDO.setExtValue1("11");
        tScsOrderDO.setExtValue2("11");
        tScsOrderDO.setExtValue3("11");
        tScsOrderDO.setExtValue4("11");

        int number = tScsOrderMapper.insert(tScsOrderDO);

        System.out.println(number);
    }
}
