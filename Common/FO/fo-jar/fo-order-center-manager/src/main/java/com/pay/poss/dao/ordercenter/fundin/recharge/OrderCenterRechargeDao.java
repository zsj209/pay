package com.pay.poss.dao.ordercenter.fundin.recharge;

import java.util.List;

import com.pay.inf.dao.BaseDAO;
import com.pay.inf.dao.Page;
import com.pay.poss.service.ordercenter.dto.detail.OrderDetailDTO;
import com.pay.poss.service.ordercenter.dto.list.OrderCenterQueryDTO;
import com.pay.poss.service.ordercenter.dto.list.OrderCenterResultDTO;
import com.pay.poss.service.ordercenter.dto.relationorder.OrderRelationDTO;

/**
 * <p>
 * 查询充值结果列表Dao
 * </p>
 * 
 * @author Andy.Zhao
 * @since 2010-11-10
 * @see
 */

public interface OrderCenterRechargeDao extends BaseDAO {
	/**
	 * 查询网关充值交易分页列表
	 * 
	 * @param page
	 * @param dto
	 * @return
	 */
	Page<OrderCenterResultDTO> queryRechargeResultList(
			Page<OrderCenterResultDTO> page, OrderCenterQueryDTO dto);

	/**
	 * 网关充值订单详情
	 * 
	 * @param id
	 * @return OrderDetailDTO
	 */
	OrderDetailDTO queryOrderDetail(Long id);

	/**
	 * 查询网关充值关联订单列表
	 * 
	 * @param dto
	 * @return
	 */
	List<OrderRelationDTO> queryRefundRelationList(OrderCenterQueryDTO dto);
}
