/**
 * 
 */
package com.pay.fo.order.dao.bsp;

import com.pay.fo.order.model.bsp.AuditQueryOrder;
import com.pay.inf.dao.Page;
import com.pay.inf.dao.impl.BaseDAOImpl;

/**
 * @author NEW
 * 
 */
public class AuditQueryOrderDAOImpl extends BaseDAOImpl<AuditQueryOrder>
		implements AuditQueryOrderDAO {

	@Override
	public Page<AuditQueryOrder> queryFundAdjustmentAuditList(
			Page<AuditQueryOrder> page, AuditQueryOrder auditQueryOrder) {
		return findByQuery("queryFundAdjustmentAuditList", page,
				auditQueryOrder);
	}

	@Override
	public AuditQueryOrder getAuditQueryOrder(Long orderId,
			Long createMemberCode) {
		AuditQueryOrder order = new AuditQueryOrder();
		order.setCreateMemberCode(createMemberCode);
		order.setOrderId(orderId);
		return super.findObjectByCriteria("queryFundAdjustmentAuditOrder",
				order);
	}

}
