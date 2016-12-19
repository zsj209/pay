/**
 *  File: 
 *  Description:
 *  Copyright 2006-2011 pay Corporation. All rights reserved.
 *  Date      Author      Changes
 *  2011-9-12   terry     Create
 *
 */
package com.pay.gateway.validate.crosspay.api;

import java.text.SimpleDateFormat;

import com.pay.gateway.dto.CrosspayApiRequest;
import com.pay.gateway.dto.CrosspayApiResponse;
import com.pay.inf.rule.MessageRule;

/**
 * 验证提交时间
 */
public class SubmitTimeCheckRule extends MessageRule {

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

		String submitTime = crosspayApiRequest.getSubmitTime();
		
		if(submitTime == null || submitTime.trim().length() != 14) {
			crosspayApiResponse.setResultCode(getMessageId());
			crosspayApiResponse.setResultMsg("Submit time is empty or length is not 14 bits : 商户提交时间为空或者长度不为14");
			return false;
		}

		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddHHMMSS");
		try {
			sf.parse(submitTime);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			crosspayApiResponse.setResultCode(getMessageId());
			crosspayApiResponse.setResultMsg(getMessage());
			return false;
		}
	}
}
