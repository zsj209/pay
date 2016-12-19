package com.pay.fo.order.model.batchpayment;

import java.util.Date;

public class BatchPaymentToBankReqDetail {
    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.DETAIL_SEQ
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    private Long detailSeq;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.REQUEST_SEQ
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    private Long requestSeq;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.FOREIGN_ORDERID
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    private String foreignOrderId;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_NAME
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    private String payeeName;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_BANKACCTCODE
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    private String payeeBankAcctCode;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.TRADE_TYPE
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    private String tradeType;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_BANKCODE
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    private String payeeBankCode;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_BANKNAME
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    private String payeeBankName;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_OPENINGBANKNAME
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    private String payeeOpeningBankName;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_BANKPROVINCE
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    private String payeeBankProvince;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_BANKPROVINCENAME
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    private String payeeBankProvinceName;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_BANKCITY
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    private String payeeBankCity;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_BANKCITYNAME
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    private String payeeBankCityName;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.REQUEST_AMOUNT
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    private String requestAmount;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.REMARK
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    private String remark;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.VALID_STATUS
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    private Integer validStatus;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.ERROR_MSG
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    private String errorMsg;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYMENT_AMOUNT
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    private Long paymentAmount;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.IS_PAYERPAYFEE
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    private Integer isPayerPayFee;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.FEE
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    private Long fee;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.REALPAY_AMOUNT
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    private Long realpayAmount;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.REALOUT_AMOUNT
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    private Long realoutAmount;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.ORDER_STATUS
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    private Integer orderStatus;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.CREATE_DATE
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    private Date createDate;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.UPDATE_DATE
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    private Date updateDate;
    
