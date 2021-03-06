/**
 * 
 */
package com.pay.txncore.dto;

import java.util.Map;

import com.pay.txncore.newpaymentprocess.processvo.BackfromChannelVo;
import com.pay.txncore.newpaymentprocess.processvo.WftBackVo;

/**
 * 跨境支付订单对象
 * 
 * @author chaoyue
 *
 */
public class PaymentInfo {

	private String requestId;

	// 网关订单
	private Long tradeOrderNo;

	private String paymentOrderNo;

	private String channelOrderNo;

	// 请求序列号
	private String orderId;
	// 商户显示名称
	private String displayName;
	// 商品名称
	private String goodsName;
	// 商品数量
	private String goodsDesc;
	// 订单提交时间
	private String submitTime;
	// 订单失效时间
	private String failureTime;
	// 下单域名及IP
	private String customerIP;
	// 订单金额
	private String orderAmount;
	// DCC下外币金额
	private String dccAmount;

	private String paymentAmount;

	// 交易类型：1-充值,2-支付
	private String tradeType;
	// 付款账号
	private String payerAccount;
	// 支付方式 EDC/DCC
	private String payType;
	// 交易币种
	private String currencyCode;

	private String dccCurrencyCode;
	// 是否直连
	private String directFlag;
	// 借贷标识
	private String borrowingMarked;
	// 优惠券标识
	private String couponFlag;
	// 平台商Id
	private String platformId;
	// 前台回调地址
	private String returnUrl;
	// 后台回调地址
	private String noticeUrl;
	// 商户ＩＤ
	private String partnerId;
	// 支付方式
	private String paymentType;

	// 结算币种
	private String settlementCurrencyCode;

	// 显示语言
	private String language;

	// 请求版本
	private String version;
	// 商户网站
	private String siteId;
	// 优惠号码
	private String couponNumber;

	private String couponValue;

	/**
	 * 账单信息
	 */
	private String billName;
	//账单firstName
	private String billFirstName;
	//账单lastName
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
	 * 收贷人信息
	 */
	private String shippingName;
	//收货人firstName
	private String shippingFirstName;
	//收货人lastName
	private String shippingLastName;
	private String shippingAddress;
	private String shippingMail;
	private String shippingPhoneNumber;
	private String shippingPostalCode;
	private String shippingCompany;
	private String shippingStreet;
	private String shippingCity;
	private String shippingState;
	private String shippingCountryCode;
	

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

	// 请求序号
	private String serialNo;

	private String preServerUrl;
	// 资金机构代码
	private String orgCode;
	// 机构商户号
	private String orgMerchantCode;

	private String orgKey;
	private String pattern;
	private String terminalCode;
	private String accessCode;
	private String transType;

	private String dccRate;

	// 备注
	private String remark;

	private String charset;

	private String signType;
	
	private String sendCredorax;
	
	//汇率浮动值
	private String floatValue;
	
	//支付产品编号
	private String prdtCode;
	
	private String cardOrg;
	
	private String payLinkNo;
	
	private String paymentWay;
		//送渠道币种
	private String channelCurrencyCode;
	//DCC markup值
	private String dccMarkup;
	/**
	 * 送渠道支付方式EDC，还是DCC
	 * 例如自建DCC实际送渠道是EDC，
	 * 但是卡司的DCC，我们要送DCC的
	 */
	private String channelPayType;
	private String markup;
	private String cardCountry;//卡所在国
	private String token;
	
	private Map<String,String> data;

	private BackfromChannelVo returnFromFront;

	private String origOrderId;
		//货运机构
	private String freightOrg;
    private String freightWebsite;
	//运单号
	private String waybillNo;
	//返货方式 0：邮寄，1：收货人自取
	private String deliverMode;
	//收款人名称
	private String payeeName;
	//收款人国家地区英文码
	private String regionEnCode;
	//收款行swift
	private String payeeSwift;
	//收款人行行号
	private String payeeBanknum;
	//收款人银行账号
	private String payeeAccount;
	//收款人地址
	private String payeeAddress;
	//收款币种
	private String payCurrency;
	//交易的凭证， ftp 地址或者可访问的网络路径。
	private String attachment;
	private String authorisation;
	
