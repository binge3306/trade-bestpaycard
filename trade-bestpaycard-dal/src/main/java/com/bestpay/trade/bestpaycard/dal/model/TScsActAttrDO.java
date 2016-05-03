package com.bestpay.trade.bestpaycard.dal.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by WUH on 2016/5/2.
 */
@Getter
@Setter
@ToString
public class TScsActAttrDO {
    private String actListId;
    private Long actionId;
    private Long attrId;
    private String stat;
    private String value1;
    private String value2;
    private String value3;
    private String value4;
}
