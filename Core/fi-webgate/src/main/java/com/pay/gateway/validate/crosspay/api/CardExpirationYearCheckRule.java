/**
 *  File: 
 *  Description:
 *  Copyright 2006-2011 pay Corporation. All rights reserved.
 *  Date      Author      Changes
 *  2011-9-12   terry     Create
 *
 */
package com.pay.gateway.validate.crosspay.api;

import com.pay.gateway.dto.CrosspayApiRequest;
import com.pay.gateway.dto.CrosspayApiResponse;
import com.pay.inf.rule.MessageRule;
import com.pay.util.StringUtil;

/**
 * 验证网关版本
 */
public class CardExpirationYearCheckRule extends MessageRule {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pay.ruleengine.AbstractRule#makeDecision(java.lang.Object)
	 */
	@Override
	protected boolean makeDecision(Object validateBean) throws Exception {

		CrosspayApiRequest crosspayApiRequest = (CrosspayApiRequest) validateBean;
		CrosspayApiResponse crosspayApiResponse = crosspayApiRequest
				.getCrosspayApiResponse();

		String cardExpirationYear = crosspayApiRequest.getCardExpirationYear();

		if ((!StringUtil.isEmpty(cardExpirationYear)) && cardExpirationYear.length() == 2) {
			try{
				Integer.parseInt(cardExpirationYear);
			}catch (Exception e){
				e.printStackTrace();
				crosspayApiResponse.setResultCode(getMessageId());
				crosspayApiResponse.setResultMsg(getMessage());
				return false;
			}
			return true;
		} else {
			crosspayApiResponse.setResultCode(getMessageId());
			crosspayApiResponse.setResultMsg(getMessage());
			return false;
		}
	}

}
