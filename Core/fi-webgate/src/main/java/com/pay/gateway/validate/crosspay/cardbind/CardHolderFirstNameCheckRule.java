/**
 *  File: 
 *  Description:
 *  Copyright 2006-2011 pay Corporation. All rights reserved.
 *  Date      Author      Changes
 *  2011-9-12   terry     Create
 *
 */
package com.pay.gateway.validate.crosspay.cardbind;


import com.pay.gateway.dto.CardBindRequest;
import com.pay.gateway.dto.CardBindResponse;
import com.pay.gateway.dto.CrosspayRequest;
import com.pay.gateway.dto.CrosspayResponse;
import com.pay.inf.rule.MessageRule;
import com.pay.util.StringUtil;

/**
 * 验证网关版本
 */
public class CardHolderFirstNameCheckRule extends MessageRule {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pay.ruleengine.AbstractRule#makeDecision(java.lang.Object)
	 */
	@Override
	protected boolean makeDecision(Object validateBean) throws Exception {

		CardBindRequest cardBindRequest = (CardBindRequest) validateBean;
		CardBindResponse cardBindResponse = cardBindRequest.getCardBindResponse();

		String cardHolderFirstName = cardBindRequest
				.getCardHolderFirstName();

		if (!StringUtil.isEmpty(cardHolderFirstName)) {
			return true;
		} else {
			cardBindResponse.setResultCode(getMessageId());
			cardBindResponse.setResultMsg(getMessage());
			return false;
		}
	}

}