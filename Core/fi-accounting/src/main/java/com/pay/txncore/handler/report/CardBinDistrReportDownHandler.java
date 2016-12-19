package com.pay.txncore.handler.report;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.pay.inf.enums.ResponseCodeEnum;
import com.pay.inf.excepiton.HessianInvokeException;
import com.pay.inf.handler.EventHandler;
import com.pay.txncore.dao.ReportDAO;
import com.pay.util.JSonUtil;

public class CardBinDistrReportDownHandler implements EventHandler{

	public final Log logger = LogFactory
			.getLog(CardBinDistrReportDownHandler.class);
	private ReportDAO reportDAO;

	public void setReportDAO(ReportDAO reportDAO) {
		this.reportDAO = reportDAO;
	}
	
	@Override
	public String handle(String dataMsg) throws HessianInvokeException {
		Map<String, Object> resultMap = new HashMap<String, Object>();

		Map<String, Object> paraMap = null;
		try {
			paraMap = JSonUtil.toObject(dataMsg,
					new HashMap<String, String>().getClass());
			List<Map>  resultList = reportDAO.queryCardBinRepDown(paraMap);
			resultMap.put("resultList", resultList);
			resultMap.put("responseCode",
					ResponseCodeEnum.SUCCESS.getCode());
			resultMap.put("responseDesc",
					ResponseCodeEnum.SUCCESS.getDesc());
		} catch (Exception e) {
			logger.error(e.getMessage());
			resultMap.put("responseCode",
					ResponseCodeEnum.MSG_PARSING_FAILURE.getCode());
			resultMap.put("responseDesc",
					ResponseCodeEnum.MSG_PARSING_FAILURE.getDesc());
			return JSonUtil.toJSonString(resultMap);
		}
		return JSonUtil.toJSonString(resultMap);
		}
}