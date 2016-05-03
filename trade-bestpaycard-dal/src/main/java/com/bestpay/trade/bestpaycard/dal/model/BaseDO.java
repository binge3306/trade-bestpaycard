package com.bestpay.trade.bestpaycard.dal.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * 数据基础模型
 * User: wen  Date: 2015/09/23 ProjectName: trade-bestpaycard Version: 1.0
 */
@Getter
@Setter
@ToString
public class BaseDO implements Serializable {

    /**
     * 数据库主键
     */
    private String id;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 更新时间
     */
    private Date updatedAt;

    /**
     * 最后更新人
     */
    private String updatedBy;

}
