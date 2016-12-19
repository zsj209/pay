/**
 * 
 */
package com.pay.txncore.handler.partnerreconcile.dto;

/**
 * @author chaoyue
 *
 */
public class PartnerRiskDto {

	// 清算时间
	private String settlementDate;

	// 交易金额
	private String orderAmount;

	// 交易币种
	private String currencyCode;

	// 交易类型
	private String dealType;

	// 交易状态
	private String status;

	// 清算币种
	private String settlementCurrencyCode;

	// 风控手续费
	private String riskFee;

	// 风控手续费币种
	private String riskCurrencyCode;

	// 风控手续费汇率
	private String riskRate;

	// 从风控基本户扣除金额
	private String riskAmount;

	// 商户订单号
	private String orderId;

	// 系统交易流水号
	private String tradeOrderNo;

	// 订单发生时间
	private String orderTime;

	public String getSettlementDate() {
		return settlementDate;
	}

	public void setSettlementDate(String settlementDate) {
		this.settlementDate = settlementDate;
	}

	public String getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getDealType() {
		return dealType;
	}

	public void setDealType(String dealType) {
		this.dealType = dealType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSettlementCurrencyCode() {
		return settlementCurrencyCode;
	}

	public void setSettlementCurrencyCode(String settlementCurrencyCode) {
		this.settlementCurrencyCode = settlementCurrencyCode;
	}

	public String getRiskFee() {
		return riskFee;
	}

	public void setRiskFee(String riskFee) {
		this.riskFee = riskFee;
	}

	public String getRiskCurrencyCode() {
		return riskCurrencyCode;
	}

	public void setRiskCurrencyCode(String riskCurrencyCode) {
		this.riskCurrencyCode = riskCurrencyCode;
	}

	public String getRiskRate() {
		return riskRate;
	}

	public void setRiskRate(String riskRate) {
		this.riskRate = riskRate;
	}

	public String getRiskAmount() {
		return riskAmount;
	}

	public void setRiskAmount(String riskAmount) {
		this.riskAmount = riskAmount;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getTradeOrderNo() {
		return tradeOrderNo;
	}

	public void setTradeOrderNo(String tradeOrderNo) {
		this.tradeOrderNo = tradeOrderNo;
	}

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

}
