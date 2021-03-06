/**
 *
 * auto generated by ibatis tools 
 *
 **/
package com.pay.txncore.dao;

import java.util.List;

import com.pay.inf.dao.BaseDAO;
import com.pay.inf.exception.AppException;
import com.pay.txncore.model.BatchRefundDetail;
import com.pay.txncore.model.RefundOrderQueryResultDetail;

public interface BatchRefundDetailDAO extends BaseDAO {

	/**
	 * 
	 * @param records
	 * @throws AppException
	 */
	void insert(List<BatchRefundDetail> records) throws AppException;

	/**
	 * 
	 * @param batchRefundNo
	 * @param memberCode
	 * @return
	 */
	List<RefundOrderQueryResultDetail> queryBatchRefundDetail(
			Long batchRefundNo, String memberCode);

	/**
	 * 
	 * @param batchRefundNo
	 * @param memberCode
	 * @return
	 */
	List<RefundOrderQueryResultDetail> queryValidFailDetail(Long batchRefundNo,
			String memberCode);

	/**
	 * 
	 * @param refundNo
	 * @param resultCode
	 */
	void updateResultCodeByRefundNo(Long refundNo, String resultCode);
}