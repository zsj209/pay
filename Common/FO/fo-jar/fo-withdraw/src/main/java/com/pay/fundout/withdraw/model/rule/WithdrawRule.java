/**
*
* auto generated by ibatis tools 
*
**/
package com.pay.fundout.withdraw.model.rule;
/**
* WITHDRAW_RULE
*/

public class WithdrawRule  implements java.io.Serializable {

    private java.util.Date creationDate;
    private Integer withdrawType;
    private Integer bankAcctType;
    private Integer status;
    private Integer priority;
    private String toBankCode;
    private Integer sequenceId;
    private String withdrawBankId;
    private Long sinMaxValue;
    private java.util.Date updateDate;
    private Long sinMinValue;

    /**
	 * @return the sinMinValue
	 */
	public Long getSinMinValue() {
		return sinMinValue;
	}

	/**
	 * @param sinMinValue the sinMinValue to set
	 */
	public void setSinMinValue(Long sinMinValue) {
		this.sinMinValue = sinMinValue;
	}

	public java.util.Date getCreationDate (){
        return creationDate;
    }
    
    public void setCreationDate (java.util.Date creationDate){
        this.creationDate = creationDate;
    }
    public Integer getWithdrawType (){
        return withdrawType;
    }
    
    public void setWithdrawType (Integer withdrawType){
        this.withdrawType = withdrawType;
    }
    public Integer getBankAcctType (){
        return bankAcctType;
    }
    
    public void setBankAcctType (Integer bankAcctType){
        this.bankAcctType = bankAcctType;
    }
    public Integer getStatus (){
        return status;
    }
    
    public void setStatus (Integer status){
        this.status = status;
    }
    public Integer getPriority (){
        return priority;
    }
    
    public void setPriority (Integer priority){
        this.priority = priority;
    }

    public Integer getSequenceId (){
        return sequenceId;
    }
    
    public void setSequenceId (Integer sequenceId){
        this.sequenceId = sequenceId;
    }

    public Long getSinMaxValue (){
        return sinMaxValue;
    }
    
    public void setSinMaxValue (Long sinMaxValue){
        this.sinMaxValue = sinMaxValue;
    }
    public java.util.Date getUpdateDate (){
        return updateDate;
    }
    
    public void setUpdateDate (java.util.Date updateDate){
        this.updateDate = updateDate;
    }

	/**
	 * @return the toBankCode
	 */
	public String getToBankCode() {
		return toBankCode;
	}

	/**
	 * @param toBankCode the toBankCode to set
	 */
	public void setToBankCode(String toBankCode) {
		this.toBankCode = toBankCode;
	}

	/**
	 * @return the withdrawBankId
	 */
	public String getWithdrawBankId() {
		return withdrawBankId;
	}

	/**
	 * @param withdrawBankId the withdrawBankId to set
	 */
	public void setWithdrawBankId(String withdrawBankId) {
		this.withdrawBankId = withdrawBankId;
	}

}