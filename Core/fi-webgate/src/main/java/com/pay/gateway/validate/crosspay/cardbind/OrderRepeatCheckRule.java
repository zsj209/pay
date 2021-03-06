/**
 *  File: 
 *  Description:
 *  Copyright 2006-2011 pay Corporation. All rights reserved.
 *  Date      Author      Changes
 *  2011-9-12   terry     Create
 *
 */
package com.pay.gateway.validate.crosspay.cardbind;

import java.util.HashMap;
import java.util.Map;

import com.pay.gateway.client.TxncoreClientService;
import com.pay.gateway.dto.CardBindRequest;
import com.pay.gateway.dto.CardBindResponse;
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
		CardBindRequest cardBindRequest = (CardBindRequest) validateBean;
		CardBindResponse cardBindResponse = cardBindRequest.getCardBindResponse();

		String orderId = cardBindRequest.getOrderId();
		String memberCode = cardBindRequest.getPartnerId();
        
		Map<String,String> params = new HashMap<String, String>();
		params.put("orderId",orderId);
		params.put("partnerId",memberCode);
		params.put("status","1,2,3,4");
		
		Map map = txncoreClientService.completedOrderQuery(params); 
		
		String hasTradeOrder = (String) map.get("hasTradeOrder");
	
		
		if ("0".equals(hasTradeOrder)) {
			return true;
		} else {
			cardBindResponse.setResultCode(getMessageId());
			cardBindResponse.setResultMsg(getMessage());
			return false;
		}
	}

}
