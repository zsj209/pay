/**
 *  File: 
 *  Description:
 *  Copyright 2006-2011 pay Corporation. All rights reserved.
 *  Date      Author      Changes
 *  2011-9-12   terry     Create
 *
 */
package com.pay.gateway.validate.preauth.completed;

import java.util.List;
import java.util.Map;

import com.pay.acc.member.dto.MemberDto;
import com.pay.acc.member.service.MemberService;
import com.pay.fi.commons.PaymentTypeEnum;
import com.pay.fi.commons.TransTypeEnum;
import com.pay.gateway.client.ChannelClientService;
import com.pay.gateway.dto.preauth.PreauthCompletedRequest;
import com.pay.gateway.dto.preauth.PreauthCompletedResponse;
import com.pay.inf.rule.MessageRule;

/**
 * 商户配置渠道
 */
public class MerchantChannelCheckRule extends MessageRule {

	private MemberService memberService;
	private ChannelClientService channelClientService;

	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}

	public void setChannelClientService(
			ChannelClientService channelClientService) {
		this.channelClientService = channelClientService;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pay.ruleengine.AbstractRule#makeDecision(java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	@Override
	protected boolean makeDecision(Object validateBean) throws Exception {
		PreauthCompletedRequest crosspayApiRequest = (PreauthCompletedRequest) validateBean;
		PreauthCompletedResponse crosspayApiResponse = crosspayApiRequest.getPreauthCompletedResponse();

		String memberCode = crosspayApiRequest.getPartnerId();

		MemberDto memberDto = memberService.queryMemberByMemberCode(Long
				.valueOf(memberCode));

		Map<String,Object> resultMap = channelClientService.getPaymentChannel(memberCode,
				PaymentTypeEnum.PREAUTH.getCode(), memberDto.getType() + "",
				TransTypeEnum.EDC.getCode());

		List<Map> paymentChannelItems = (List<Map>) resultMap
				.get("paymentChannelItems");

		if (null != paymentChannelItems && !paymentChannelItems.isEmpty()) {
			return true;
		} else {
			crosspayApiResponse.setResultCode(getMessageId());
			crosspayApiResponse.setResultMsg(getMessage());
			return false;
		}
	}

}
