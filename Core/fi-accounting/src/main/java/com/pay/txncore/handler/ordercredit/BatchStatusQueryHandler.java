package com.pay.txncore.handler.ordercredit;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pay.inf.dao.Page;
import com.pay.inf.enums.ResponseCodeEnum;
import com.pay.inf.excepiton.HessianInvokeException;
import com.pay.inf.handler.EventHandler;
import com.pay.txncore.dao.CreditFilterDAO;
import com.pay.txncore.dto.DayRateDTO;
import com.pay.txncore.service.DayRateService;
import com.pay.util.JSonUtil;
import com.pay.util.MapUtil;


/**
 * 批量状态查询
 * @author mmzhang
 *
 */
@SuppressWarnings({"unchecked", "rawtypes"})
public class BatchStatusQueryHandler implements EventHandler{
	
	private static Logger logger = LoggerFactory.getLogger(BatchStatusQueryHandler.class);
	//注入
	private CreditFilterDAO creditFilterDAO ;
	
	public CreditFilterDAO getCreditFilterDAO() {
		return creditFilterDAO;
	}

	public void setCreditFilterDAO(CreditFilterDAO creditFilterDAO) {
		this.creditFilterDAO = creditFilterDAO;
	}

	@Override
	public String handle(String dataMsg) throws HessianInvokeException {
		Map<String, Object> paraMap = null;
		Map resultMap = new HashMap();

		try {
			paraMap = JSonUtil.toObject(dataMsg, new HashMap().getClass());
			String status = this.creditFilterDAO.queryBatchStatus(paraMap);
			resultMap.put("responseCode", ResponseCodeEnum.SUCCESS.getCode());
			resultMap.put("responseDesc", ResponseCodeEnum.SUCCESS.getDesc());
			resultMap.put("status", status);
		} catch (Exception e) {
			resultMap.put("responseCode", ResponseCodeEnum.UNDEFINED_ERROR.getCode());
			resultMap.put("responseDesc", ResponseCodeEnum.UNDEFINED_ERROR.getDesc());
			logger.error("query partner error:", e);
		}

		return JSonUtil.toJSonString(resultMap);
	}


}
