package com.bsetpay.trade.bestpaycard.service.facade.pay;

import com.bestpay.dubbo.result.Result;
import com.bsetpay.trade.bestpaycard.service.facade.model.request.CreateTradeOrderRequestDTO;
import com.bsetpay.trade.bestpaycard.service.facade.model.result.CreateTradeOrderResultDTO;

/**
 * Created by WUH on 2016/5/3.
 */
public interface CreateTradeOrderFacade {
    Result<CreateTradeOrderResultDTO> payOrder(CreateTradeOrderRequestDTO requestDTO);
}
