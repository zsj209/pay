/**
 *
 * auto generated by ibatis tools 
 *
 **/
package com.pay.txncore.dao.impl;

import java.util.HashMap;
import java.util.Map;

import com.pay.inf.dao.impl.BaseDAOImpl;
import com.pay.txncore.dao.CommonUploadFileDAO;
import com.pay.txncore.model.CommonUploadFile;

public class CommonUploadFileDAOImpl extends BaseDAOImpl<CommonUploadFile>
		implements CommonUploadFileDAO {

	@Override
	public CommonUploadFile queryFileByMemberCodeAndFileNO(String memberCode,
			Long fileNo) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("memberCode", memberCode);
		params.put("fileNo", fileNo.toString());
		return (CommonUploadFile) getSqlMapClientTemplate().queryForObject(
				"commonUploadFile.queryFile", params);
	}
}