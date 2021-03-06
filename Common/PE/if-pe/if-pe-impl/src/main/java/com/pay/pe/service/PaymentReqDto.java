package com.pay.pe.service;

import java.beans.PropertyDescriptor;
import java.io.Serializable;
import java.util.Date;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import com.pay.pe.helper.TerminalType;

public class PaymentReqDto implements Serializable {
	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = -1013754775625693388L;

	public PaymentReqDto() {
		super();
	}

	/* 是否已算费 */
	private boolean hasCaculatedPrice;
	/* 是否已经计收款方费 */
	private boolean hasCaculatedPayeePrice;
	/* 是否已经计付款方费 */
	private boolean hasCaculatedPayerPrice;
	/* 收款人费用 */
	private Long payeeFee;
	/* 付款人费用 */
	private Long payerFee;
	/* 计费请求对象 */

	/* 订单id */
	private String orderId;
	/* 订单金额 */
	private Long orderAmount;
	
	/**
	 * 商户订单号
	 */
	private String merchantOrderId;

	/* 订单提交 */
	private String submitAcctCode;

	/* 交易金额 */
	private Long amount = 0L;
	private boolean reverse;

	// private String paymentServicePkgCode;

	private Integer orderCode;
	private Integer dealCode;
	private Integer payMethod;

	private Integer terminalType = TerminalType.WEB.getValue();
	private Date requestDate = new Date();
	/**
	 * 支付用户.
	 */
	private String payer;
	/**
	 * 付款方Member Account Code.
	 */
	private String payerMemberAcctCode;

	private Integer payerMemberType;
	/**
	 * 付款账户类型
	 */
	private Integer payerAcctType;

	/**
	 * 付款方FullMember Account Code. 包含科目号
	 */
	private String payerFullMemberAcctCode;
	/**
	 * 付款方机构类型代码.
	 */
	private Integer payerOrgType;
	/**
	 * 支付用户的机构代码.
	 */
	private String payerOrgCode;

	private String payerCurrencyCode;

	private String bankCode;

	/**
	 * 收款用户.
	 */
	private String payee;

	/**
	 * 收款用户的机构代码.
	 */
	private String payeeOrgCode;

	/**
	 * 收款方机构类型代码.
	 */
	private Integer payeeOrgType;

	/**
	 * 收款方Member Account Code.
	 */
	private String payeeMemberAcctCode;

	private Integer payeeMemberType;

	private Integer payeeAcctType;

	/**
	 * 收款方FullMember Account Code. 包含科目号
	 */
	private String payeeFullMemberAcctCode;

	private Integer payeeServiceLevel = null;

	private String payeeCurrencyCode;

	private Long exchangeRate;
	
	public String getMerchantOrderId() {
		return merchantOrderId;
	}

