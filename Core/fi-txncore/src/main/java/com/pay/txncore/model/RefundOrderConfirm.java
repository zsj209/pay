/**
 *
 * auto generated by ibatis tools 
 * @nico.shao 2016-07-27
 * 和ordercenter中的代码，略有不同，少了org_code \ channelorderno
 **/
package com.pay.txncore.model;

import java.util.Date;

/**
 * REFUND_ORDER_CONFIRM
 */

public class RefundOrderConfirm implements java.io.Serializable {
	private Long refundConfirmId;
	private Long refundOrderNo;
	private Date preStartTime;
	private Date createDate;
	private Date completeTime;
	private String status;
	private Integer conNum;
	
	public Long getRefundConfirmId() {
		return refundConfirmId;
	}
	public void setRefundConfirmId(Long refundConfirmId) {
		this.refundConfirmId = refundConfirmId;
	}
	public Long getRefundOrderNo() {
		return refundOrderNo;
	}
	public void setRefundOrderNo(Long refundOrderNo) {
		this.refundOrderNo = refundOrderNo;
	}
	public Date getPreStartTime() {
		return preStartTime;
	}
	public void setPreStartTime(Date preStartTime) {
		this.preStartTime = preStartTime;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getCompleteTime() {
		return completeTime;
	}
	public void setCompleteTime(Date completeTime) {
		this.completeTime = completeTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getConNum() {
		return conNum;
	}
	public void setConNum(Integer conNum) {
		this.conNum = conNum;
	}
	

}