	//威富通【微信扫码、微信WAP,支付宝扫码、支付宝WAP】生成二维码、WAP支付链接继续支付的参数
	private WftBackVo wftBackVo ;
	
	/**
	 * @return the wftBackVo
	 */
	public WftBackVo getWftBackVo() {
		return wftBackVo;
	}

	/**
	 * @param wftBackVo the wftBackVo to set
	 */
	public void setWftBackVo(WftBackVo wftBackVo) {
		this.wftBackVo = wftBackVo;
	}

	public String getAuthorisation() {
		return authorisation;
	}

	public void setAuthorisation(String authorisation) {
		this.authorisation = authorisation;
	}
	public String getOrigOrderId() {
		return origOrderId;
	}

	public void setOrigOrderId(String origOrderId) {
		this.origOrderId = origOrderId;
	}
		public String getFreightOrg() {
		return freightOrg;
	}

	public void setFreightOrg(String freightOrg) {
		this.freightOrg = freightOrg;
	}

	public String getFreightWebsite() {
		return freightWebsite;
	}

	public void setFreightWebsite(String freightWebsite) {
		this.freightWebsite = freightWebsite;
	}

	public String getWaybillNo() {
		return waybillNo;
	}

	public void setWaybillNo(String waybillNo) {
		this.waybillNo = waybillNo;
	}

	public String getDeliverMode() {
		return deliverMode;
	}

	public void setDeliverMode(String deliverMode) {
		this.deliverMode = deliverMode;
	}

	public String getPayeeName() {
		return payeeName;
	}

	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public String getRegionEnCode() {
		return regionEnCode;
	}

	public void setRegionEnCode(String regionEnCode) {
		this.regionEnCode = regionEnCode;
	}

	public String getPayeeSwift() {
		return payeeSwift;
	}

	public void setPayeeSwift(String payeeSwift) {
		this.payeeSwift = payeeSwift;
	}

	public String getPayeeBanknum() {
		return payeeBanknum;
	}

	public void setPayeeBanknum(String payeeBanknum) {
		this.payeeBanknum = payeeBanknum;
	}

	public String getPayeeAccount() {
		return payeeAccount;
	}

	public void setPayeeAccount(String payeeAccount) {
		this.payeeAccount = payeeAccount;
	}

	public String getPayeeAddress() {
		return payeeAddress;
	}

	public void setPayeeAddress(String payeeAddress) {
		this.payeeAddress = payeeAddress;
	}

	public String getPayCurrency() {
		return payCurrency;
	}

	public void setPayCurrency(String payCurrency) {
		this.payCurrency = payCurrency;
	}

