/**
 * 
 */
package com.pay.gateway.dto;

import java.beans.PropertyDescriptor;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import com.pay.util.StringUtil;
import com.pay.util.XMLUtil;

/**
 * 交易取消响应
 * @author chaoyue
 *
 */
public class TradeRevokeApiResponse {

	private String orderId;
	private String resultCode;
	private String resultMsg;
	private String orderAmount;
	private String payAmount;
	private String rates;
	private String currencyCode;
	private String acquiringTime;
	private String completeTime;
	private String dealId;
	private String partnerId;
	private String remark;
	private String charset;
	private String signType;
	private String signMsg;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMsg() {
		return resultMsg;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

	public String getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getRates() {
		return rates;
	}

	public void setRates(String rates) {
		this.rates = rates;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getAcquiringTime() {
		return acquiringTime;
	}

	public void setAcquiringTime(String acquiringTime) {
		this.acquiringTime = acquiringTime;
	}

	public String getCompleteTime() {
		return completeTime;
	}

	public void setCompleteTime(String completeTime) {
		this.completeTime = completeTime;
	}

	public String getDealId() {
		return dealId;
	}

	public void setDealId(String dealId) {
		this.dealId = dealId;
	}

	public String getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCharset() {
		return charset;
	}

	public void setCharset(String charset) {
		this.charset = charset;
	}

	public String getSignType() {
		return signType;
	}

	public void setSignType(String signType) {
		this.signType = signType;
	}

	public String getSignMsg() {
		return signMsg;
	}

	public void setSignMsg(String signMsg) {
		this.signMsg = signMsg;
	}

	public String generateSign() {
		StringBuilder sb = new StringBuilder();
		try {
			BeanWrapper bean = new BeanWrapperImpl(this);
			int i = 0;
			PropertyDescriptor[] properties = bean.getPropertyDescriptors();
			for (PropertyDescriptor propertyDescriptor : properties) {
				i++;
				String key = propertyDescriptor.getDisplayName();
				Object value = bean.getPropertyValue(key);
				if (!"class".equals(key) && !"signMsg".equals(key)) {	
					if (!StringUtil.isEmpty(value+"")) {
						if(sb.length()<1){
							sb.append(key);
							sb.append("=");
							sb.append(value);
						}else{
							sb.append("&");
							sb.append(key);
							sb.append("=");
							sb.append(value);
						}
					}
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		try {
			BeanWrapper bean = new BeanWrapperImpl(this);
			int i = 0;
			PropertyDescriptor[] properties = bean.getPropertyDescriptors();
			for (PropertyDescriptor propertyDescriptor : properties) {
				i++;
				String key = propertyDescriptor.getDisplayName();
				Object value = bean.getPropertyValue(key);
				if (!"class".equals(key)) {
					
					sb.append(key);
					sb.append("=");
					
					if (!StringUtil.isEmpty(value+"")) {
						sb.append(value);
					}

					if (i < properties.length) {
						sb.append("&");
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	public static void main(String[] args) throws Exception {
		TradeRevokeApiResponse response = new TradeRevokeApiResponse();
		System.out.println(XMLUtil.bean2xml(response));
		System.out.println(response.generateSign());
	}

}
