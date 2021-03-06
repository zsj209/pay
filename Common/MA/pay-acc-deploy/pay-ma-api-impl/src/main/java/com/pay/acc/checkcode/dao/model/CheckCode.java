/*
 * Copyright (c) 2004-2013 pay.com . All rights reserved. 
 */
package com.pay.acc.checkcode.dao.model;

import java.util.Date;

/**
 * 会员激活信息<br>
 * 对应ACC库
 * 
 * @author wangzhi
 * @version
 * @data 2010-9-19 下午02:02:21
 * 
 */
public class CheckCode {
	
	private Long id;
	private String checkCode;
	private Integer  status;
	private Date createTime;
	private Long memberCode;
	private String origin;
	private String email;
	private String phone;
	private Date updateTime;
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public Long getMemberCode() {
		return memberCode;
	}
	public void setMemberCode(Long memberCode) {
		this.memberCode = memberCode;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCheckCode() {
		return checkCode;
	}
	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}
	
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
