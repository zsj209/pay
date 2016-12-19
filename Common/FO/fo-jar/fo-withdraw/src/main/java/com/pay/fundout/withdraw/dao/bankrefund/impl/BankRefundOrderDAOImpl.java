/**
 *
 * auto generated by ibatis tools 
 *
 **/
package com.pay.fundout.withdraw.dao.bankrefund.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pay.fundout.withdraw.dao.bankrefund.BankRefundOrderDAO;
import com.pay.fundout.withdraw.model.bankrefund.BackfundOrder;
import com.pay.fundout.withdraw.model.bankrefund.BankRefundOrder;
import com.pay.fundout.withdraw.model.bankrefund.BankRefundOrderQueryResult;
import com.pay.inf.dao.Page;
import com.pay.inf.dao.impl.BaseDAOImpl;
import com.pay.poss.base.common.order.WithdrawOrderStatus;

public class BankRefundOrderDAOImpl extends BaseDAOImpl implements
		BankRefundOrderDAO {

	@Override
	public Long createOrder(BankRefundOrder order) {
		order.setUniqueKey(String.valueOf(order.getTradeOrderId())
				+ String.valueOf(order.getStatus()));
		return (Long) super.create(order);
	}

	@Override
	public boolean updateOrder(BankRefundOrder order) {
		String uniqueKey = null;
		if (WithdrawOrderStatus.FAIL.getValue() == order.getStatus().intValue()) {
			uniqueKey = String.valueOf(order.getTradeOrderId())
					+ String.valueOf(order.getSequenceId());
		} else {
			uniqueKey = String.valueOf(order.getTradeOrderId())
					+ String.valueOf(order.getStatus());
		}
		order.setOldUniqueKey(order.getUniqueKey());
		order.setUniqueKey(uniqueKey);

		return super.update(order);
	}

	@Override
	public Page<BankRefundOrderQueryResult> getAllowRefundList(
			Page<BankRefundOrderQueryResult> page, Object... params) {
		return (Page<BankRefundOrderQueryResult>) super
				.findByQuery("bankrefundorder.queryAllowRefundListBySelective",
						page, params);
	}

	@Override
	public Page<BankRefundOrderQueryResult> getAuditRefundList(
			Page<BankRefundOrderQueryResult> page, Object... params) {
		return (Page<BankRefundOrderQueryResult>) super
				.findByQuery("bankrefundorder.queryAuditResultListBySelective",
						page, params);
	}

	@SuppressWarnings("unchecked")
	@Override
	public BankRefundOrderQueryResult getAllowRefundOrderById(String orderId) {
		Map params = new HashMap();
		params.put("sequenceId", orderId);
		return (BankRefundOrderQueryResult) getSqlMapClientTemplate()
				.queryForObject("bankrefundorder.getAllowRefundOrderById",
						params);
	}

	@SuppressWarnings("unchecked")
	@Override
	public BankRefundOrderQueryResult getAuditRefundOrderById(String orderId) {
		return (BankRefundOrderQueryResult) getSqlMapClientTemplate()
				.queryForObject("bankrefundorder.getAuditRefundOrderById",
						orderId);
	}

	@Override
	public Page<BankRefundOrderQueryResult> getAuditedRefundList(
			Page<BankRefundOrderQueryResult> page, Object... params) {
		return (Page<BankRefundOrderQueryResult>) super.findByQuery(
				"bankrefundorder.queryAuditedResultListBySelective", page,
				params);
	}

	@Override
	public BankRefundOrder getOrderByTradeOrderId(Long tradeOrderId) {
		return (BankRefundOrder) getSqlMapClientTemplate().queryForObject(
				"bankrefundorder.findByTradeOrderId", tradeOrderId);
	}

	@Override
	public BackfundOrder queryBackfundOrderByInnerOrderId(
			Map<String, String> param) {
		return (BackfundOrder) findObjectByCriteria("bankrefundorder.queryBackfundOrder", param);
	}

	@Override
	public List<Map<String, String>> getFailDesc() {
		return super.findByQuery("foFailDescList", null);
	}

}