	public void setMerchantOrderId(String merchantOrderId) {
		this.merchantOrderId = merchantOrderId;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Integer getDealCode() {
		return dealCode;
	}

	public Integer getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(Integer orderCode) {
		this.orderCode = orderCode;
	}

	public Integer getPayMethod() {
		return payMethod;
	}

	public void setPayMethod(Integer payMethod) {
		this.payMethod = payMethod;
	}

	public void setDealCode(Integer dealCode) {
		this.dealCode = dealCode;
	}

	public Date getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	public String getPayer() {
		return payer;
	}

	public void setPayer(String payer) {
		this.payer = payer;
	}

	public String getPayerOrgCode() {
		return payerOrgCode;
	}

	public void setPayerOrgCode(String payerOrgCode) {
		this.payerOrgCode = payerOrgCode;
	}

	public String getSubmitAcctCode() {
		return submitAcctCode;
	}

	public void setSubmitAcctCode(String submitAcctCode) {
		this.submitAcctCode = submitAcctCode;
	}

	public String getPayerMemberAcctCode() {
		return payerMemberAcctCode;
	}

	public void setPayerMemberAcctCode(String payerMemberAcctCode) {
		this.payerMemberAcctCode = payerMemberAcctCode;
	}

	public String getPayerFullMemberAcctCode() {
		return payerFullMemberAcctCode;
	}

	public void setPayerFullMemberAcctCode(String payerFullMemberAcctCode) {
		this.payerFullMemberAcctCode = payerFullMemberAcctCode;
	}

	// public Integer getPayerServiceLevel() {
	// return payerServiceLevel;
	// }

	// public void setPayerServiceLevel(Integer payerServiceLevel) {
	// this.payerServiceLevel = payerServiceLevel;
	// }

	public String getPayerCurrencyCode() {
		return payerCurrencyCode;
	}

	public void setPayerCurrencyCode(String payerCurrencyCode) {
		this.payerCurrencyCode = payerCurrencyCode;
	}

	public String getPayee() {
		return payee;
	}

	public void setPayee(String payee) {
		this.payee = payee;
	}

	public String getPayeeOrgCode() {
		return payeeOrgCode;
	}

	public void setPayeeOrgCode(String payeeOrgCode) {
		this.payeeOrgCode = payeeOrgCode;
	}

	public Integer getPayeeServiceLevel() {
		return payeeServiceLevel;
	}

	public void setPayeeServiceLevel(Integer payeeServiceLevel) {
		this.payeeServiceLevel = payeeServiceLevel;
	}

	public String getPayeeCurrencyCode() {
		return payeeCurrencyCode;
	}

	public void setPayeeCurrencyCode(String payeeCurrencyCode) {
		this.payeeCurrencyCode = payeeCurrencyCode;
	}

	public Long getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(Long exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public int getTerminalType() {
		return terminalType;
	}

	public void setTerminalType(int terminalType) {
		this.terminalType = terminalType;
	}

	public Integer getPayerOrgType() {
		return payerOrgType;
	}

	public void setPayerOrgType(Integer payerOrgType) {
		this.payerOrgType = payerOrgType;
	}

	public Integer getPayeeOrgType() {
		return payeeOrgType;
	}

	public void setPayeeOrgType(Integer payeeOrgType) {
		this.payeeOrgType = payeeOrgType;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Long getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Long orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Integer getPayerAcctType() {
		return payerAcctType;
	}

	public void setPayerAcctType(Integer payerAcctType) {
		this.payerAcctType = payerAcctType;
	}

	public Integer getPayeeAcctType() {
		return payeeAcctType;
	}

	public void setPayeeAcctType(Integer payeeAcctType) {
		this.payeeAcctType = payeeAcctType;
	}

	public String getPayeeMemberAcctCode() {
		return payeeMemberAcctCode;
	}

	public void setPayeeMemberAcctCode(String payeeMemberAcctCode) {
		this.payeeMemberAcctCode = payeeMemberAcctCode;
	}

	public String getPayeeFullMemberAcctCode() {
		return payeeFullMemberAcctCode;
	}

	public void setPayeeFullMemberAcctCode(String payeeFullMemberAcctCode) {
		this.payeeFullMemberAcctCode = payeeFullMemberAcctCode;
	}

	public boolean isHasCaculatedPayeePrice() {
		return hasCaculatedPayeePrice;
	}

	public void setHasCaculatedPayeePrice(boolean hasCaculatedPayeePrice) {
		this.hasCaculatedPayeePrice = hasCaculatedPayeePrice;
	}

	public boolean isHasCaculatedPayerPrice() {
		return hasCaculatedPayerPrice;
	}

	public void setHasCaculatedPayerPrice(boolean hasCaculatedPayerPrice) {
		this.hasCaculatedPayerPrice = hasCaculatedPayerPrice;
	}

	public boolean isReverse() {
		return reverse;
	}

	public void setReverse(boolean reverse) {
		this.reverse = reverse;
	}

	public Long getPayeeFee() {
		return payeeFee;
	}

	public void setPayeeFee(Long payeeFee) {
		this.payeeFee = payeeFee;
	}

	public Long getPayerFee() {
		return payerFee;
	}

	public void setPayerFee(Long payerFee) {
		this.payerFee = payerFee;
	}

	public boolean isHasCaculatedPrice() {
		return hasCaculatedPrice;
	}

	public void setHasCaculatedPrice(boolean hasCaculatedPrice) {
		this.hasCaculatedPrice = hasCaculatedPrice;
	}

	public Integer getPayerMemberType() {
		return payerMemberType;
	}

	public void setPayerMemberType(Integer payerMemberType) {
		this.payerMemberType = payerMemberType;
	}

	public Integer getPayeeMemberType() {
		return payeeMemberType;
	}

	public void setPayeeMemberType(Integer payeeMemberType) {
		this.payeeMemberType = payeeMemberType;
	}

	public void setTerminalType(Integer terminalType) {
		this.terminalType = terminalType;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		BeanWrapper beanWrapper = new BeanWrapperImpl(this);
		PropertyDescriptor[] propertyDescriptors = beanWrapper
				.getPropertyDescriptors();
		for (PropertyDescriptor property : propertyDescriptors) {
			String propertyName = property.getDisplayName();
			Object value = beanWrapper.getPropertyValue(propertyName);
			if ("class".equals(propertyName)) {
				continue;
			}
			sb.append("&");
			sb.append(propertyName);
			sb.append("=");
			sb.append(value);
		}
		return sb.toString();
	}

}
