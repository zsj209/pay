/**
 *  File: 
 *  Description:
 *  Copyright 2006-2011 pay Corporation. All rights reserved.
 *  Date      Author      Changes
 *  2011-9-12   terry     Create
 *
 */
package com.pay.gateway.validate.preauth;

import java.util.HashMap;
import java.util.Map;

import com.pay.gateway.client.TxncoreClientService;
import com.pay.gateway.dto.CrosspayRequest;
import com.pay.gateway.dto.CrosspayResponse;
import com.pay.inf.rule.MessageRule;

/**
 * 验证订单号重复
 */
public class OrderRepeatCheckRule extends MessageRule {

	private TxncoreClientService txncoreClientService;

	public void setTxncoreClientService(TxncoreClientService txncoreClientService) {
		this.txncoreClientService = txncoreClientService;
	}



	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pay.ruleengine.AbstractRule#makeDecision(java.lang.Object)
	 */
	@Override
	protected boolean makeDecision(Object validateBean) throws Exception {

		CrosspayRequest crosspayApiRequest = (CrosspayRequest) validateBean;
		CrosspayResponse crosspayApiResponse = crosspayApiRequest.getCrosspayResponse();

		String orderId = crosspayApiRequest.getOrderId();
		String memberCode = crosspayApiRequest.getPartnerId();
        
		Map<String,String> params = new HashMap<String, String>();
		params.put("orderId",orderId);
		params.put("partnerId",memberCode);
		params.put("status","1,2,3,4,20");
		
		Map<String,Object> map = txncoreClientService.completedOrderQuery(params); 	
		String hasTradeOrder = (String) map.get("hasTradeOrder");
		if ("0".equals(hasTradeOrder)) {
			return true;
		} else {
			crosspayApiResponse.setResultCode(getMessageId());
			crosspayApiResponse.setResultMsg(getMessage());
			return false;
		}
	}

}
