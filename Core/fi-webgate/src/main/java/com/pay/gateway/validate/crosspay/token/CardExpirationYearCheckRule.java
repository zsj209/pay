/**
 *  File: 
 *  Description:
 *  Copyright 2006-2011 pay Corporation. All rights reserved.
 *  Date      Author      Changes
 *  2011-9-12   terry     Create
 *
 */
package com.pay.gateway.validate.crosspay.token;


import com.pay.gateway.dto.CrosspayRequest;
import com.pay.gateway.dto.CrosspayResponse;
import com.pay.gateway.dto.TokenpayRequest;
import com.pay.gateway.dto.TokenpayResponse;
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

		TokenpayRequest crosspayApiRequest = (TokenpayRequest) validateBean;
		TokenpayResponse crosspayApiResponse = crosspayApiRequest.getTokenpayResponse();

		return true;
//		String cardExpirationYear = crosspayApiRequest.getCardExpirationYear();
//
//		if (!StringUtil.isEmpty(cardExpirationYear)) {
//			int year=0;
//			try{
//				year = Integer.valueOf(cardExpirationYear);
//				if(year>2117||year<=0){
//					crosspayApiResponse.setResultCode(getMessageId());
//					crosspayApiResponse.setResultMsg(getMessage());
//					return false;
//				}
//			}catch(Exception e){
//				e.printStackTrace();
//				crosspayApiResponse.setResultCode(getMessageId());
//				crosspayApiResponse.setResultMsg(getMessage());
//				return false;
//			}
//			return true;
//		} else {
//			crosspayApiResponse.setResultCode(getMessageId());
//			crosspayApiResponse.setResultMsg(getMessage());
//			return false;
//		}
	}

}
