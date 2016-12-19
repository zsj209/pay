package com.pay.fundout.securitycheck.voter.spi.acct.impl;

import javax.annotation.Resource;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pay.fundout.securitycheck.common.Constants;
import com.pay.fundout.securitycheck.model.DenyVoteMsg;
import com.pay.fundout.securitycheck.model.Principal;
import com.pay.fundout.securitycheck.voter.Voter;

@ContextConfiguration(locations = { "classpath*:config/env/test-dataAccessContext.xml", "classpath*:context/spring/**/*.xml", "classpath*:config/spring/**/*.xml", "classpath*:context/*.xml" })
public class PayerMemberStatusVoterTest extends AbstractTestNGSpringContextTests {
	@Resource(name = "fundout-securitycheck-PayerMemberStatusVoter")
	private Voter memberStatusVoter;

	@Test
	public void test正常会员() {

		Principal principal = new Principal("20");
		principal.setPayerMemberCode("10000000439");
		principal.setPayerMemberType(1);
		principal.setPayerAcctType("10");

		// 收款方为正常会员，应投票通过
		Assert.assertEquals(memberStatusVoter.vote(principal, new DenyVoteMsg()), Voter.GRANTED);
	}

	@Test
	public void test非正常会员() {

		Principal principal = new Principal("20");
		principal.setPayerMemberCode("10000000118");
		principal.setPayerMemberType(1);
		principal.setPayerAcctType("10");

		DenyVoteMsg msg = new DenyVoteMsg();
		// 收款方为正常会员，应投票通过
		Assert.assertEquals(memberStatusVoter.vote(principal, msg), Voter.DENIED);
		Assert.assertEquals(Constants.DENY_CODE_MEMBER_PAYER_STATUS, msg.getCode());
	}

}
