package com.pay.poss.membermanager.model;

import java.util.Date;

import com.pay.inf.model.BaseObject;



/**
 * 
 * @Description 
 * @project 	poss-membermanager
 * @file 		MemberProduct.java 
 * @note		<br>
 * @develop		JDK1.6 + Eclipse 3.5
 * @version     1.0
 * Copyright © 2004-2013 pay.com . All rights reserved. 版权所有
 * Date				Author			Changes
 * 2010-10-21		gungun_zhang			Create
 */


public class MemberProduct extends BaseObject{

	private static final long serialVersionUID = 1L;
	private Long id;
    private Long memberCode;
    private Integer productId;
    private Integer status;
    private Date creationDate;
    private Date updateDate;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getMemberCode() {
		return memberCode;
	}
	public void setMemberCode(Long memberCode) {
		this.memberCode = memberCode;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
    
    
}