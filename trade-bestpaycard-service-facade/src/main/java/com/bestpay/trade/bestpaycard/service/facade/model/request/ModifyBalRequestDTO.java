package com.bestpay.trade.bestpaycard.service.facade.model.request;

import com.bestpay.trade.bestpaycard.service.facade.model.BaseRequestDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.sf.oval.constraint.Length;
import net.sf.oval.constraint.NotBlank;

/**
 * description:余额变更接口请求对象
 * User: huguangpu Date: 16/5/3 ProjectName: trade-bestpaycard Version: 1.0
 */
@Getter
@Setter
@ToString(callSuper = true)
public class ModifyBalRequestDTO extends BaseRequestDTO{

    /**
     * 卡号
     */
    @Length(max=20,message = "卡号超过最大长度")
    @NotBlank(message = "卡号不能为空")
    private String cardNo;

    /**
     * 卡密码
     */
    @Length(max=100,message = "卡密码超过最大长度")
    private String cardPwd;

    /**
     * 交易流水号
     */
    @Length(max=25,message = "交易流水号超过最大长度")
    @NotBlank(message = "交易流水号不能为空")
    private String tradeSeq;

    /**
     * 交易类型
     */
    @Length(max = 20,message = "交易类型超过最大长度")
    @NotBlank(message = "交易类型不能为空")
    private String dealCode;

    /**
     * 渠道类型
     */
    @Length(max = 20,message = "渠道类型超过最大长度")
    private String channelType;

    /**
     * 交易来源
     */
    @Length(max=20,message = "交易来源超过最大长度")
    @NotBlank(message = "交易来源不能为空")
    private String dealSrc;

    /**
     * 订单号
     */
    @Length(max=20,message = "订单号长度超过最大长度")
    private String orderId;

    /**
     * 交易金额
     */
    @Length(max=10,message = "交易金额超过最大长度")
    @NotBlank(message = "交易金额不能为空")
    private int dealAmount;

    /**
     * 账号类型
     */
    @Length(max=20,message = "账户类型超过最大长度")
    @NotBlank(message = "账户类型不能为空")
    private String acctType;
}