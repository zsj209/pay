/**
 *  File: 
 *  Description:
 *  Copyright 2006-2011 pay Corporation. All rights reserved.
 *  Date      Author      Changes
 *  2011-9-12   terry     Create
 *
 */
package com.pay.gateway.validate.crosspay.api;

import com.pay.acc.member.dto.EnterpriseBaseDto;
import com.pay.acc.member.service.EnterpriseBaseService;
import com.pay.gateway.dto.CrosspayApiRequest;
import com.pay.gateway.dto.CrosspayApiResponse;
import com.pay.inf.rule.MessageRule;

/**
 * 商户配置渠道
 */
public class MerchantSettlementCheckRule extends MessageRule {

	private EnterpriseBaseService enterpriseBaseService;

	public void setEnterpriseBaseService(
			EnterpriseBaseService enterpriseBaseService) {
		this.enterpriseBaseService = enterpriseBaseService;
	}

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

		String memberCode = crosspayApiRequest.getPartnerId();

		EnterpriseBaseDto enterpriseBaseDto = enterpriseBaseService
				.queryEnterpriseBaseByMemberCode(Long.valueOf(memberCode));

		if (null != enterpriseBaseDto
				&& null != enterpriseBaseDto.getPercentage()
				&& enterpriseBaseDto.getSettlementCycle() != null) {
			return true;
		} else {
			crosspayApiResponse.setResultCode(getMessageId());
			crosspayApiResponse.setResultMsg(getMessage());
			return false;
		}

	}

}
