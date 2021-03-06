package com;

import java.util.Date;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.testng.annotations.Test;

import com.pay.pe.helper.OrgCode;
import com.pay.pe.helper.OrgType;
import com.pay.pe.helper.TerminalType;
import com.pay.pe.service.CalFeeReponse;
import com.pay.pe.service.CalFeeRequest;
import com.pay.pe.service.PEService;

@ContextConfiguration(locations = { "classpath*:/context/*.xml" })
@TransactionConfiguration(transactionManager = "peTransactionManager", defaultRollback = false)
@Transactional
public class CardCalFeeServiceTest extends
		AbstractTransactionalTestNGSpringContextTests {


	@Resource
	private PEService peService;
	
	private  String getOrderCode(int pkgCode){
//		int a = Integer.parseInt(pkgCode);
		int a = pkgCode ;
		int b = a/10 ;
		int c = b*10 ;
//		System.out.println(c);
		return c+"" ;
	}
	
	private CalFeeRequest initCalFeeRequest(int PkgCode,int payer,int payee ){
		CalFeeRequest calFeeReqDto = new CalFeeRequest();
		
		calFeeReqDto.setOrderId("1021010081530013380");
		calFeeReqDto.setOrderAmount(100l);
		calFeeReqDto.setSubmitAcctCode("0");
		calFeeReqDto.setAmount(100l);
		
		
		calFeeReqDto.setPaymentServicePkgCode(PkgCode); //枚举类由魏峰统一提供
		calFeeReqDto.setDealCode(PkgCode);                //枚举类由魏峰统一提供
		calFeeReqDto.setOrderCode(Integer.parseInt(getOrderCode(PkgCode)));               //枚举类由魏峰统一提供
		calFeeReqDto.setPayMethod(1);                 //枚举类由魏峰统一提供
		calFeeReqDto.setTerminalType(TerminalType.WEB.getValue());
		
		
		calFeeReqDto.setRequestDate(new Date());
		
		if(payer==1){
			calFeeReqDto.setPayerOrgType(OrgType.MEMBER.getValue());
			calFeeReqDto.setPayerAcctType(10);          //科目无需设置账户类型
//			calFeeReqDto.setPayer("10000000099");                  //科目无需设置payee
			calFeeReqDto.setPayer("10000000005");                  //科目无需设置payee
			
			calFeeReqDto.setPayerMemberAcctCode("1000000000510");    //科目无需设置账户账号全称
			calFeeReqDto.setPayerFullMemberAcctCode("20010200100011000000000510");  //科目无需设置账户全称
		}else{
			calFeeReqDto.setPayerOrgType(OrgType.BANK.getValue());
			calFeeReqDto.setPayerOrgCode(OrgCode.MOCK001.getValue());    
		}
		
		if(payee==1){
			calFeeReqDto.setPayeeOrgType(1);
			calFeeReqDto.setPayeeAcctType(10);
			calFeeReqDto.setPayee("10000000200");			
			calFeeReqDto.setPayeeMemberAcctCode("1000000020010");
			calFeeReqDto.setPayeeFullMemberAcctCode("20010200100011000000020010");
		}else{
	           //魏峰定义
			calFeeReqDto.setPayeeOrgType(OrgType.BANK.getValue());
			calFeeReqDto.setPayeeOrgCode(OrgCode.MOCK001.getValue());
		}
		return calFeeReqDto ;
	}
	
//	@Test
//	public void testCalculateFeeDetai301() throws Exception {
//		CalFeeRequest calFeeReqDto = initCalFeeRequest(301,3,1);
//		CalFeeReponse calFeeReponse = peService.calculateFeeDetail(calFeeReqDto);
//		peService.accountingCalFeeReponse(calFeeReponse);
//	}
	
	@Test
	public void testCalculateFeeDetai701() throws Exception {
		CalFeeRequest calFeeReqDto = initCalFeeRequest(701,3,1);
//		CalFeeReponse calFeeRespone = peService.processPayment(calFeeReqDto);
//		peService.accountingCalFeeReponse(calFeeRespone);
	}
	
	
	@Test
	public void testCalculateFeeDetai711() throws Exception {
		CalFeeRequest calFeeReqDto = initCalFeeRequest(711,3,1);
//		CalFeeReponse calFeeRespone = peService.processPayment(calFeeReqDto);
//		peService.accountingCalFeeReponse(calFeeRespone);
	}
	
	
	@Test
	public void testCalculateFeeDetai712() throws Exception {
		CalFeeRequest calFeeReqDto = initCalFeeRequest(712,1,1);
//		CalFeeReponse calFeeRespone = peService.processPayment(calFeeReqDto);
//		peService.accountingCalFeeReponse(calFeeRespone);
	}
	
	@Test
	public void testCalculateFeeDetai713() throws Exception {
		CalFeeRequest calFeeReqDto = initCalFeeRequest(713,3,3);
//		CalFeeReponse calFeeRespone = peService.processPayment(calFeeReqDto);
//		peService.accountingCalFeeReponse(calFeeRespone);
	}

	
	@Test
	public void testCalculateFeeDetai721() throws Exception {
		CalFeeRequest calFeeReqDto = initCalFeeRequest(721,3,1);
//		CalFeeReponse calFeeRespone = peService.processPayment(calFeeReqDto);
//		peService.accountingCalFeeReponse(calFeeRespone);
	}
	
	@Test
	public void testCalculateFeeDetai741() throws Exception {
		CalFeeRequest calFeeReqDto = initCalFeeRequest(741,3,1);
//		CalFeeReponse calFeeRespone = peService.processPayment(calFeeReqDto);
//		peService.accountingCalFeeReponse(calFeeRespone);
	}
	
	
	@Test
	public void testCalculateFeeDetai761() throws Exception {
		CalFeeRequest calFeeReqDto = initCalFeeRequest(761,3,1);
//		CalFeeReponse calFeeRespone = peService.processPayment(calFeeReqDto);
//		peService.accountingCalFeeReponse(calFeeRespone);
	}
	
	
	
	
	
	

	

	
	
	
	
	
	
	
	
	
}