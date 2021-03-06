package com.pay.channel.handler.autofit;

import com.pay.channel.model.ChannelCurrency;
import com.pay.channel.model.MemberSecondLimit;
import com.pay.channel.service.AutoFitEngineService;
import com.pay.inf.enums.ResponseCodeEnum;
import com.pay.inf.excepiton.HessianInvokeException;
import com.pay.inf.handler.EventHandler;
import com.pay.util.JSonUtil;
import com.pay.util.StringUtil;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by eva on 2016/8/17.
 */
public class MemberSecondLimitUpdateHandler implements EventHandler {
    public final Log logger = LogFactory.getLog(getClass());
    private AutoFitEngineService autoFitEngineService;

    public void setAutoFitEngineService(AutoFitEngineService autoFitEngineService) {
        this.autoFitEngineService = autoFitEngineService;
    }

    @Override
    public String handle(String dataMsg) throws HessianInvokeException {
        Map<String, Object> paraMap = null;
        Map resultMap = new HashMap();

        try {
            paraMap = JSonUtil.toObject(dataMsg,
                    new HashMap<String, String>().getClass());
            MemberSecondLimit cc=new MemberSecondLimit();
            String limitTimes = (String)paraMap.get("limitTimes");
            String limitAmount = (String)paraMap.get("limitAmount");
            String limitDay = (String)paraMap.get("limitDay");
            String switchFlag = (String)paraMap.get("switchFlag");
            String operator = (String)paraMap.get("operator");
            String id = (String)paraMap.get("id");
            BigDecimal limitTimesNumber = BigDecimal.ZERO;
            BigDecimal limitAmountNumber = BigDecimal.ZERO;
            BigDecimal limitDayNumber = BigDecimal.ZERO;
            if(!StringUtil.isEmpty(limitTimes) && StringUtil.isNumber(limitTimes)){
                limitTimesNumber = new BigDecimal(limitTimes);
            }
            cc.setLimitTimes(limitTimesNumber);
            if(!StringUtil.isEmpty(limitAmount) && StringUtil.isNumber(limitAmount)){
                limitAmountNumber = new BigDecimal(limitAmount).multiply(new BigDecimal(1000));
            }
            if(!StringUtil.isEmpty(limitDay) && StringUtil.isNumber(limitDay)){
                limitDayNumber = new BigDecimal(limitDay);
            }
            cc.setId(new BigDecimal(id));
            cc.setLimitDay(limitDayNumber);
            cc.setLimitAmount(limitAmountNumber);
            cc.setSwitchFlag(switchFlag);
            cc.setOperator(operator);
            autoFitEngineService.updateMemberSecondLimit(cc);
            resultMap.put("responseCode", ResponseCodeEnum.SUCCESS.getCode());
            resultMap.put("responseDesc", ResponseCodeEnum.SUCCESS.getDesc());
        } catch (Exception e) {
            logger.error("error:", e);
            resultMap.put("responseCode",
                    ResponseCodeEnum.UNDEFINED_ERROR.getCode());
            resultMap.put("responseDesc",
                    ResponseCodeEnum.UNDEFINED_ERROR.getDesc());
        }

        return JSonUtil.toJSonString(resultMap);
    }
}
