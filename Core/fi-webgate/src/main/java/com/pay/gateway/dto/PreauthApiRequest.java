/**
 * 
 */
package com.pay.gateway.dto;

import java.beans.PropertyDescriptor;
import java.util.List;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import com.pay.util.StringUtil;

/**
 * 预授权请求
 * @author peiyu.yang
 *
 */
public class PreauthApiRequest {

	// 请求版本
	private String version;
	// 请求序列号
	private String orderId;
	// 商户显示名称
	private String displayName;
	// 商品名称
	private String goodsName;
	// 商品描述
	private String goodsDesc;
	// 订单提交时间
	private String submitTime;
	// 订单失效时间
	private String failureTime;
	// 下单域名及IP
	private String customerIP;
	// 商户网站
	private String siteId;
	// 订单金额
	private String orderAmount;
	// 交易类型
	private String tradeType;
	// 付款账号
	private String payerAccount;
	// 支付方式
	private String payType;
	// 资金机构代码
	private String orgCode;
	// 交易币种
	private String currencyCode;
	// 结算币种
	private String settlementCurrencyCode;
	// 借贷标识
	private String borrowingMarked;
	// 优惠券标识
	private String couponFlag;
	// 优惠号码
	private String couponNumber;
	// 平台商Id
	private String platformId;
	// 后台回调地址
	private String noticeUrl;
	// 商户ＩＤ
	private String partnerId;
	

	/**
	 * 账单信息
	 */
	private String billFirstName;
	private String billLastName;
	private String billAddress;
	private String billEmail;
	private String billPhoneNumber;
	private String billPostalCode;
	private String billStreet;
	private String billCity;
	private String billState;
	private String billCountryCode;

	/**
	 * 支付信息
	 */
	private String payMode;
	private String cardHolderNumber;
	private String cardHolderFirstName;
	private String cardHolderLastName;
	private String cardExpirationMonth;
	private String cardExpirationYear;
	private String securityCode;
	private String cardHolderEmail;
	private String cardHolderPhoneNumber;

	/**
	 * 安全信息
	 */
	private String deviceFingerprintId;
	private String registerUserId;
	private String registerUserEmail;
	private String orderTerminal;
	
	

	// 备注
	private String remark;

	private String charset;

	private String signType;

	private String signMsg;
	
	/**
	 * 航旅人数
	 */
	private String travDetailsSize;
	
	private List<TravlDetail> travDetails;

	private PreauthApiResponse preauthApiResponse;

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getSubmitTime() {
		return submitTime;
	}

	public void setSubmitTime(String submitTime) {
		this.submitTime = submitTime;
	}

	public String getCustomerIP() {
		return customerIP;
	}

	public void setCustomerIP(String customerIP) {
		this.customerIP = customerIP;
	}

