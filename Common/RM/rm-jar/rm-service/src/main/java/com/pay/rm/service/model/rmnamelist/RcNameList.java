/**
*
* auto generated by ibatis tools 
*
**/
package com.pay.rm.service.model.rmnamelist;
/**
* rc_name_list
*/

public class RcNameList  implements java.io.Serializable {

    private Long sequenceId;
    private Integer status;
    private Integer memberType;
    private String memberId;
    private Integer businessId;
    private java.util.Date createDate;
    private java.util.Date updateDate;
    private Integer nameType;



	public Long getSequenceId() {
		return sequenceId;
	}

	public void setSequenceId(Long sequenceId) {
		this.sequenceId = sequenceId;
	}

	public Integer getStatus (){
        return status;
    }
    
    public void setStatus (Integer status){
        this.status = status;
    }
    public Integer getMemberType (){
        return memberType;
    }
    
    public void setMemberType (Integer memberType){
        this.memberType = memberType;
    }
    public String getMemberId (){
        return memberId;
    }
    
    public void setMemberId (String memberId){
        this.memberId = memberId;
    }
    public Integer getBusinessId (){
        return businessId;
    }
    
    public void setBusinessId (Integer businessId){
        this.businessId = businessId;
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
    public Integer getNameType (){
        return nameType;
    }
    
    public void setNameType (Integer nameType){
        this.nameType = nameType;
    }

}