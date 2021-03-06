/**
 *  File: Ecitic_C2E.groovy
 *  Description:
 *  Copyright 2006-2011 hnapay Corporation. All rights reserved.
 *  Date      Author      Changes
 *  2011-9-16   liwei     Create
 *
 */
package com.hnapay.fundout.bankfile.parser.groovy

import static com.hnapay.fundout.bankfile.common.util.BnakFileUtil.*

import org.apache.poi.ss.usermodel.Row
import org.apache.poi.ss.usermodel.Sheet
import org.apache.poi.ss.usermodel.Workbook
import org.apache.poi.xssf.usermodel.XSSFWorkbook

import com.hnapay.fundout.bankfile.parser.AbstractBaseFileParser
import com.hnapay.fundout.bankfile.parser.helper.FileParseResult
import com.hnapay.fundout.bankfile.parser.model.WithdrawImportRecordModel

/**		
 *  @author lIWEI
 *  @Date 2011-9-16
 *  @Description 中信复核文件
 */
class Ecitic_C2E extends AbstractBaseFileParser {

	/* 
查询结果下载											
支付方式	付方账号	付方账户名称	币种	收方账号	收方账户名称	金额	经办日期时间	交易状态	摘要	备注	经办人
中信内转账	7331710182600093709	海南新生信息技术有限公司	人民币	7421810182600013710	西部航空有限责任公司	0.04	2011-09-14 15:24:59 	待审核	摘要信息	备注信息	姜玥
中信内转账	7331710182600093709	海南新生信息技术有限公司	人民币	7233210182600001506	天津航空有限责任公司	0.04	2011-09-14 15:24:59 	待审核	摘要信息	备注信息	姜玥
	 */
	@Override
	protected void parserFile(FileParseResult fileParseResult) throws Exception {
		Workbook workbook = new XSSFWorkbook(fileParseResult.getTargetFile());       
		Sheet sheet = workbook.getSheetAt(0);
		WithdrawImportRecordModel tempInfo = null;
		for (int rowNum = 2; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if(row ==null || (row.getCell(4).toString().length()==0 || row.getCell(5).toString().length()==0 || row.getCell(6).toString().length()==0 )){
				continue;
			}
		    tempInfo = new WithdrawImportRecordModel();
			String bankAcct = trimAllWhitespace(String.valueOf(row.getCell(4)));
			String bankAcctName = trimAllWhitespace(String.valueOf(row.getCell(5)));
			String amount = trimAllWhitespace(String.valueOf(row.getCell(6)));
			
			tempInfo.setBankAcct(bankAcct);
			tempInfo.setBankAcctName(bankAcctName);
			
			//将金额的"逗号"去掉
			if(amount != null && amount.contains(',')){
				amount = amount.replaceAll (",", "");
			}
			tempInfo.setBankAmount(new BigDecimal(trimAllWhitespace(amount)).multiply(new BigDecimal(1000)));
			tempInfo.setOrderSeq(Long.valueOf(0));
			
			tempInfo.setBankStatus(BANK_STATUS_3);
			tempInfo.setStatus(FILE_INFO_STATUS_DEFUALT);
			tempInfo.setCategory(1);
			fileParseResult.addDeailList(tempInfo);
		}
	}

}
