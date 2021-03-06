/**
*
* auto generated by ibatis tools 
*
**/
package com.pay.fundout.withdraw.model.bankrefund;
/**
* T_BANK_REFUND_ORDER
*/

public class BankRefundOrder  implements java.io.Serializable {

    private Long realPayAmount;
    private String payerAcctCode;
    private Integer status;
    private Long tradeOrderId;
    private String bankOrderId;
    private String payeeAcctCode;
    private String refundPerson;
    private Integer type;
    private java.util.Date updateDate;
    private String bankCode;
    private Long fee;
    private Long amount;
    private Long orderAmount;
    private String payeeName;
    private Integer busiType;
    private Integer payeeAcctType;
    private Long payeeMemberCode;
    private Long sequenceId;
    private java.util.Date createDate;
    private String payerName;
    private String wfInstanceId;
    private String uniqueKey;
    private String oldUniqueKey;
    /** 原业务订单出款银行编号 **/
	private String withdrawBankCode;
    
    
    
    public String getWithdrawBankCode() {
		return withdrawBankCode;
	}

	public void setWithdrawBankCode(String withdrawBankCode) {
		this.withdrawBankCode = withdrawBankCode;
	}

	public Long getRealPayAmount() {
		return realPayAmount;
	}

	public void setRealPayAmount(Long realPayAmount) {
		this.realPayAmount = realPayAmount;
	}

	public String getPayerAcctCode (){
        return payerAcctCode;
    }
    
    public void setPayerAcctCode (String payerAcctCode){
        this.payerAcctCode = payerAcctCode;
    }
    public Integer getStatus (){
        return status;
    }
    
    public void setStatus (Integer status){
        this.status = status;
    }
    public Long getTradeOrderId (){
        return tradeOrderId;
    }
    
    public void setTradeOrderId (Long tradeOrderId){
        this.tradeOrderId = tradeOrderId;
    }
    
    public String getBankOrderId() {
		return bankOrderId;
	}

	public void setBankOrderId(String bankOrderId) {
		this.bankOrderId = bankOrderId;
	}

	public String getPayeeAcctCode (){
        return payeeAcctCode;
    }
    
    public void setPayeeAcctCode (String payeeAcctCode){
        this.payeeAcctCode = payeeAcctCode;
    }
    public String getRefundPerson (){
        return refundPerson;
    }
    
    public void setRefundPerson (String refundPerson){
        this.refundPerson = refundPerson;
    }
    public Integer getType (){
        return type;
    }
    
    public void setType (Integer type){
        this.type = type;
    }
    public java.util.Date getUpdateDate (){
        return updateDate;
    }
    
    public void setUpdateDate (java.util.Date updateDate){
        this.updateDate = updateDate;
    }
    public String getBankCode (){
        return bankCode;
    }
    
    public void setBankCode (String bankCode){
        this.bankCode = bankCode;
    }
    public Long getFee (){
        return fee;
    }
    
    public void setFee (Long fee){
        this.fee = fee;
    }
    public Long getAmount (){
        return amount;
    }
    
    public void setAmount (Long amount){
        this.amount = amount;
    }
    public String getPayeeName (){
        return payeeName;
    }
    
    public void setPayeeName (String payeeName){
        this.payeeName = payeeName;
    }
    public Integer getBusiType (){
        return busiType;
    }
    
    public void setBusiType (Integer busiType){
        this.busiType = busiType;
    }
    public Integer getPayeeAcctType (){
        return payeeAcctType;
    }
    
    public void setPayeeAcctType (Integer payeeAcctType){
        this.payeeAcctType = payeeAcctType;
    }
    public Long getPayeeMemberCode (){
        return payeeMemberCode;
    }
    
    public void setPayeeMemberCode (Long payeeMemberCode){
        this.payeeMemberCode = payeeMemberCode;
    }
    public Long getSequenceId (){
        return sequenceId;
    }
    
    public void setSequenceId (Long sequenceId){
        this.sequenceId = sequenceId;
    }
    public java.util.Date getCreateDate (){
        return createDate;
    }
    
    public void setCreateDate (java.util.Date createDate){
        this.createDate = createDate;
    }
    public String getPayerName (){
        return payerName;
    }
    
    public void setPayerName (String payerName){
        this.payerName = payerName;
    }

	public String getWfInstanceId() {
		return wfInstanceId;
	}

	public void setWfInstanceId(String wfInstanceId) {
		this.wfInstanceId = wfInstanceId;
	}

	public Long getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Long orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getUniqueKey() {
		return uniqueKey;
	}

	public void setUniqueKey(String uniqueKey) {
		this.uniqueKey = uniqueKey;
	}

	public String getOldUniqueKey() {
		return oldUniqueKey;
	}

	public void setOldUniqueKey(String oldUniqueKey) {
		this.oldUniqueKey = oldUniqueKey;
	}


}