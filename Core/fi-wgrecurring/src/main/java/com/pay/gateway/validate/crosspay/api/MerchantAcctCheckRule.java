/**
 *  File: 
 *  Description:
 *  Copyright 2006-2011 pay Corporation. All rights reserved.
 *  Date      Author      Changes
 *  2011-9-12   terry     Create
 *
 */
package com.pay.gateway.validate.crosspay.api;

import com.pay.acc.acctattrib.dto.AcctAttribDto;
import com.pay.acc.service.account.AccountQueryService;
import com.pay.acc.service.account.constantenum.AcctTypeEnum;
import com.pay.gateway.dto.CrosspayApiRequest;
import com.pay.gateway.dto.CrosspayApiResponse;
import com.pay.inf.rule.MessageRule;
import com.pay.util.StringUtil;

/**
 * 验证网关商户账户属性
 */
public class MerchantAcctCheckRule extends MessageRule {

	private AccountQueryService accountQueryService;

	public void setAccountQueryService(AccountQueryService accountQueryService) {
		this.accountQueryService = accountQueryService;
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

		String partnerId = crosspayApiRequest.getPartnerId();
		String settlementCurrencyCode = crosspayApiRequest
				.getSettlementCurrencyCode();

		try {

			Integer acctType = null;
			AcctAttribDto acctAttribDto = null;

			if (!StringUtil.isEmpty(settlementCurrencyCode)) {
				acctType = AcctTypeEnum
						.getBasicAcctTypeByCurrency(settlementCurrencyCode);
				acctAttribDto = accountQueryService.doQueryAcctAttribNsTx(
						Long.valueOf(partnerId), acctType);
				// 结算账户不存在
				if (acctAttribDto == null) {
					crosspayApiResponse.setResultCode(getMessageId());
					crosspayApiResponse.setResultMsg(getMessage());
					return false;
				}

				acctType = AcctTypeEnum
						.getGuaranteeAcctTypeByCurrency(settlementCurrencyCode);
				acctAttribDto = accountQueryService.doQueryAcctAttribNsTx(
						Long.valueOf(partnerId), acctType);

				// 保证金账户不存在
				if (acctAttribDto == null) {
					crosspayApiResponse.setResultCode(getMessageId());
					crosspayApiResponse.setResultMsg(getMessage());
					return false;
				}
			} else {
				acctAttribDto = accountQueryService
						.doQueryDefaultAcctAttribNsTx(Long.valueOf(partnerId));

				// 结算账户不存在
				if (acctAttribDto == null) {
					crosspayApiResponse.setResultCode(getMessageId());
					crosspayApiResponse.setResultMsg(getMessage());
					return false;
				}

				acctType = AcctTypeEnum
						.getGuaranteeAcctTypeByCurrency(acctAttribDto
								.getCurCode());
				acctAttribDto = accountQueryService.doQueryAcctAttribNsTx(
						Long.valueOf(partnerId), acctType);
				// 保证金账户不存在
				if (acctAttribDto == null) {
					crosspayApiResponse.setResultCode(getMessageId());
					crosspayApiResponse.setResultMsg(getMessage());
					return false;
				}
			}

			if (null != acctAttribDto && acctAttribDto.getFrozen() != 0
					&& acctAttribDto.getAllowIn() != 0) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
			crosspayApiResponse.setResultCode(getMessageId());
			crosspayApiResponse.setResultMsg(getMessage());
			return false;
		}

	}

}
