package com.pay.txncore.crosspay.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 交易拒付记录
 */
public class RefusePaymentOrder implements Serializable {
    private Long id;

    /**
     * 网关订单基础信息流水号 [外键]
     */
    private Long tradeBaseNo;

    /**
     * 网关订单流水号 [主键]
     */
    private Long tradeOrderNo;

    /**
     * 请求序列号
     */
    private String requestSerialId;

    /**
     * 商户ID
     */
    private String partnerId;

    /**
     * 商户订单号
     */
    private String orderId;

    /**
     * 交易币种
     */
    private String currency;

    /**
     * 订单金额
     */
    private Long orderAmount;

    /**
     * 商户显示名 [可选] 以此处优先于注册名称
     */
    private String partnerDisplayName;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品数量
     */
    private Long goodsCount;

    /**
     * 交易状态 [0:未付款;1:交易关闭;2:已付款;3:交易完成（含退款）;4:交易成功;5:交易失败(担保交易)]
     */
    private Integer status;

    /**
     * 可退金额[可选](支付成功用，可用于退款的金额)
     */
    private Long refundAmount;

    /**
     * 支付类型 [0001.担保交易 0002.即时付款]
     */
    private String tradeType;

    /**
     * 付款方式：0001-余额，0002-网银，0003-预付费卡; 支持多个值，用逗号隔开
     */
    private String payType;

    /**
     * 付款方新生账户号 [MEMBER_CODE]
     */
    private String payerMark;

    /**
     * 目标资金机构代码
     */
    private String orgCode;

    /**
     * 是否直连 [0-非直连，1-直连，默认非直连]
     */
    private String directFlg;

    /**
     * 资金来源借贷标识 [0-无要求，1-只借，2-只贷 默认0]
     */
    private String debitFlg;

    /**
     * 交易平台ID
     */
    private String platformId;

    private String operator;

    private Long arbFee;

    private String arbFile;

    private String arbFile1;

    private String arbFile2;

    private String arbFile3;

    private String arbFile4;

    /**
     * 0：已申请<br>
	 * 1：拒付成功<br>
	 * 2：拒付失败
     */
    private String refuseStatus;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 修改时间
     */
    private Date updateDate;
    
    private Date orderTime;
	private String url;
	private String clearStatus;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * <b>获取</b> 网关订单基础信息流水号 [外键]
     */
    public Long getTradeBaseNo() {
        return tradeBaseNo;
    }

    /**
     * <b>设置</b> 网关订单基础信息流水号 [外键]
     */
    public void setTradeBaseNo(Long tradeBaseNo) {
        this.tradeBaseNo = tradeBaseNo;
    }

    /**
     * <b>获取</b> 网关订单流水号 [主键]
     */
    public Long getTradeOrderNo() {
        return tradeOrderNo;
    }

    /**
     * <b>设置</b> 网关订单流水号 [主键]
     */
    public void setTradeOrderNo(Long tradeOrderNo) {
        this.tradeOrderNo = tradeOrderNo;
    }

    /**
     * <b>获取</b> 请求序列号
     */
    public String getRequestSerialId() {
        return requestSerialId;
    }

    /**
     * <b>设置</b> 请求序列号
     */
    public void setRequestSerialId(String requestSerialId) {
        this.requestSerialId = requestSerialId;
    }

    /**
     * <b>获取</b> 商户ID
     */
    public String getPartnerId() {
        return partnerId;
    }

    /**
     * <b>设置</b> 商户ID
     */
    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    /**
     * <b>获取</b> 商户订单号
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * <b>设置</b> 商户订单号
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * <b>获取</b> 交易币种
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * <b>设置</b> 交易币种
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * <b>获取</b> 订单金额
     */
    public Long getOrderAmount() {
        return orderAmount;
    }

    /**
     * <b>设置</b> 订单金额
     */
    public void setOrderAmount(Long orderAmount) {
        this.orderAmount = orderAmount;
    }

    /**
     * <b>获取</b> 商户显示名 [可选] 以此处优先于注册名称
     */
    public String getPartnerDisplayName() {
        return partnerDisplayName;
    }

    /**
     * <b>设置</b> 商户显示名 [可选] 以此处优先于注册名称
     */
    public void setPartnerDisplayName(String partnerDisplayName) {
        this.partnerDisplayName = partnerDisplayName;
    }

    /**
     * <b>获取</b> 商品名称
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * <b>设置</b> 商品名称
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    /**
     * <b>获取</b> 商品数量
     */
    public Long getGoodsCount() {
        return goodsCount;
    }

