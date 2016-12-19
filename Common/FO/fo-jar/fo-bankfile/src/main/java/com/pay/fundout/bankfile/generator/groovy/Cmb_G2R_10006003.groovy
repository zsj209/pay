package com.pay.fundout.bankfile.generator.groovy

import org.springframework.beans.BeanUtils

import com.pay.fundout.bankfile.common.util.BnakFileUtil
import com.pay.fundout.bankfile.generator.AbstractBankFileGenerator
import com.pay.fundout.bankfile.generator.helper.FileGenerateResult
import com.pay.fundout.bankfile.generator.model.FileDetailMode
import com.pay.fundout.bankfile.generator.model.FileSummaryModel
import com.pay.fundout.bankfile.generator.model.refund.RefundGenModel

/**		
 *  @author lIWEI
 *  @Date 2011-6-22
 *  @Description 招行充退出款文件
 *  @Copyright Copyright © 2004-2013 pay.com . All rights reserved. GCPayment版权所有
 */
class Cmb_G2R_10006003 extends AbstractBankFileGenerator {

	/* (non-Javadoc)
	 * @see com.pay.fundout.bankfile.generator.BankFileGenerator#supportBank(java.lang.String)
	 */
	@Override
	public boolean supportBank(String bankCode) {
		return "10006003".equals(bankCode);
	}

	/* (non-Javadoc)
	 * @see com.pay.fundout.bankfile.generator.BankFileGenerator#supportTradeType()
	 */
	@Override
	public String supportTradeType() {
		return "R";
	}

	/* (non-Javadoc)
	 * @see com.pay.fundout.bankfile.generator.AbstractBankFileGenerator#buildBankDetailList(com.pay.fundout.bankfile.generator.helper.FileGenerateResult)
	 */
	@Override
	protected void buildBankDetailList(FileGenerateResult fileGenerateResult) {
		def size = fileGenerateResult.getDetailList().size();
		BigDecimal sumAmount =  0;
		BigDecimal amount = 0
		RefundGenModel model = null; 
		Map<String,Object> ctxMap = new HashMap<String, Object>();
		String dateString = df3.format(new Date());
		Random random = new Random();//创建random对象
		String randomNum = String.valueOf(random.nextInt(1000000));
		List<RefundGenModel> orderList = new ArrayList<RefundGenModel>(size);
		def count = 0;
		for(FileDetailMode fileDetailMode : fileGenerateResult.getDetailList()){
				++count;
				model = new RefundGenModel(); 
				BeanUtils.copyProperties ( fileDetailMode, model);
				model.setRefundDate(df3.format(fileDetailMode.getApplyTimes()));
				model.setRechargeDate(df3.format(fileDetailMode.getRechargeTime()));
				amount = BnakFileUtil.divideNum(fileDetailMode.getApplyAmount(), new BigDecimal(1000));
				model.setApplyAmount(amount);
				model.setApplyRemark("["+fileDetailMode.getDetailKy()+"]"+fileDetailMode.getApplyRemark());
				sumAmount = sumAmount.add(amount);
				orderList.add(model);
			}
		ctxMap.put("orderList",orderList);
		String fileName = "cmb_"+dateString + "_" + fileGenerateResult.getBatchNum()+"_3";
		fileGenerateResult.setFileName(fileName);
		fileGenerateResult.setFileSubfix(TXT_FILE_SUBFIX);
		fileGenerateResult.setGenFileEncoding(ENCODING_ANSI);
		// 获取文件全路径并生成相应的路径
		genRfFullPath(fileGenerateResult);
		fileGenerateResult.setTemplateName("cmb_gen2r.vm");
		
		FileSummaryModel summaryModel = new FileSummaryModel();
		summaryModel.setTotalCount(size);
		summaryModel.setTotalAmount(sumAmount);
		summaryModel.setBankCode("10006003");
		//ctxMap.put("summer",summaryModel);
		
		fileGenerateResult.setCtxMap(ctxMap);
		//生成模板文件
		writeVelocityFile(fileGenerateResult);
		//构建批次信息
		sumAmount = sumAmount.multiply(new BigDecimal(1000))
		summaryModel.setTotalAmount(sumAmount);
		buildBatchFileInfo(fileGenerateResult, summaryModel);

	}

}
