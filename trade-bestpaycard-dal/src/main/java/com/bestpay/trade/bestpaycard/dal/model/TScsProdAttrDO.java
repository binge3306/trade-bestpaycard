package com.bestpay.trade.bestpaycard.dal.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by WUH on 2016/5/2.
 */
@Setter
@Getter
@ToString
public class TScsProdAttrDO {
    private String actListId;
    private Long prodId;
    private Long attrId;
    private String value1;
    private String value2;
    private String stat;
}
