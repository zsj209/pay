/**
*
* auto generated by ibatis tools 
*
**/
package com.pay.fundout.reconcile.dto.fileservice;
import java.math.BigDecimal;

import com.pay.inf.model.BaseObject;

/**
* RECONCILE_IMPORT_RECORD
*/

public class ReconcileImportRecordDTO  extends BaseObject{

    private static final long serialVersionUID = 1L;
    private Long recordId;
    private Long fileId;
    private String withdrawBusiType;
    private String bankSeq;
    private BigDecimal bankAmount;
    private java.util.Date tradeTime;
    private String withdrawBankId;
    public Long getRecordId() {
        return recordId;
    }
    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }
    public Long getFileId() {
        return fileId;
    }
    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }
    public String getWithdrawBusiType() {
        return withdrawBusiType;
    }
    public void setWithdrawBusiType(String withdrawBusiType) {
        this.withdrawBusiType = withdrawBusiType;
    }
    public String getBankSeq() {
        return bankSeq;
    }
    public void setBankSeq(String bankSeq) {
        this.bankSeq = bankSeq;
    }
    public BigDecimal getBankAmount() {
        return bankAmount;
    }
    public void setBankAmount(BigDecimal bankAmount) {
        this.bankAmount = bankAmount;
    }
    public java.util.Date getTradeTime() {
        return tradeTime;
    }
    public void setTradeTime(java.util.Date tradeTime) {
        this.tradeTime = tradeTime;
    }
    public String getWithdrawBankId() {
        return withdrawBankId;
    }
    public void setWithdrawBankId(String withdrawBankId) {
        this.withdrawBankId = withdrawBankId;
    }
    public Long getBusiStatus() {
        return busiStatus;
    }
    public void setBusiStatus(Long busiStatus) {
        this.busiStatus = busiStatus;
    }
    public String getTradeSeq() {
        return tradeSeq;
    }
    public void setTradeSeq(String tradeSeq) {
        this.tradeSeq = tradeSeq;
    }
    private Long busiStatus;
    private String tradeSeq;

   
}