/**
 *
 * auto generated by ibatis tools 
 *
 **/
package com.pay.txncore.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pay.inf.dao.Page;
import com.pay.inf.dao.impl.BaseDAOImpl;
import com.pay.txncore.dao.RefundOrderDAO;
import com.pay.txncore.model.RefundExceptionMonitor;
import com.pay.txncore.model.RefundOrder;
import com.pay.txncore.model.RefundOrderDetail;
import com.pay.txncore.model.RefundPayLinkOrder;
import com.pay.util.StringUtil;

public class RefundOrderDAOImpl extends BaseDAOImpl implements RefundOrderDAO {

	@Override
	public boolean lockedRefundForUpdate(Long refundOrderNo) {
		RefundOrder order = null;
		order = (RefundOrder) getSqlMapClientTemplate().queryForObject(
				"refundOrder.lockedRefundForUpdate", refundOrderNo);
		if (order != null)
			return true;
		return false;
	}

	@Override
	public boolean updateRefundOrderState(Long refundOrderNo, Integer status) {
		return updateRefundOrderState(refundOrderNo, status, null, null);
	}

	@Override
	public boolean updateRefundOrderState(Long refundOrderNo, Integer status,
			String errorCode, Long depositBackNo) {
		Map<String, String> queryParams = new HashMap<String, String>();
		queryParams.put("refundOrderNo", refundOrderNo.toString());
		queryParams.put("status", String.valueOf(status));
		if (StringUtil.isEmpty(errorCode)) {
			queryParams.put("errorCode", null);
		} else {
			queryParams.put("errorCode", errorCode);
		}
		if (depositBackNo == null) {
			queryParams.put("depositBackNo", null);
		} else {
			queryParams.put("depositBackNo", depositBackNo.toString());
		}
		return getSqlMapClientTemplate().update(
				"refundOrder.updateRefundOrderState", queryParams) == 1;
	}

	@Override
	public boolean updateRefundReconciliationFlg(String refundOrderNo, Integer reconciliationFlg) {
		Map<String, Object> queryParams = new HashMap<String, Object>();
		queryParams.put("refundOrderNo", refundOrderNo);
		queryParams.put("reconciliationFlg", reconciliationFlg);
		return getSqlMapClientTemplate().update("refundOrder.updateRefundReconciliationFlg",
				queryParams) == 1;
	}

	@Override
	public Map getRefundFeeByPaymentOrderNo(Long paymentOrderNo) {
		Map mapValue = (Map) getSqlMapClientTemplate().queryForObject(
				"refundOrder.queryRefundFee", paymentOrderNo);
		return mapValue;
	}

	@Override
	public List<RefundOrderDetail> queryRefundOrderDetails(Map param, Page page) {

		return super.findByCriteria("queryRefundOrderDetail", param, page);
	}

	@Override
	public int countRefundOrderList(Map param) {

		return (Integer) this.getSqlMapClientTemplate().queryForObject(
				"refundOrder.countRefundOrderDetail", param);
	}

	@Override
	public List<RefundOrderDetail> queryRefundOrderDetails(Map param) {
		List<RefundOrderDetail> details = getSqlMapClientTemplate()
				.queryForList("refundOrder.queryRefundOrderDetail", param);
		return details;
	}

	@Override
	public Long countByPidAndOrderId(String partnerId, String orderId) {
		Map<String, String> queryParams = new HashMap<String, String>();
		Long count = 0L;
		queryParams.put("partnerId", partnerId);
		queryParams.put("orderId", orderId);
		count = (Long) getSqlMapClientTemplate().queryForObject(
				"refundOrder.countByPidAndOrderId", queryParams);
		return count;
	}

	@Override
	public Long queryPartnerRefundAmount(Long paymentOrderNo) {
		Long refundAmount = 0L;
		refundAmount = (Long) getSqlMapClientTemplate().queryForObject(
				"refundOrder.queryPartnerRefundAmount", paymentOrderNo);
		return refundAmount;
	}

	@Override
	public List<RefundOrderDetail> queryRefundOrderByTradeOrderNo(
			Long tradeOrderNo) {
		List<RefundOrderDetail> details = getSqlMapClientTemplate()
				.queryForList("refundOrder.queryRefundByTradeOrderNo",
						tradeOrderNo);
		return details;
	}

	@Override
	public List<RefundOrderDetail> queryBeRefundOrderDetails(Map param,
			Page page) {

		return super.findByCriteria("queryBeRefundOrderDetail", param, page);
	}

	@Override
	public List<RefundOrderDetail> queryBeRefundOrderDetails(Map param) {
		List<RefundOrderDetail> details = getSqlMapClientTemplate()
				.queryForList("refundOrder.queryBeRefundOrderDetail", param);
		return details;
	}

	@Override
	public int countBeRefundOrderList(Map param) {
		return (Integer) this.getSqlMapClientTemplate().queryForObject(
				"refundOrder.countBeRefundOrderDetail", param);
	}
	
	@Override
	public List<RefundOrder> findByTradeOrderNo(Long tradeOrderNo){
		return super.findByCriteria("findByTradeOrderNo", tradeOrderNo);
	}

	@Override
	public boolean isLastRefundOrder(Long tradeOrderNo, Long refundOrderNo) {
		Map paraMap = new HashMap();
		paraMap.put("tradeOrderNo", tradeOrderNo);
		paraMap.put("refundOrderNo", refundOrderNo);
		Integer cnt = (Integer) super.findObjectByCriteria("checkLastRefundOrder", paraMap);
		return cnt == 0;
	}
	
	@Override
	public List<RefundExceptionMonitor> getRefundExceptionMonitorList(Map param,Page page) {
		return super.findByCriteria("getExceptionMonitor",param,page);
	}
	
	@Override
	public List<RefundPayLinkOrder> queryRefundPayLinkList(Map param, Page page) {
		return super.findByCriteria("refundPayLink",param, page);
	}
}