/**
 *  File: 
 *  Description:
 *  Copyright 2006-2011 pay Corporation. All rights reserved.
 *  Date      Author      Changes
 *  2011-9-12   terry     Create
 *
 */
package com.pay.gateway.validate.crosspay.cashier;

import com.pay.gateway.dto.CrosspayGatewayRequest;
import com.pay.gateway.dto.CrosspayGatewayResponse;
import com.pay.inf.rule.MessageRule;
import com.pay.util.NumberUtil;
import com.pay.util.StringUtil;

/**
 * 验证订单号
 */
public class OrderIdCheckRule extends MessageRule {
    private String messageEn;
    
	public String getMessageEn() {
		return messageEn;
	}
	public void setMessageEn(String messageEn) {
		this.messageEn = messageEn;
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pay.ruleengine.AbstractRule#makeDecision(java.lang.Object)
	 */
	@Override
	protected boolean makeDecision(Object validateBean) throws Exception {

		CrosspayGatewayRequest onlineRequestDTO = (CrosspayGatewayRequest) validateBean;
		CrosspayGatewayResponse onlineResponseDTO = onlineRequestDTO
				.getGatewayResponseDTO();

		String orderId = onlineRequestDTO.getOrderId();
		String language = onlineRequestDTO.getLanguage();

		if (!StringUtil.isEmpty(orderId) && NumberUtil.isNumber(orderId) && orderId.length() <=32) {
			return true;
		} else {
			if("cn".equals(language))
				onlineResponseDTO.setResultMsg(getMessage());
			else
				onlineResponseDTO.setResultMsg(getMessageEn());
			onlineResponseDTO.setResultCode(getMessageId());
			return false;
		}
	}

}
