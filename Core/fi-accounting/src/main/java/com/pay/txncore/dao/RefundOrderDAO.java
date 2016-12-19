/**
 *
 * auto generated by ibatis tools 
 *
 **/
package com.pay.txncore.dao;

import java.util.List;
import java.util.Map;

import com.pay.inf.dao.BaseDAO;
import com.pay.inf.dao.Page;
import com.pay.txncore.model.RefundExceptionMonitor;
import com.pay.txncore.model.RefundOrder;
import com.pay.txncore.model.RefundOrderDetail;
import com.pay.txncore.model.RefundPayLinkOrder;

public interface RefundOrderDAO extends BaseDAO {

	/**
	 * 
	 * @param refundOrderNo
	 * @return
	 */
	public boolean lockedRefundForUpdate(Long refundOrderNo);

	/**
	 * 
	 * @param refundOrderNo
	 * @param status
	 * @return
	 */
	public boolean updateRefundOrderState(Long refundOrderNo, Integer status);

	/**
	 * 
	 * @param refundOrderNo
	 * @param status
	 * @param errorCode
	 * @param depositBackNo
	 * @return
	 */
	public boolean updateRefundOrderState(Long refundOrderNo, Integer status,
			String errorCode, Long depositBackNo);

	/**
	 * 根据网关流水查询出已经退款的退款金额汇总 0:退款中;1:退款成功;
	 * 
	 * @param tradeOrderNo
	 * @return
	 */
	public Map getRefundFeeByPaymentOrderNo(Long paymentOrderNo);

	/**
	 * 
	 * @param paymentOrderNo
	 * @return
	 */
	public Long queryPartnerRefundAmount(Long paymentOrderNo);

	/**
	 * 
	 * @param param
	 * @param page
	 * @return
	 */
	public List<RefundOrderDetail> queryRefundOrderDetails(Map param, Page page);

	/**
	 * 
	 * @param param
	 * @return
	 */
	public List<RefundOrderDetail> queryRefundOrderDetails(Map param);

	/**
	 * 
	 * @param param
	 * @return
	 */
	public int countRefundOrderList(Map param);

	/**
	 * 根据商户及原商户退款订单查询总数
	 * 
	 * @param partnerId
	 * @param orderId
	 * @return
	 */
	public Long countByPidAndOrderId(String partnerId, String orderId);

	/**
	 * 
	 * @param tradeOrderNo
	 * @return
	 */
	public List<RefundOrderDetail> queryRefundOrderByTradeOrderNo(
			Long tradeOrderNo);

	/**
	 * 
	 * @param param
	 * @param page
	 * @return
	 */
	public List<RefundOrderDetail> queryBeRefundOrderDetails(Map param,
			Page page);

	/**
	 * 
	 * @param param
	 * @return
	 */
	public List<RefundOrderDetail> queryBeRefundOrderDetails(Map param);

	/**
	 * 
	 * @param param
	 * @return
	 */
	public int countBeRefundOrderList(Map param);

	/**
	 * 根据网关交易号获取退款订单
	 * 
	 * @param tradeOrderNo
	 * @return
	 */
	List<RefundOrder> findByTradeOrderNo(Long tradeOrderNo);

	/**
	 * 
	 * @param tradeOrderNo
	 * @param refundOrderNo
	 * @return
	 */
	boolean isLastRefundOrder(Long tradeOrderNo, Long refundOrderNo);
	
	List<RefundExceptionMonitor> getRefundExceptionMonitorList(Map param,Page page);
	
	List<RefundPayLinkOrder> queryRefundPayLinkList(Map param,Page page);

	/**
	 * 更新退款订单记账状态
	 * 
	 * @param refundOrderNo
	 * @param reconciliationFlg
	 * @return 2016年4月26日 mmzhang add
	 */
	public boolean updateRefundReconciliationFlg(String refundOrderNo, Integer reconciliationFlg);
}