	public String getAttachment() {
		return attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Map<String, String> getData() {
		return data;
	}

	public void setData(Map<String, String> data) {
		this.data = data;
	}

	public BackfromChannelVo getReturnFromFront() {
		return returnFromFront;
	}

	public void setReturnFromFront(BackfromChannelVo returnFromFront) {
		this.returnFromFront = returnFromFront;
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

	public String getShippingFirstName() {
		return shippingFirstName;
	}

	public void setShippingFirstName(String shippingFirstName) {
		this.shippingFirstName = shippingFirstName;
	}

	public String getShippingLastName() {
		return shippingLastName;
	}

	public void setShippingLastName(String shippingLastName) {
		this.shippingLastName = shippingLastName;
	}

	public String getCardCountry() {
		return cardCountry;
	}

	public void setCardCountry(String cardCountry) {
		this.cardCountry = cardCountry;
	}

	private String merchantBillName;
	
	public String getMarkup() {
		return markup;
	}

	public void setMarkup(String markup) {
		this.markup = markup;
	}

	private String mcc;
		public String getChannelPayType() {
		return channelPayType;
	}

	public void setChannelPayType(String channelPayType) {
		this.channelPayType = channelPayType;
	}

	public String getDccMarkup() {
		return dccMarkup;
	}

	public void setDccMarkup(String dccMarkup) {
		this.dccMarkup = dccMarkup;
	}

	public String getChannelCurrencyCode() {
		return channelCurrencyCode;
	}

	public void setChannelCurrencyCode(String channelCurrencyCode) {
		this.channelCurrencyCode = channelCurrencyCode;
	}
	
	
	
	public String getPayLinkNo() {
		return payLinkNo;
	}

	public void setPayLinkNo(String payLinkNo) {
		this.payLinkNo = payLinkNo;
	}

	public String getPaymentWay() {
		return paymentWay;
	}

	public void setPaymentWay(String paymentWay) {
		this.paymentWay = paymentWay;
	}

	public String getCardOrg() {
		return cardOrg;
	}

	public void setCardOrg(String cardOrg) {
		this.cardOrg = cardOrg;
	}

	public String getPrdtCode() {
		return prdtCode;
	}

	public void setPrdtCode(String prdtCode) {
		this.prdtCode = prdtCode;
	}

	public String getFloatValue() {
		return floatValue;
	}

	public void setFloatValue(String floatValue) {
		this.floatValue = floatValue;
	}

	public String getSendCredorax() {
		return sendCredorax;
	}

	public void setSendCredorax(String sendCredorax) {
		this.sendCredorax = sendCredorax;
	}

	private PaymentResult paymentResult;

	public String getSettlementCurrencyCode() {
		return settlementCurrencyCode;
	}

	public void setSettlementCurrencyCode(String settlementCurrencyCode) {
		this.settlementCurrencyCode = settlementCurrencyCode;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getShippingMail() {
		return shippingMail;
	}

	public void setShippingMail(String shippingMail) {
		this.shippingMail = shippingMail;
	}

	public String getShippingStreet() {
		return shippingStreet;
	}

	public void setShippingStreet(String shippingStreet) {
		this.shippingStreet = shippingStreet;
	}

	public String getShippingCity() {
		return shippingCity;
	}

	public void setShippingCity(String shippingCity) {
		this.shippingCity = shippingCity;
	}

	public String getShippingState() {
		return shippingState;
	}

	public void setShippingState(String shippingState) {
		this.shippingState = shippingState;
	}

	public String getShippingCountryCode() {
		return shippingCountryCode;
	}

	public void setShippingCountryCode(String shippingCountryCode) {
		this.shippingCountryCode = shippingCountryCode;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
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

	public String getSubmitTime() {
		return submitTime;
	}

	public void setSubmitTime(String submitTime) {
		this.submitTime = submitTime;
	}

	public String getFailureTime() {
		return failureTime;
	}

	public void setFailureTime(String failureTime) {
		this.failureTime = failureTime;
	}

	public String getCustomerIP() {
		return customerIP;
	}

	public void setCustomerIP(String customerIP) {
		this.customerIP = customerIP;
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

	public String getPayerAccount() {
		return payerAccount;
	}

	public void setPayerAccount(String payerAccount) {
		this.payerAccount = payerAccount;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getDirectFlag() {
		return directFlag;
	}

	public void setDirectFlag(String directFlag) {
		this.directFlag = directFlag;
	}

	public String getBorrowingMarked() {
		return borrowingMarked;
	}

	public void setBorrowingMarked(String borrowingMarked) {
		this.borrowingMarked = borrowingMarked;
	}

	public String getCouponFlag() {
		return couponFlag;
	}

	public void setCouponFlag(String couponFlag) {
		this.couponFlag = couponFlag;
	}

	public String getPlatformId() {
		return platformId;
	}

	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

	public String getReturnUrl() {
		return returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getNoticeUrl() {
		return noticeUrl;
	}

	public void setNoticeUrl(String noticeUrl) {
		this.noticeUrl = noticeUrl;
	}

	public String getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTradeOrderNo() {
		return tradeOrderNo;
	}

	public void setTradeOrderNo(Long tradeOrderNo) {
		this.tradeOrderNo = tradeOrderNo;
	}

	public String getPaymentOrderNo() {
		return paymentOrderNo;
	}

	public void setPaymentOrderNo(String paymentOrderNo) {
		this.paymentOrderNo = paymentOrderNo;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getSiteId() {
		return siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	public String getCouponNumber() {
		return couponNumber;
	}

	public void setCouponNumber(String couponNumber) {
		this.couponNumber = couponNumber;
	}

	public String getBillName() {
		return billName;
	}

	public void setBillName(String billName) {
		this.billName = billName;
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

	public String getShippingName() {
		return shippingName;
	}

	public void setShippingName(String shippingName) {
		this.shippingName = shippingName;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String getShippingPhoneNumber() {
		return shippingPhoneNumber;
	}

	public void setShippingPhoneNumber(String shippingPhoneNumber) {
		this.shippingPhoneNumber = shippingPhoneNumber;
	}

	public String getShippingPostalCode() {
		return shippingPostalCode;
	}

	public void setShippingPostalCode(String shippingPostalCode) {
		this.shippingPostalCode = shippingPostalCode;
	}

	public String getShippingCompany() {
		return shippingCompany;
	}

	public void setShippingCompany(String shippingCompany) {
		this.shippingCompany = shippingCompany;
	}

	public String getPayMode() {
		return payMode;
	}

	public void setPayMode(String payMode) {
		this.payMode = payMode;
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

	public String getOrderTerminal() {
		return orderTerminal;
	}

	public void setOrderTerminal(String orderTerminal) {
		this.orderTerminal = orderTerminal;
	}

	public String getChannelOrderNo() {
		return channelOrderNo;
	}

	public void setChannelOrderNo(String channelOrderNo) {
		this.channelOrderNo = channelOrderNo;
	}

	public String getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getCouponValue() {
		return couponValue;
	}

	public void setCouponValue(String couponValue) {
		this.couponValue = couponValue;
	}

	public PaymentResult getPaymentResult() {
		return paymentResult;
	}

	public void setPaymentResult(PaymentResult paymentResult) {
		this.paymentResult = paymentResult;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getPreServerUrl() {
		return preServerUrl;
	}

	public void setPreServerUrl(String preServerUrl) {
		this.preServerUrl = preServerUrl;
	}

	public String getOrgMerchantCode() {
		return orgMerchantCode;
	}

	public void setOrgMerchantCode(String orgMerchantCode) {
		this.orgMerchantCode = orgMerchantCode;
	}

	public String getOrgKey() {
		return orgKey;
	}

	public void setOrgKey(String orgKey) {
		this.orgKey = orgKey;
	}

	public String getTerminalCode() {
		return terminalCode;
	}

	public void setTerminalCode(String terminalCode) {
		this.terminalCode = terminalCode;
	}

	public String getAccessCode() {
		return accessCode;
	}

	public void setAccessCode(String accessCode) {
		this.accessCode = accessCode;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public String getDccAmount() {
		return dccAmount;
	}

	public void setDccAmount(String dccAmount) {
		this.dccAmount = dccAmount;
	}

	public String getDccCurrencyCode() {
		return dccCurrencyCode;
	}

	public void setDccCurrencyCode(String dccCurrencyCode) {
		this.dccCurrencyCode = dccCurrencyCode;
	}

	public String getDccRate() {
		return dccRate;
	}

	public void setDccRate(String dccRate) {
		this.dccRate = dccRate;
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

	public String getMerchantBillName() {
		return merchantBillName;
	}

	public void setMerchantBillName(String merchantBillName) {
		this.merchantBillName = merchantBillName;
	}

	public String getMcc() {
		return mcc;
	}

	public void setMcc(String mcc) {
		this.mcc = mcc;
	}

}
