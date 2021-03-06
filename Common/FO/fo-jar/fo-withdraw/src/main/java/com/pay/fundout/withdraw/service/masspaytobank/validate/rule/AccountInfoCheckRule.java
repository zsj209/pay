/**
 *  File: AccountInfoCheckRule.java
 *  Description:
 *  Copyright 2010 -2010 pay Corporation. All rights reserved.
 *  2010-11-11      bill_peng     Changes
 *  
 *
 */
package com.pay.fundout.withdraw.service.masspaytobank.validate.rule;

import com.pay.inf.rule.MessageRule;
import com.pay.poss.service.ma.pay2bank.Pay2BankValidateService;
import com.pay.util.StringUtil;

/**
 * @author bill_peng
 *
 */
public class AccountInfoCheckRule extends MessageRule {
	
	private Pay2BankValidateService pay2BankValidateService;
	
	
	
	public void setPay2BankValidateService(
			Pay2BankValidateService pay2BankValidateService) {
		this.pay2BankValidateService = pay2BankValidateService;
	}



	/**
	 * 付款账户验规则判断
	 * @param validateBean        待验证规则对象
	 * @return boolean            true表示验证规则通过，false表示该验证规则未通过
	 * @throws Exception          验证中抛出运行时异常
	 */
	protected boolean makeDecision(Object validateBean) throws Exception {
		MassPaytobankDTO dto = (MassPaytobankDTO)validateBean;
		if(dto.getStep()==1){
			return true;
		}
		String msgCode = pay2BankValidateService.validatePayerAccount(dto.getPayerMemberCode(), dto.getPayerAccountType());
		if(StringUtil.isNull(msgCode)){
			return true;
		}
		dto.setMessageId(msgCode);
		return false;
	}
}