	public String getSiteId() {
		return siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	public String getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getPlatformId() {
		return platformId;
	}

	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

	public String getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getBillAddress() {
		return billAddress;
	}

	public void setBillAddress(String billAddress) {
		this.billAddress = billAddress;
	}

	public String getBillEmail() {
		return billEmail;
	}

	public void setBillEmail(String billEmail) {
		this.billEmail = billEmail;
	}

	public String getBillPhoneNumber() {
		return billPhoneNumber;
	}

	public void setBillPhoneNumber(String billPhoneNumber) {
		this.billPhoneNumber = billPhoneNumber;
	}

	public String getBillPostalCode() {
		return billPostalCode;
	}

	public void setBillPostalCode(String billPostalCode) {
		this.billPostalCode = billPostalCode;
	}

	public String getBillStreet() {
		return billStreet;
	}

	public void setBillStreet(String billStreet) {
		this.billStreet = billStreet;
	}

	public String getBillCity() {
		return billCity;
	}

	public void setBillCity(String billCity) {
		this.billCity = billCity;
	}

	public String getBillState() {
		return billState;
	}

	public void setBillState(String billState) {
		this.billState = billState;
	}

	public String getBillCountryCode() {
		return billCountryCode;
	}

	public void setBillCountryCode(String billCountryCode) {
		this.billCountryCode = billCountryCode;
	}

	public String getCardHolderNumber() {
		return cardHolderNumber;
	}

	public void setCardHolderNumber(String cardHolderNumber) {
		this.cardHolderNumber = cardHolderNumber;
	}

	public String getCardHolderFirstName() {
		return cardHolderFirstName;
	}

	public void setCardHolderFirstName(String cardHolderFirstName) {
		this.cardHolderFirstName = cardHolderFirstName;
	}

	public String getCardHolderLastName() {
		return cardHolderLastName;
	}

	public void setCardHolderLastName(String cardHolderLastName) {
		this.cardHolderLastName = cardHolderLastName;
	}

	public String getCardExpirationMonth() {
		return cardExpirationMonth;
	}

	public void setCardExpirationMonth(String cardExpirationMonth) {
		this.cardExpirationMonth = cardExpirationMonth;
	}

	public String getCardExpirationYear() {
		return cardExpirationYear;
	}

	public void setCardExpirationYear(String cardExpirationYear) {
		this.cardExpirationYear = cardExpirationYear;
	}

	public String getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	public String getCardHolderEmail() {
		return cardHolderEmail;
	}

	public void setCardHolderEmail(String cardHolderEmail) {
		this.cardHolderEmail = cardHolderEmail;
	}

	public String getCardHolderPhoneNumber() {
		return cardHolderPhoneNumber;
	}

	public void setCardHolderPhoneNumber(String cardHolderPhoneNumber) {
		this.cardHolderPhoneNumber = cardHolderPhoneNumber;
	}

	public String getDeviceFingerprintId() {
		return deviceFingerprintId;
	}

	public void setDeviceFingerprintId(String deviceFingerprintId) {
		this.deviceFingerprintId = deviceFingerprintId;
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
	
	public String getBillFirstName() {
		return billFirstName;
	}

	public void setBillFirstName(String billFirstName) {
		this.billFirstName = billFirstName;
	}

	public String getBillLastName() {
		return billLastName;
	}

	public void setBillLastName(String billLastName) {
		this.billLastName = billLastName;
	}
	
	public String getTravDetailsSize() {
		return travDetailsSize;
	}

	public void setTravDetailsSize(String travDetailsSize) {
		this.travDetailsSize = travDetailsSize;
	}
	
	public PreauthApiResponse getPreauthApiResponse() {
		return preauthApiResponse;
	}

	public void setPreauthApiResponse(PreauthApiResponse preauthApiResponse) {
		this.preauthApiResponse = preauthApiResponse;
	}
	
	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getSettlementCurrencyCode() {
		return settlementCurrencyCode;
	}

	public void setSettlementCurrencyCode(String settlementCurrencyCode) {
		this.settlementCurrencyCode = settlementCurrencyCode;
	}

	public String getOrderTerminal() {
		return orderTerminal;
	}

	public void setOrderTerminal(String orderTerminal) {
		this.orderTerminal = orderTerminal;
	}
	
	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsDesc() {
		return goodsDesc;
	}

	public void setGoodsDesc(String goodsDesc) {
		this.goodsDesc = goodsDesc;
	}
	
	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getBorrowingMarked() {
		return borrowingMarked;
	}

	public void setBorrowingMarked(String borrowingMarked) {
		this.borrowingMarked = borrowingMarked;
	}
	
	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getFailureTime() {
		return failureTime;
	}

	public void setFailureTime(String failureTime) {
		this.failureTime = failureTime;
	}

	public String getPayerAccount() {
		return payerAccount;
	}

	public void setPayerAccount(String payerAccount) {
		this.payerAccount = payerAccount;
	}

	public String getCouponFlag() {
		return couponFlag;
	}

	public void setCouponFlag(String couponFlag) {
		this.couponFlag = couponFlag;
	}

	public String getCouponNumber() {
		return couponNumber;
	}

	public void setCouponNumber(String couponNumber) {
		this.couponNumber = couponNumber;
	}

	public String getNoticeUrl() {
		return noticeUrl;
	}

	public void setNoticeUrl(String noticeUrl) {
		this.noticeUrl = noticeUrl;
	}

	public String getPayMode() {
		return payMode;
	}

	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}

	public String getRegisterUserId() {
		return registerUserId;
	}

	public void setRegisterUserId(String registerUserId) {
		this.registerUserId = registerUserId;
	}

	public String getRegisterUserEmail() {
		return registerUserEmail;
	}

	public void setRegisterUserEmail(String registerUserEmail) {
		this.registerUserEmail = registerUserEmail;
	}
	
	public List<TravlDetail> getTravDetails() {
		return travDetails;
	}

	public void setTravDetails(List<TravlDetail> travDetails) {
		this.travDetails = travDetails;
	}

	public String generateSign() {
		StringBuilder sb = new StringBuilder();
		try {
			BeanWrapper bean = new BeanWrapperImpl(this);
			PropertyDescriptor[] properties = bean.getPropertyDescriptors();
			for (PropertyDescriptor propertyDescriptor : properties) {
				String key = propertyDescriptor.getDisplayName();
				Object value = bean.getPropertyValue(key);
				if (!"class".equals(key) 
						&& !"signMsg".equals(key)
						&&!"preauthApiResponse".equals(key)) {
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
		PreauthApiRequest request = new PreauthApiRequest();
		System.out.println(request.generateSign());
	}
}
