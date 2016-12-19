/**
 *  File: 
 *  Description:
 *  Copyright 2006-2011 pay Corporation. All rights reserved.
 *  Date      Author      Changes
 *  2011-9-12   terry     Create
 *
 */
package com.pay.gateway.validate.crosspay.token;

import org.apache.commons.lang.StringUtils;

import com.pay.fi.service.TradeDataSingnatureService;
import com.pay.gateway.dto.CrosspayRequest;
import com.pay.gateway.dto.CrosspayResponse;
import com.pay.gateway.dto.TokenpayRequest;
import com.pay.gateway.dto.TokenpayResponse;
import com.pay.inf.rule.AbstractAction;
import com.pay.util.CharsetTypeEnum;

/**
 * 验证订单号
 */
public class ExceptionAction extends AbstractAction {

	private TradeDataSingnatureService tradeDataSingnatureService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pay.ruleengine.AbstractRule#makeDecision(java.lang.Object)
	 */
	@Override
	protected void doExecute(Object validateBean) throws Exception {

		TokenpayRequest crosspayApiRequest = (TokenpayRequest) validateBean;
		TokenpayResponse crosspayApiResponse = crosspayApiRequest.getTokenpayResponse();
		String signType = crosspayApiRequest.getSignType();
		String charsetType = crosspayApiRequest.getCharset();
		String partnerId = crosspayApiRequest.getPartnerId();

		String signData = crosspayApiResponse.generateSign();
		String signMsg = "" ;
		if(StringUtils.isNotEmpty(charsetType) && charsetType.equals(CharsetTypeEnum.UTF8.getCode())){
			signMsg = tradeDataSingnatureService.genSignMsgBySignType(
					signData, signType, charsetType, partnerId);
		}
		crosspayApiResponse.setSignMsg(signMsg);
	}

	public void setTradeDataSingnatureService(
			TradeDataSingnatureService tradeDataSingnatureService) {
		this.tradeDataSingnatureService = tradeDataSingnatureService;
	}
}
