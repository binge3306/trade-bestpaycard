package com.bestpay.trade.bestpaycard.service.facade.order;


import com.bestpay.dubbo.result.Result;
import com.bestpay.trade.bestpaycard.service.facade.model.request.ModifyBalRequestDTO;
import com.bestpay.trade.bestpaycard.service.facade.model.result.ModifyBalResultDTO;

/**
 * 变更余额接口接口
 * <p>
 *     1、变更余额接口
 * </p>
 * User: huguangpu Date: 2016/05/03 ProjectName: trade-bestpaycard Version: 1.0
 */
public interface ModifyBalService {

    /**
     * 变更余额接口
     * @param modifyBalRequestDTO
     */
    public Result<ModifyBalResultDTO> modifyBal(ModifyBalRequestDTO modifyBalRequestDTO);
}
