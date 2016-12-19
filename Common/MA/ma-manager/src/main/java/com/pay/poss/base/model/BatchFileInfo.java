/**
 *
 * auto generated by ibatis tools 
 *
 **/
package com.pay.poss.base.model;

import java.math.BigDecimal;
import java.util.Date;

import com.pay.inf.model.BaseObject;

/**
 * BATCH_FILE_INFO
 */

public class BatchFileInfo extends BaseObject {

	private static final long serialVersionUID = 1L;
	private Long fileType;
	private Integer allCount;
	private java.util.Date updatetime;
	private Long status;
	private String filePath;
	private Long fileKy;
	private String fileName;
	private BigDecimal allAmount;
	private String operators;
	private Long batchKy;
	private String bankCode;
	private String batchNum;
	private Long batchFileStatus;

	private Integer dlBatchCount;

	private Integer dlBatchBusiCount;

	private Integer dlBankCount;

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	private Integer dlBankBusiCount;

	private Date updateTime;

	private Date generateTime;

	private Date downloadTime;

	private Date importTime;

	private Date sureimportTime;
	
	/**
	 * 
	 */
	private transient String batchName;
	

	public Long getFileType() {
		return fileType;
	}

	public void setFileType(Long fileType) {
		this.fileType = fileType;
	}

	public Integer getAllCount() {
		return allCount;
	}

	public void setAllCount(Integer allCount) {
		this.allCount = allCount;
	}

	public java.util.Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(java.util.Date updatetime) {
		this.updatetime = updatetime;
	}

	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public Long getFileKy() {
		return fileKy;
	}

	public void setFileKy(Long fileKy) {
		this.fileKy = fileKy;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public BigDecimal getAllAmount() {
		return allAmount;
	}

	public void setAllAmount(BigDecimal allAmount) {
		this.allAmount = allAmount;
	}

	public String getOperators() {
		return operators;
	}

	public void setOperators(String operators) {
		this.operators = operators;
	}

	public Long getBatchKy() {
		return batchKy;
	}

	public void setBatchKy(Long batchKy) {
		this.batchKy = batchKy;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBatchNum() {
		return batchNum;
	}

	public void setBatchNum(String batchNum) {
		this.batchNum = batchNum;
	}

	public Integer getDlBatchCount() {
		return dlBatchCount;
	}

	public void setDlBatchCount(Integer dlBatchCount) {
		this.dlBatchCount = dlBatchCount;
	}

	public Integer getDlBatchBusiCount() {
		return dlBatchBusiCount;
	}

	public void setDlBatchBusiCount(Integer dlBatchBusiCount) {
		this.dlBatchBusiCount = dlBatchBusiCount;
	}

	public Integer getDlBankCount() {
		return dlBankCount;
	}

	public void setDlBankCount(Integer dlBankCount) {
		this.dlBankCount = dlBankCount;
	}

	public Integer getDlBankBusiCount() {
		return dlBankBusiCount;
	}

	public void setDlBankBusiCount(Integer dlBankBusiCount) {
		this.dlBankBusiCount = dlBankBusiCount;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getGenerateTime() {
		return generateTime;
	}

	public void setGenerateTime(Date generateTime) {
		this.generateTime = generateTime;
	}

	public Date getDownloadTime() {
		return downloadTime;
	}

	public void setDownloadTime(Date downloadTime) {
		this.downloadTime = downloadTime;
	}

	public Date getImportTime() {
		return importTime;
	}

	public void setImportTime(Date importTime) {
		this.importTime = importTime;
	}

	public Date getSureimportTime() {
		return sureimportTime;
	}

	public void setSureimportTime(Date sureimportTime) {
		this.sureimportTime = sureimportTime;
	}

	public Long getBatchFileStatus() {
		return batchFileStatus;
	}

	public void setBatchFileStatus(Long batchFileStatus) {
		this.batchFileStatus = batchFileStatus;
	}


}