/**
*
* auto generated by ibatis tools 
*
**/
package com.pay.fundout.channel.model.bank;
/**
* FUNDOUT_BANK
*/

public class FundoutBank  implements java.io.Serializable {

    private Long status;
    private String bankName;
    private String mark;
    private java.util.Date createDate;
    private java.util.Date updateDate;
    private String operator;
    private String bankId;

    public Long getStatus (){
        return status;
    }
    
    public void setStatus (Long status){
        this.status = status;
    }
    public String getBankName (){
        return bankName;
    }
    
    public void setBankName (String bankName){
        this.bankName = bankName;
    }
    public String getMark (){
        return mark;
    }
    
    public void setMark (String mark){
        this.mark = mark;
    }
    public java.util.Date getCreateDate (){
        return createDate;
    }
    
    public void setCreateDate (java.util.Date createDate){
        this.createDate = createDate;
    }
    public java.util.Date getUpdateDate (){
        return updateDate;
    }
    
    public void setUpdateDate (java.util.Date updateDate){
        this.updateDate = updateDate;
    }
    public String getOperator (){
        return operator;
    }
    
    public void setOperator (String operator){
        this.operator = operator;
    }

	public String getBankId() {
		return bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

}