    /**
     * <b>设置</b> 商品数量
     */
    public void setGoodsCount(Long goodsCount) {
        this.goodsCount = goodsCount;
    }

    /**
     * <b>获取</b> 交易状态 [0:未付款;1:交易关闭;2:已付款;3:交易完成（含退款）;4:交易成功;5:交易失败(担保交易)]
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * <b>设置</b> 交易状态 [0:未付款;1:交易关闭;2:已付款;3:交易完成（含退款）;4:交易成功;5:交易失败(担保交易)]
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <b>获取</b> 可退金额[可选](支付成功用，可用于退款的金额)
     */
    public Long getRefundAmount() {
        return refundAmount;
    }

    /**
     * <b>设置</b> 可退金额[可选](支付成功用，可用于退款的金额)
     */
    public void setRefundAmount(Long refundAmount) {
        this.refundAmount = refundAmount;
    }

    /**
     * <b>获取</b> 支付类型 [0001.担保交易 0002.即时付款]
     */
    public String getTradeType() {
        return tradeType;
    }

    /**
     * <b>设置</b> 支付类型 [0001.担保交易 0002.即时付款]
     */
    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    /**
     * <b>获取</b> 付款方式：0001-余额，0002-网银，0003-预付费卡; 支持多个值，用逗号隔开
     */
    public String getPayType() {
        return payType;
    }

    /**
     * <b>设置</b> 付款方式：0001-余额，0002-网银，0003-预付费卡; 支持多个值，用逗号隔开
     */
    public void setPayType(String payType) {
        this.payType = payType;
    }

    /**
     * <b>获取</b> 付款方新生账户号 [MEMBER_CODE]
     */
    public String getPayerMark() {
        return payerMark;
    }

    /**
     * <b>设置</b> 付款方新生账户号 [MEMBER_CODE]
     */
    public void setPayerMark(String payerMark) {
        this.payerMark = payerMark;
    }

    /**
     * <b>获取</b> 目标资金机构代码
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * <b>设置</b> 目标资金机构代码
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    /**
     * <b>获取</b> 是否直连 [0-非直连，1-直连，默认非直连]
     */
    public String getDirectFlg() {
        return directFlg;
    }

    /**
     * <b>设置</b> 是否直连 [0-非直连，1-直连，默认非直连]
     */
    public void setDirectFlg(String directFlg) {
        this.directFlg = directFlg;
    }

    /**
     * <b>获取</b> 资金来源借贷标识 [0-无要求，1-只借，2-只贷 默认0]
     */
    public String getDebitFlg() {
        return debitFlg;
    }

    /**
     * <b>设置</b> 资金来源借贷标识 [0-无要求，1-只借，2-只贷 默认0]
     */
    public void setDebitFlg(String debitFlg) {
        this.debitFlg = debitFlg;
    }

    /**
     * <b>获取</b> 交易平台ID
     */
    public String getPlatformId() {
        return platformId;
    }

    /**
     * <b>设置</b> 交易平台ID
     */
    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Long getArbFee() {
        return arbFee;
    }

    public void setArbFee(Long arbFee) {
        this.arbFee = arbFee;
    }

    public String getArbFile() {
        return arbFile;
    }

    public void setArbFile(String arbFile) {
        this.arbFile = arbFile;
    }

    public String getArbFile1() {
        return arbFile1;
    }

    public void setArbFile1(String arbFile1) {
        this.arbFile1 = arbFile1;
    }

    public String getArbFile2() {
        return arbFile2;
    }

    public void setArbFile2(String arbFile2) {
        this.arbFile2 = arbFile2;
    }

    public String getArbFile3() {
        return arbFile3;
    }

    public void setArbFile3(String arbFile3) {
        this.arbFile3 = arbFile3;
    }

    public String getArbFile4() {
        return arbFile4;
    }

    public void setArbFile4(String arbFile4) {
        this.arbFile4 = arbFile4;
    }

    /**
     * <b>获取</b> 0：已申请<br>
	 * 1：拒付成功<br>
	 * 2：拒付失败
     */
    public String getRefuseStatus() {
        return refuseStatus;
    }

    /**
     * <b>设置</b> 0：已申请<br>
	 * 1：拒付成功<br>
	 * 2：拒付失败
     */
    public void setRefuseStatus(String refuseStatus) {
        this.refuseStatus = refuseStatus;
    }

    /**
     * <b>获取</b> 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * <b>设置</b> 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * <b>获取</b> 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * <b>设置</b> 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <b>获取</b> 修改时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * <b>设置</b> 修改时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getClearStatus() {
		return clearStatus;
	}

	public void setClearStatus(String clearStatus) {
		this.clearStatus = clearStatus;
	}
}