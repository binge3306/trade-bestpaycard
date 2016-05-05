package com.bestpay.trade.bestpaycard.service.order;

import com.bestpay.dubbo.result.Result;
import com.bestpay.ext.logback.util.TraceLogIdUtil;
import com.bestpay.trade.bestpaycard.common.exception.DealExceptionUtil;
import com.bestpay.trade.bestpaycard.common.exception.TradeBestpaycardErrorCode;
import com.bestpay.trade.bestpaycard.common.utils.VerifyUtil;
import com.bestpay.trade.bestpaycard.manager.ModifyBalManager;
import com.bestpay.trade.bestpaycard.manager.model.ModifyBalReqBO;
import com.bestpay.trade.bestpaycard.manager.model.ModifyBalRsltBO;
import com.bestpay.trade.bestpaycard.service.facade.model.request.ModifyBalRequestDTO;
import com.bestpay.trade.bestpaycard.service.facade.model.result.ModifyBalResultDTO;
import com.bestpay.trade.bestpaycard.service.facade.order.ModifyBalService;
import com.google.common.base.Throwables;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.slf4j.helpers.BestpayMarker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 变更余额接口接口
 * <p>
 *     1、变更余额接口
 * </p>
 * User: huguangpu Date: 2016/05/03 ProjectName: trade-bestpaycard Version: 1.0
 */
@Slf4j
@Service
public class ModifyBalServiceImpl implements ModifyBalService{

    /**
     * 余额变更业务类
     */
    @Autowired
    private ModifyBalManager modifyBalManager;
    /**
     * @param modifyBalRequestDTO
     * @return 余额变更处理结果
     */
    public Result<ModifyBalResultDTO> modifyBal(ModifyBalRequestDTO modifyBalRequestDTO) {
        MDC.put(BestpayMarker.TRACE_LOG_ID, TraceLogIdUtil.createTraceLogId());
        log.info("call modifyBal,PARAM:{}",modifyBalRequestDTO);
        Result<ModifyBalResultDTO> result=new Result<ModifyBalResultDTO>();
        try {
            /**参数验证**/
            VerifyUtil.validateObject(modifyBalRequestDTO);
            log.debug("call validateObject PASS");
            ModifyBalReqBO modifyBalReqBO= BeanMapperUtil.objConvert(modifyBalRequestDTO,ModifyBalReqBO.class);
            ModifyBalRsltBO modifyBalRsltBO=modifyBalManager.executeModifyBal(modifyBalReqBO);
            log.debug("call modifyBalRsltBO:{}",modifyBalRsltBO);
            result=new Result<ModifyBalResultDTO>(BeanMapperUtil.objConvert(modifyBalRsltBO,ModifyBalResultDTO.class));
            log.debug("call modifyBal,RESPONSE:{}",result);
        } catch (Exception e) {
            result= DealExceptionUtil.doExceptionService(e);
            if(TradeBestpaycardErrorCode.SYSTEM_INNER_ERROR.getCode().equals(result.getErrorCode())){
                log.error("EXCEPTION:{}",Throwables.getStackTraceAsString(e));
            }
            else{
                log.error("RESPONSE:{}",result);
            }
        }
        return result;
    }
}