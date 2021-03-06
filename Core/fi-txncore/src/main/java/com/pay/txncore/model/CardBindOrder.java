package com.pay.txncore.model;

import java.util.Date;

/**
 * 银行卡绑定订单
 * 
 * @author peiyu
 *
 */
public class CardBindOrder {
	private Long id;
	private String orderId;
	private String type;// 0:银行卡绑定，1：银行卡解绑
	private String partnerId;
	private Date  orderCommitTime;
	private String status;// 0:操作中，1：已完成
	private Date createDate;
	private Date updateDate;
	private Date completedTime;
	private Long tokenPayId;
	private String registerUserId;
	private String beginTime;
	private String endTime;
	private String token;
	private String cardno;
	public String getCardno() {
		return cardno;
	}
	public void setCardno(String cardno) {
		this.cardno = cardno;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	public Date getOrderCommitTime() {
		return orderCommitTime;
	}

	public void setOrderCommitTime(Date orderCommitTime) {
		this.orderCommitTime = orderCommitTime;
	}

	public Date getCompletedTime() {
		return completedTime;
	}

	public void setCompletedTime(Date completedTime) {
		this.completedTime = completedTime;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Long getTokenPayId() {
		return tokenPayId;
	}

	public void setTokenPayId(Long tokenPayId) {
		this.tokenPayId = tokenPayId;
	}

	public String getRegisterUserId() {
		return registerUserId;
	}

	public void setRegisterUserId(String registerUserId) {
		this.registerUserId = registerUserId;
	}

	@Override
	public String toString() {
		return "CardBindOrder [id=" + id + ", orderId=" + orderId + ", type="
				+ type + ", partnerId=" + partnerId + ", status=" + status
				+ ", createDate=" + createDate + ", updateDate=" + updateDate
				+ ", tokenPayId=" + tokenPayId + ", registerUserId="
				+ registerUserId + ", beginTime=" + beginTime + ", endTime="
				+ endTime + "]";
	}
}
