/**
 *
 * auto generated by ibatis tools 
 *
 **/
package com.pay.txncore.dto;

import java.util.Date;

/**
 * DEPOSIT_PROTOCOL
 */

public class ChannelOrderDTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Long amount;
	private String serialNo;
	private String returnNo;
	private Integer status;
	private Long channelOrderNo;
	private Long paymentOrderNo;
	private String merchantNo;
	private String orgCode;
	private String currencyCode;
	private String transferCurrencyCode;
	private java.util.Date createDate;
	private java.util.Date completeDate;
	private java.util.Date updateDate;
	private Long payAmount;
	private Integer reconciliationFlg;
	private String settlementCurrencyCode;
	private String settlementRate;
	private String transferRate;

	private String errorCode;
	private String errorMsg;

	private String dccCurrencyCode;
	private String dccRate;
	private String dccAmount;

	private String authorisation;
	private String referenceNo;//添加参考号返回值 add by davis.guo at 2016-08-14

	//
	private String settAmount;
	//
	private String transFee;
	
	//
	private String settleDate;
	
	private Long partnerId;
	private Long tradeOrderNo;
	private String cardNumber;
	private String cardOrg;//卡组织
	private String merchantBillName;
	private String orderId;
	//浮动之前的汇率
	private String originalRate;
	
	//汇率浮动的值
	private String floatValue;
	
	//通道商户号的授权码
	private String  accessCode;
	
	//通道商户号秘钥
	private String  orgKey;
	
	//操作人
	private String operator;
		//批次
	private String bacthNo;
		
	private Date bacthCreateDate;
	
	private String terminalCode;
	
	// 是否dcc edc ALL
	private String payType;
	
	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}
	
	public String getTerminalCode() {
		return terminalCode;
	}
	public void setTerminalCode(String terminalCode) {
		this.terminalCode = terminalCode;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getBacthNo() {
		return bacthNo;
	}
	public void setBacthNo(String bacthNo) {
		this.bacthNo = bacthNo;
	}
	public Date getBacthCreateDate() {
		return bacthCreateDate;
	}
	public void setBacthCreateDate(Date bacthCreateDate) {
		this.bacthCreateDate = bacthCreateDate;
	}
	public String getAccessCode() {
		return accessCode;
	}
	public void setAccessCode(String accessCode) {
		this.accessCode = accessCode;
	}
	public String getOrgKey() {
		return orgKey;
	}
	public void setOrgKey(String orgKey) {
		this.orgKey = orgKey;
	}
	public String getOriginalRate() {
		return originalRate;
	}
	public void setOriginalRate(String originalRate) {
		this.originalRate = originalRate;
	}

	public String getFloatValue() {
		return floatValue;
	}

	public void setFloatValue(String floatValue) {
		this.floatValue = floatValue;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	
    
	public String getMerchantBillName() {
		return merchantBillName;
	}

	public void setMerchantBillName(String merchantBillName) {
		this.merchantBillName = merchantBillName;
	}

	public String getCardOrg() {
		return cardOrg;
	}

	public void setCardOrg(String cardOrg) {
		this.cardOrg = cardOrg;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public Long getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(Long partnerId) {
		this.partnerId = partnerId;
	}

	public Long getTradeOrderNo() {
		return tradeOrderNo;
	}

	public void setTradeOrderNo(Long tradeOrderNo) {
		this.tradeOrderNo = tradeOrderNo;
	}

	public String getTransferRate() {
		return transferRate;
	}

	public void setTransferRate(String transferRate) {
		this.transferRate = transferRate;
	}

	private String beginTime;
	private String endTime;

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getReturnNo() {
		return returnNo;
	}

	public void setReturnNo(String returnNo) {
		this.returnNo = returnNo;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getChannelOrderNo() {
		return channelOrderNo;
	}

	public void setChannelOrderNo(Long channelOrderNo) {
		this.channelOrderNo = channelOrderNo;
	}

	public Long getPaymentOrderNo() {
		return paymentOrderNo;
	}

	public void setPaymentOrderNo(Long paymentOrderNo) {
		this.paymentOrderNo = paymentOrderNo;
	}

	public String getMerchantNo() {
		return merchantNo;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public java.util.Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(java.util.Date createDate) {
		this.createDate = createDate;
	}

	public java.util.Date getCompleteDate() {
		return completeDate;
	}

	public void setCompleteDate(java.util.Date completeDate) {
		this.completeDate = completeDate;
	}

	public java.util.Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(java.util.Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public Long getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(Long payAmount) {
		this.payAmount = payAmount;
	}

	public String getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Integer getReconciliationFlg() {
		return reconciliationFlg;
	}

	public void setReconciliationFlg(Integer reconciliationFlg) {
		this.reconciliationFlg = reconciliationFlg;
	}

	public String getSettlementCurrencyCode() {
		return settlementCurrencyCode;
	}

	public void setSettlementCurrencyCode(String settlementCurrencyCode) {
		this.settlementCurrencyCode = settlementCurrencyCode;
	}

	public String getSettlementRate() {
		return settlementRate;
	}

	public void setSettlementRate(String settlementRate) {
		this.settlementRate = settlementRate;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getTransferCurrencyCode() {
		return transferCurrencyCode;
	}

	public void setTransferCurrencyCode(String transferCurrencyCode) {
		this.transferCurrencyCode = transferCurrencyCode;
	}

	public String getDccCurrencyCode() {
		return dccCurrencyCode;
	}

	public void setDccCurrencyCode(String dccCurrencyCode) {
		this.dccCurrencyCode = dccCurrencyCode;
	}

	public String getDccRate() {
		return dccRate;
	}

	public void setDccRate(String dccRate) {
		this.dccRate = dccRate;
	}

	public String getDccAmount() {
		return dccAmount;
	}

	public void setDccAmount(String dccAmount) {
		this.dccAmount = dccAmount;
	}

	public String getAuthorisation() {
		return authorisation;
	}

	public void setAuthorisation(String authorisation) {
		this.authorisation = authorisation;
	}


	public String getReferenceNo() {
		return referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}
	
	public String getSettAmount() {
		return settAmount;
	}

	public void setSettAmount(String settAmount) {
		this.settAmount = settAmount;
	}

	public String getTransFee() {
		return transFee;
	}

	public void setTransFee(String transFee) {
		this.transFee = transFee;
	}

	public String getSettleDate() {
		return settleDate;
	}

	public void setSettleDate(String settleDate) {
		this.settleDate = settleDate;
	}

}