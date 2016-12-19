/**
 *  File: Boc_C2E.groovy
 *  Description:
 *  Copyright 2006-2011 hnapay Corporation. All rights reserved.
 *  Date      Author      Changes
 *  2011-8-23   liwei     Create
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
import com.hnapay.poss.base.util.StringUtil

/**		
 *  @author lIWEI
 *  @Date 2011-8-23
 *  @Description 中国银行 复核文件
 */
class Boc_C2E extends AbstractBaseFileParser {

	/* (non-Javadoc)
	 * @see com.hnapay.fundout.bankfile.parser.AbstractBaseFileParser#parserFile(com.hnapay.fundout.bankfile.parser.helper.FileParseResult)
	 */
	@Override
	protected void parserFile(FileParseResult fileParseResult) throws Exception {
		Workbook workbook = new XSSFWorkbook(fileParseResult.getTargetFile());       
		Sheet sheet = workbook.getSheetAt(0);
		WithdrawImportRecordModel tempInfo = null;
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if(row ==null || (row.getCell(6).toString().length()==0 || row.getCell(7).toString().length()==0 || row.getCell(8).toString().length()==0 )){
				continue;
			}
		    tempInfo = new WithdrawImportRecordModel();
			String bankAcct = trimAllWhitespace(String.valueOf(row.getCell(8)));
			String bankAcctName = trimAllWhitespace(String.valueOf(row.getCell(7)));
			String amount = trimAllWhitespace(String.valueOf(row.getCell(6)));
			//String feedBack = trimAllWhitespace(String.valueOf(row.getCell(8)));
			//tempInfo.setBankRemark(feedBack);
			tempInfo.setBankAcct(bankAcct);
			tempInfo.setBankAcctName(bankAcctName);
			
			if(StringUtil.isEmpty(bankAcct) || StringUtil.isEmpty(bankAcctName) || StringUtil.isEmpty(amount)){
				continue;
			}
			
			//将金额的"逗号"去掉
			if(amount != null && amount.contains(',')){
				amount = amount.replaceAll (",", "");
			}
			if(amount.startsWith(".")){
				amount = "0"+amount;
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
