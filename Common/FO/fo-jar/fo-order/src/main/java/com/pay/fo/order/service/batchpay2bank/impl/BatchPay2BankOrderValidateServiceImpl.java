/**
 * 
 */
package com.pay.fo.order.service.batchpay2bank.impl;

import com.pay.fo.order.common.OrderType;
import com.pay.fo.order.service.base.FundoutOrderService;
import com.pay.fo.order.service.batchpay2bank.BatchPay2BankOrderValidateService;
import com.pay.fundout.util.AmountUtils;
import com.pay.rm.FoRcLimitFacade;
import com.pay.rm.facade.dto.RCLimitResultDTO;
import com.pay.rm.facade.util.RCLIMITCODE;
import com.pay.util.StringUtil;

/**
 * @author NEW
 *
 */
public class BatchPay2BankOrderValidateServiceImpl implements
		BatchPay2BankOrderValidateService {
	
	private FundoutOrderService fundoutOrderService;
	
	/**
	 * 风控限额限次查询服务类
	 */
	private FoRcLimitFacade foRcLimitFacade;

	@Override
	public String validateRCLimitInfo(long memberCode,long paymentAmount,int paymentCount) {
		String message = null;
		RCLimitResultDTO rcLimitInfo = foRcLimitFacade.getBusinessRcLimit(RCLIMITCODE.FO_PAY_ENTERPRISE_BANK2P.getKey(), null, memberCode);
		if(null==rcLimitInfo){
			message = "暂不支持该业务";
		}else{
//			if(paymentAmount>rcLimitInfo.getSingleLimit()){//单笔限额
//				message = "单笔最多付款"+AmountUtils.numberFormat(rcLimitInfo.getSingleLimit())+"元";
//			}
			if(StringUtil.isNull(message)){
				Integer monthTimes = fundoutOrderService.countCurrentMonthPaymentTimes(OrderType.BATCHPAY2BANK.getValue(),memberCode);
				Integer dayTimes = fundoutOrderService.countCurrentDayPaymentTimes(OrderType.BATCHPAY2BANK.getValue(),memberCode);
				int monthLimitTimes = rcLimitInfo.getMonthTimes() - monthTimes.intValue();
				int dayLimitTimes = rcLimitInfo.getDayTimes() - dayTimes.intValue();
				if(monthLimitTimes<dayLimitTimes){//如果每月剩余次数小于每日剩余次数,则先校验每月次数
					if(monthTimes+paymentCount > rcLimitInfo.getMonthTimes()){ //每月限次  每月最多付款${pay2BankMonthLimitTimes}次，您今天还可以付款${allowPaymentTimes}次
						if(monthLimitTimes<0){
							monthLimitTimes = 0;
						}
						message = "每月最多付款"+rcLimitInfo.getMonthTimes()+"次，您今天还可以付款"+monthLimitTimes+"次";
					}
				}else{
					if(dayTimes+paymentCount> rcLimitInfo.getDayTimes()){ //每日限次
						if(dayLimitTimes<0){
							dayLimitTimes = 0;
						}
						message = "每日最多付款"+rcLimitInfo.getDayTimes()+"次，您今天还可以付款"+dayLimitTimes+"次";
					}
				}
			}
			
			if(StringUtil.isNull(message)){
				Long currentDayAmount = fundoutOrderService.sumCurrentDayPaymentAmount(OrderType.BATCHPAY2BANK.getValue(),memberCode);
				Long currentMonthAmount = fundoutOrderService.sumCurrentMonthPaymentAmount(OrderType.BATCHPAY2BANK.getValue(),memberCode);
				long monthLimitAmount = rcLimitInfo.getMonthLimit()-currentMonthAmount.longValue();
				long dayLimitAmount = rcLimitInfo.getDayLimit()-currentDayAmount.longValue();
				if(monthLimitAmount<dayLimitAmount){//如果每月剩余限额小于每日剩余限额,则先校验每月限额
					if(paymentAmount+currentMonthAmount > rcLimitInfo.getMonthLimit()){//每月限额
						if(monthLimitAmount<0){
							monthLimitAmount = 0;
						}
						message = "每月最多付款"+AmountUtils.numberFormat(rcLimitInfo.getMonthLimit())+"元，您今天还可以付款"+AmountUtils.numberFormat(monthLimitAmount)+"元";
					}
				}else{
					if(paymentAmount+currentDayAmount>rcLimitInfo.getDayLimit()){//每日限额
						if(dayLimitAmount<0){
							dayLimitAmount = 0;
						}
						message = "每日最多付款"+AmountUtils.numberFormat(rcLimitInfo.getDayLimit())+"元，您今天还可以付款"+AmountUtils.numberFormat(dayLimitAmount)+"元";
					}
				}
			}
		}
		
		return message;
	}

	/**
	 * @param fundoutOrderService the fundoutOrderService to set
	 */
	public void setFundoutOrderService(FundoutOrderService fundoutOrderService) {
		this.fundoutOrderService = fundoutOrderService;
	}

	/**
	 * @param foRcLimitFacade the foRcLimitFacade to set
	 */
	public void setFoRcLimitFacade(FoRcLimitFacade foRcLimitFacade) {
		this.foRcLimitFacade = foRcLimitFacade;
	}
	

}
