/**
 *
 * auto generated by ibatis tools 
 *
 **/
package com.pay.txncore.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pay.artificial.trade.model.AutoTranRela;
import com.pay.inf.dao.Page;
import com.pay.inf.dao.impl.BaseDAOImpl;
import com.pay.txncore.dao.TradeOrderDAO;
import com.pay.txncore.dto.AutoTradeOrderDTO;
import com.pay.txncore.dto.PayLinkDetailDTO;
import com.pay.txncore.dto.PayLinkTemplateDTO;
import com.pay.txncore.dto.TradeOrderDetailDTO;
import com.pay.txncore.dto.TradeOrderDetailMpsDTO;
import com.pay.txncore.model.TradeOrder;

public class TradeOrderDAOImpl extends BaseDAOImpl implements TradeOrderDAO {

	@Override
	public boolean updateForTradeOrderLock(Long tradeOrderNo) {
		TradeOrder tradeOrder = new TradeOrder();
		tradeOrder.setTradeOrderNo(tradeOrderNo);
		return super.update("updateForTradeLock", tradeOrder);
	}

	@Override
	public boolean updateForTradeOrderUNLock(Long tradeOrderNo) {
		TradeOrder tradeOrder = new TradeOrder();
		tradeOrder.setTradeOrderNo(tradeOrderNo);
		return super.update("updateForTradeUNLock", tradeOrder);
	}

	@Override
	public boolean lockedOrderForUpdate(Long tradeOrderNo) {
		TradeOrder tradeOrder = (TradeOrder) super.findObjectByCriteria(
				"lockedByTradeOrderNo", tradeOrderNo);
		return null != tradeOrder;
	}

	@Override
	public boolean updateAddRefundAmount(Long tradeOrderNo,
			String refundAmount, Integer status) {
		Map paraMap = new HashMap();
		paraMap.put("tradeOrderNo", tradeOrderNo.toString());
		paraMap.put("refundAmount", refundAmount);
		paraMap.put("status", status);
		return super.updateByMap("updateAddRefundAmountAndStatus", paraMap);
	}

	@Override
	public boolean updateAddRefundAmount(Long tradeOrderNo, String refundAmount) {
		Map paraMap = new HashMap();
		paraMap.put("tradeOrderNo", tradeOrderNo.toString());
		paraMap.put("refundAmount", refundAmount);
		return super.updateByMap("updateAddRefundAmountAndStatus", paraMap);
	}

	@Override
	public boolean updateSubRefundAmount(Long tradeOrderNo,
			String refundAmount, Integer status) {
		Map paraMap = new HashMap();
		paraMap.put("tradeOrderNo", tradeOrderNo.toString());
		paraMap.put("refundAmount", refundAmount);
		paraMap.put("status", status);
		return super.updateByMap("updateSubRefundAmountAndStatus", paraMap);
	}

	@Override
	public boolean updateStatus(Long tradeOrderNo, Integer oldStatus,
			Integer status) {
		Map paraMap = new HashMap();
		paraMap.put("tradeOrderNo", tradeOrderNo);
		paraMap.put("oldStatus", oldStatus);
		paraMap.put("status", status);
		return super.updateByMap("updateStatus", paraMap);
	}

	@Override
	public List<TradeOrder> queryTradeOrder(Long partnerId, String orderId) {
		Map paraMap = new HashMap();
		paraMap.put("partnerId", partnerId);
		paraMap.put("orderId", orderId);
		
		TradeOrder trade = new TradeOrder();
		trade.setPartnerId(Long.valueOf(partnerId));
		trade.setOrderId(orderId);
		
		List<TradeOrder> tradeOrders = super.findByCriteria("findByCriteria",trade);

		return tradeOrders;
	}
	
	@Override
	public TradeOrder queryTradeOrder(Map<String,String> paraMap) {
		
		List<TradeOrder> list = super.findByCriteria("getCompletedOrder",
				paraMap);
		if(list!=null&&list.size()>0)
		        return list.get(0);
		return null;
	}
	

	@Override
	public TradeOrder findByIdAndStatusForUpdate(TradeOrder order) {
		Map map = new HashMap();
		map.put("tradeOrderNO", order.getTradeOrderNo());
		map.put("status", order.getStatus());
		return (TradeOrder) super.findObjectByCriteria(
				"findAndLockByOrderIdAndStatus", map);
	}

	@Override
	public boolean updateAddRefundAmount(Long tradeOrderNo,
			String refundAmount, String status) {
		Map<String, String> queryParams = new HashMap<String, String>();
		queryParams.put("tradeOrderNo", tradeOrderNo.toString());
		queryParams.put("refundAmount", refundAmount);
		queryParams.put("status", status);
		return super.update("updateAddRefundAmountAndStatus", queryParams);
	}

	@Override
	public boolean updateSubRefundAmount(Long tradeOrderNo,
			String refundAmount, String status) {
		Map<String, String> queryParams = new HashMap<String, String>();
		queryParams.put("tradeOrderNo", tradeOrderNo.toString());
		queryParams.put("refundAmount", refundAmount);
		queryParams.put("status", status);
		return super.update("updateSubRefundAmountAndStatus", queryParams);
	}

	@Override
	public boolean updateRefundAmount(Long tradeOrderNo, String refundAmount,
			String status) {
		Map<String, String> queryParams = new HashMap<String, String>();
		queryParams.put("tradeOrderNo", tradeOrderNo.toString());
		queryParams.put("refundAmount", refundAmount);
		queryParams.put("status", status);
		return super.update("updateRefundAmountAndStatus", queryParams);
	}

	@Override
	public List<TradeOrderDetailDTO> getTradeOrderDetail(Map<String, String> prameters) {
		List<TradeOrderDetailDTO> list=(List<TradeOrderDetailDTO>) super.findByCriteria("getTradeOrderDetail", prameters);
		return list;
	}

	@Override
	public List<AutoTradeOrderDTO> queryAutoTradeOrder(
			AutoTradeOrderDTO tradeOrder,Page page) {
		return super.findByCriteria("queryAutoTradeOrder", tradeOrder, page);
	}

	@Override
	public TradeOrderDetailMpsDTO getTradeOrderDetailMps(TradeOrderDetailMpsDTO detailMpsDTO) {
		return (TradeOrderDetailMpsDTO) super.findObjectByCriteria("getTradeOrderDetailMps", detailMpsDTO);
	}

	@Override
	public void createAutoTranRela(AutoTranRela autoTranRela) {
		 this.create("createAutoTranRela", autoTranRela);
	}
	
	@Override
	public List<PayLinkDetailDTO> getPayLinkDetail(Map<String, String> prameters) {
		List<PayLinkDetailDTO> list=(List<PayLinkDetailDTO>) super.findByCriteria("getPayLinkDetail", prameters);
		return list;
	}
	
	@Override
	public List<PayLinkTemplateDTO> payLinkTemplateDownload(
			Map<String, String> prameters) {
		return (List<PayLinkTemplateDTO>) super.findByCriteria("payLinkTemplateDownload", prameters);
	}
}