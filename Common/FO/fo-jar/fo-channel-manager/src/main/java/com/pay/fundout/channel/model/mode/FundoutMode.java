/**
*
* auto generated by ibatis tools 
*
**/
package com.pay.fundout.channel.model.mode;
/**
* FUNDOUT_MODE
*/

public class FundoutMode  implements java.io.Serializable {

    private String name;
    private String mark;
    private Long modeId;
    private java.util.Date createDate;
    private String operator;
    private java.util.Date updateDate;
    private Long status;
    private String code;
    
    public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public String getName (){
        return name;
    }
    
    public void setName (String name){
        this.name = name;
    }
    public String getMark (){
        return mark;
    }
    
    public void setMark (String mark){
        this.mark = mark;
    }
    public Long getModeId (){
        return modeId;
    }
    
    public void setModeId (Long modeId){
        this.modeId = modeId;
    }
    public java.util.Date getCreateDate (){
        return createDate;
    }
    
    public void setCreateDate (java.util.Date createDate){
        this.createDate = createDate;
    }
    public String getOperator (){
        return operator;
    }
    
    public void setOperator (String operator){
        this.operator = operator;
    }
    public java.util.Date getUpdateDate (){
        return updateDate;
    }
    
    public void setUpdateDate (java.util.Date updateDate){
        this.updateDate = updateDate;
    }

}