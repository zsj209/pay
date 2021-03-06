/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pay.txncore.handler.rate;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.pay.fi.exception.BusinessException;
import com.pay.fi.exception.ExceptionCodeEnum;
import com.pay.inf.enums.ResponseCodeEnum;
import com.pay.inf.excepiton.HessianInvokeException;
import com.pay.inf.handler.EventHandler;
import com.pay.txncore.client.ChannelClientService;
import com.pay.txncore.crosspay.service.CurrencyRateService;
import com.pay.txncore.model.TransactionRate;
import com.pay.txncore.service.TradeOrderService;
import com.pay.util.CurrencyCodeEnum;
import com.pay.util.JSonUtil;

/**
 * 获取可用渠道
 * 
 * @author chma
 */
public class OrgRateQueryHandler implements EventHandler {

	public final Log logger = LogFactory.getLog(OrgRateQueryHandler.class);
	private ChannelClientService channelClientService;
	private TradeOrderService tradeOrderService;
	private CurrencyRateService currencyRateService;

	public void setChannelClientService(
			ChannelClientService channelClientService) {
		this.channelClientService = channelClientService;
	}

	public void setTradeOrderService(TradeOrderService tradeOrderService) {
		this.tradeOrderService = tradeOrderService;
	}

	public void setCurrencyRateService(CurrencyRateService currencyRateService) {
		this.currencyRateService = currencyRateService;
	}

	@SuppressWarnings("unchecked")
	@Override
	public String handle(String dataMsg) throws HessianInvokeException {

		Map<String,String> resultMap = new HashMap<String,String>();
		Map<String, String> paraMap = null;

		try {
			paraMap = JSonUtil.toObject(dataMsg,
					new HashMap<String, String>().getClass());
		} catch (Exception e) {
			logger.error("ChannelQueryHandler error:", e);
			resultMap.put("responseCode",
					ResponseCodeEnum.MSG_PARSING_FAILURE.getCode());
			resultMap.put("responseDesc",
					ResponseCodeEnum.MSG_PARSING_FAILURE.getDesc());
			return JSonUtil.toJSonString(resultMap);
		}

		String tradeOrderNo = paraMap.get("tradeOrderNo");
		String memberCode = paraMap.get("memberCode");
		String currencyCode = paraMap.get("currencyCode");
		String orderAmount = paraMap.get("orderAmount");

		String rate = "1";
		// 转换金额
		if (!CurrencyCodeEnum.CNY.getCode().equals(
				currencyCode)) {
			TransactionRate transRate = currencyRateService.getTransactionRate(
					currencyCode,
					CurrencyCodeEnum.CNY.getCode(), "1",
					memberCode + "", null);
			if (null == transRate) {
				throw new BusinessException("transactionRate not exists",
						ExceptionCodeEnum.NO_TRANSACTION_RATE);
			} else {
				rate = transRate.getExchangeRate();
				logger.info("获取到交易汇率,订单号：tradeOrderNo:" + tradeOrderNo
						+ "，交易汇率为：" + rate);
			}
			BigDecimal amount = new BigDecimal(orderAmount)
					.multiply(new BigDecimal(rate));
			long tAmount = amount.longValue();
			String amountStr = String.valueOf(tAmount);
			if (!amountStr.endsWith("0")) {
				logger.info("paymentInfo tradeOrderNo:" + tradeOrderNo
						+ "amountStr:" + amountStr);
				tAmount = amount.divide(new BigDecimal(10)).longValue() * 10 + 10;// 厘如果不为0，则向前进1
			}
			paraMap.put("orderAmount", tAmount + "");
			paraMap.put("currencyCode", CurrencyCodeEnum.CNY.getCode());
		}
		resultMap = channelClientService.queryOrgRateInfo(paraMap);
		return JSonUtil.toJSonString(resultMap);
	}
}