	/**
	 * 开户行联行号
	 */
	private String bankNumber;

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.DETAIL_SEQ
     *
     * @return the value of FO.BATCH_PAYMENTTOBANKREQDETAIL.DETAIL_SEQ
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public Long getDetailSeq() {
        return detailSeq;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.DETAIL_SEQ
     *
     * @param detailSeq the value for FO.BATCH_PAYMENTTOBANKREQDETAIL.DETAIL_SEQ
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public void setDetailSeq(Long detailSeq) {
        this.detailSeq = detailSeq;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.REQUEST_SEQ
     *
     * @return the value of FO.BATCH_PAYMENTTOBANKREQDETAIL.REQUEST_SEQ
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public Long getRequestSeq() {
        return requestSeq;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.REQUEST_SEQ
     *
     * @param requestSeq the value for FO.BATCH_PAYMENTTOBANKREQDETAIL.REQUEST_SEQ
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public void setRequestSeq(Long requestSeq) {
        this.requestSeq = requestSeq;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.FOREIGN_ORDERID
     *
     * @return the value of FO.BATCH_PAYMENTTOBANKREQDETAIL.FOREIGN_ORDERID
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public String getForeignOrderId() {
        return foreignOrderId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.FOREIGN_ORDERID
     *
     * @param foreignOrderId the value for FO.BATCH_PAYMENTTOBANKREQDETAIL.FOREIGN_ORDERID
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public void setForeignOrderId(String foreignOrderId) {
        this.foreignOrderId = foreignOrderId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_NAME
     *
     * @return the value of FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_NAME
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public String getPayeeName() {
        return payeeName;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_NAME
     *
     * @param payeeName the value for FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_NAME
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_BANKACCTCODE
     *
     * @return the value of FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_BANKACCTCODE
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public String getPayeeBankAcctCode() {
        return payeeBankAcctCode;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_BANKACCTCODE
     *
     * @param payeeBankAcctCode the value for FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_BANKACCTCODE
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public void setPayeeBankAcctCode(String payeeBankAcctCode) {
        this.payeeBankAcctCode = payeeBankAcctCode;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.TRADE_TYPE
     *
     * @return the value of FO.BATCH_PAYMENTTOBANKREQDETAIL.TRADE_TYPE
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public String getTradeType() {
        return tradeType;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.TRADE_TYPE
     *
     * @param tradeType the value for FO.BATCH_PAYMENTTOBANKREQDETAIL.TRADE_TYPE
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_BANKCODE
     *
     * @return the value of FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_BANKCODE
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public String getPayeeBankCode() {
        return payeeBankCode;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_BANKCODE
     *
     * @param payeeBankCode the value for FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_BANKCODE
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public void setPayeeBankCode(String payeeBankCode) {
        this.payeeBankCode = payeeBankCode;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_BANKNAME
     *
     * @return the value of FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_BANKNAME
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public String getPayeeBankName() {
        return payeeBankName;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_BANKNAME
     *
     * @param payeeBankName the value for FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_BANKNAME
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public void setPayeeBankName(String payeeBankName) {
        this.payeeBankName = payeeBankName;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_OPENINGBANKNAME
     *
     * @return the value of FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_OPENINGBANKNAME
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public String getPayeeOpeningBankName() {
        return payeeOpeningBankName;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_OPENINGBANKNAME
     *
     * @param payeeOpeningBankName the value for FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_OPENINGBANKNAME
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public void setPayeeOpeningBankName(String payeeOpeningBankName) {
        this.payeeOpeningBankName = payeeOpeningBankName;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_BANKPROVINCE
     *
     * @return the value of FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_BANKPROVINCE
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public String getPayeeBankProvince() {
        return payeeBankProvince;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_BANKPROVINCE
     *
     * @param payeeBankprovince the value for FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_BANKPROVINCE
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public void setPayeeBankProvince(String payeeBankProvince) {
        this.payeeBankProvince = payeeBankProvince;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_BANKPROVINCENAME
     *
     * @return the value of FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_BANKPROVINCENAME
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public String getPayeeBankProvinceName() {
        return payeeBankProvinceName;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_BANKPROVINCENAME
     *
     * @param payeeBankProvinceName the value for FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_BANKPROVINCENAME
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public void setPayeeBankProvinceName(String payeeBankProvinceName) {
        this.payeeBankProvinceName = payeeBankProvinceName;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_BANKCITY
     *
     * @return the value of FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_BANKCITY
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public String getPayeeBankCity() {
        return payeeBankCity;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_BANKCITY
     *
     * @param payeeBankCity the value for FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_BANKCITY
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public void setPayeeBankCity(String payeeBankCity) {
        this.payeeBankCity = payeeBankCity;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_BANKCITYNAME
     *
     * @return the value of FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_BANKCITYNAME
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public String getPayeeBankCityName() {
        return payeeBankCityName;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_BANKCITYNAME
     *
     * @param payeeBankCityName the value for FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYEE_BANKCITYNAME
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public void setPayeeBankCityName(String payeeBankCityName) {
        this.payeeBankCityName = payeeBankCityName;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.REQUEST_AMOUNT
     *
     * @return the value of FO.BATCH_PAYMENTTOBANKREQDETAIL.REQUEST_AMOUNT
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public String getRequestAmount() {
        return requestAmount;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.REQUEST_AMOUNT
     *
     * @param uploadAmount the value for FO.BATCH_PAYMENTTOBANKREQDETAIL.REQUEST_AMOUNT
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public void setRequestAmount(String requestAmount) {
        this.requestAmount = requestAmount;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.REMARK
     *
     * @return the value of FO.BATCH_PAYMENTTOBANKREQDETAIL.REMARK
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.REMARK
     *
     * @param remark the value for FO.BATCH_PAYMENTTOBANKREQDETAIL.REMARK
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.VALID_STATUS
     *
     * @return the value of FO.BATCH_PAYMENTTOBANKREQDETAIL.VALID_STATUS
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public Integer getValidStatus() {
        return validStatus;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.VALID_STATUS
     *
     * @param validStatus the value for FO.BATCH_PAYMENTTOBANKREQDETAIL.VALID_STATUS
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public void setValidStatus(Integer validStatus) {
        this.validStatus = validStatus;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.ERROR_MSG
     *
     * @return the value of FO.BATCH_PAYMENTTOBANKREQDETAIL.ERROR_MSG
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.ERROR_MSG
     *
     * @param errorMsg the value for FO.BATCH_PAYMENTTOBANKREQDETAIL.ERROR_MSG
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYMENT_AMOUNT
     *
     * @return the value of FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYMENT_AMOUNT
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public Long getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYMENT_AMOUNT
     *
     * @param paymentAmount the value for FO.BATCH_PAYMENTTOBANKREQDETAIL.PAYMENT_AMOUNT
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public void setPaymentAmount(Long paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.IS_PAYERPAYFEE
     *
     * @return the value of FO.BATCH_PAYMENTTOBANKREQDETAIL.IS_PAYERPAYFEE
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public Integer getIsPayerPayFee() {
        return isPayerPayFee;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.IS_PAYERPAYFEE
     *
     * @param isPayerPayFee the value for FO.BATCH_PAYMENTTOBANKREQDETAIL.IS_PAYERPAYFEE
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public void setIsPayerPayFee(Integer isPayerPayFee) {
        this.isPayerPayFee = isPayerPayFee;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.FEE
     *
     * @return the value of FO.BATCH_PAYMENTTOBANKREQDETAIL.FEE
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public Long getFee() {
        return fee;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.FEE
     *
     * @param fee the value for FO.BATCH_PAYMENTTOBANKREQDETAIL.FEE
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public void setFee(Long fee) {
        this.fee = fee;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.REALPAY_AMOUNT
     *
     * @return the value of FO.BATCH_PAYMENTTOBANKREQDETAIL.REALPAY_AMOUNT
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public Long getRealpayAmount() {
        return realpayAmount;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.REALPAY_AMOUNT
     *
     * @param realpayAmount the value for FO.BATCH_PAYMENTTOBANKREQDETAIL.REALPAY_AMOUNT
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public void setRealpayAmount(Long realpayAmount) {
        this.realpayAmount = realpayAmount;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.REALOUT_AMOUNT
     *
     * @return the value of FO.BATCH_PAYMENTTOBANKREQDETAIL.REALOUT_AMOUNT
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public Long getRealoutAmount() {
        return realoutAmount;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.REALOUT_AMOUNT
     *
     * @param realoutAmount the value for FO.BATCH_PAYMENTTOBANKREQDETAIL.REALOUT_AMOUNT
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public void setRealoutAmount(Long realoutAmount) {
        this.realoutAmount = realoutAmount;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.ORDER_STATUS
     *
     * @return the value of FO.BATCH_PAYMENTTOBANKREQDETAIL.ORDER_STATUS
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.ORDER_STATUS
     *
     * @param orderStatus the value for FO.BATCH_PAYMENTTOBANKREQDETAIL.ORDER_STATUS
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.CREATE_DATE
     *
     * @return the value of FO.BATCH_PAYMENTTOBANKREQDETAIL.CREATE_DATE
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.CREATE_DATE
     *
     * @param createDate the value for FO.BATCH_PAYMENTTOBANKREQDETAIL.CREATE_DATE
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.UPDATE_DATE
     *
     * @return the value of FO.BATCH_PAYMENTTOBANKREQDETAIL.UPDATE_DATE
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column FO.BATCH_PAYMENTTOBANKREQDETAIL.UPDATE_DATE
     *
     * @param updateDate the value for FO.BATCH_PAYMENTTOBANKREQDETAIL.UPDATE_DATE
     *
     * @abatorgenerated Mon Jun 13 17:37:36 CST 2011
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

	public String getBankNumber() {
		return bankNumber;
	}

	public void setBankNumber(String bankNumber) {
		this.bankNumber = bankNumber;
	}
}