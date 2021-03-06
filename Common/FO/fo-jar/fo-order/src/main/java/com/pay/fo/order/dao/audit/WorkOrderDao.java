/**
 *  File: WorkOrderDao.java
 *  Description:
 *  Copyright 2006-2011 pay Corporation. All rights reserved.
 *  Date        Author      Changes
 *  Jun 27, 2011   terry ma      create
 */
package com.pay.fo.order.dao.audit;

import java.util.Map;

import com.pay.fo.order.model.audit.WorkOrder;
import com.pay.inf.dao.BaseDAO;
import com.pay.inf.dao.Page;

public interface WorkOrderDao extends BaseDAO<WorkOrder> {

	/**
	 * 
	 * @param orderSeq
	 * @return
	 */
	public WorkOrder findByOrderSeq(final Long orderSeq);

	/**
	 * 
	 * @param auditMembercode
	 * @return
	 */
	public Page<WorkOrder> findByAuditMemberCodeAndOrderType(
			Page<WorkOrder> page, final Long auditMembercode,
			final Integer orderType);

	/**
	 * 更新工单状态
	 * 
	 * @param param
	 * @return
	 */
	public boolean updateWorkOrderWithOldStatus(Map<String, Object> param);

}
