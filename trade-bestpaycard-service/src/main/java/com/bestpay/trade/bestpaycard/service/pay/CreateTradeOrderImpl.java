package com.bestpay.trade.bestpaycard.service.pay;

import com.bestpay.dubbo.result.Result;
import com.bestpay.trade.bestpaycard.manager.CreateTradeOrderManager;
import com.bsetpay.trade.bestpaycard.service.facade.model.request.CreateTradeOrderRequestDTO;
import com.bsetpay.trade.bestpaycard.service.facade.model.result.CreateTradeOrderResultDTO;
import com.bsetpay.trade.bestpaycard.service.facade.pay.CreateTradeOrderFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by WUH on 2016/5/3.
 */
@Service("createTradeOrder")
public class CreateTradeOrderImpl implements CreateTradeOrderFacade {
    @Autowired
    private CreateTradeOrderManager createTradeOrderManager;

    @Override
    public Result<CreateTradeOrderResultDTO> payOrder(CreateTradeOrderRequestDTO requestDTO) {
        createTradeOrderManager.payOrder(requestDTO);
        return null;
    }
}
