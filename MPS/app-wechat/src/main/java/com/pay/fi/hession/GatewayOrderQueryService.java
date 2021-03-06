/**
 * 
 */
package com.pay.fi.hession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pay.base.fi.model.TradeOrder;
import com.pay.fi.dto.OrderQueryResultDetail;
import com.pay.fi.dto.QueryDetail;
import com.pay.fi.dto.QueryDetailPara;
import com.pay.fi.dto.ReconcileOrder;
import com.pay.fi.dto.RefundOrderQueryResultDetail;
import com.pay.fi.dto.TradeOrderCount;
import com.pay.inf.enums.SerCode;
import com.pay.inf.enums.SystemCodeEnum;
import com.pay.inf.params.HessianInvokeParam;
import com.pay.inf.service.HessianInvokeService;
import com.pay.inf.service.SysTraceNoService;
import com.pay.inf.utils.HessianInvokeHelper;
import com.pay.util.JSonUtil;
import com.pay.util.MapUtil;

/**
 * @author chaoyue
 *
 */
public class GatewayOrderQueryService {

	private HessianInvokeService invokeService;

	public void setInvokeService(HessianInvokeService invokeService) {
		this.invokeService = invokeService;
	}

	/**
	 * 查询网关订单
	 * 
	 * @param paraMap
	 * @return
	 */
	public Map queryTradeOrder(Map<String, String> paraMap) {

		String reqMsg = JSonUtil.toJSonString(paraMap);
		HessianInvokeParam param = HessianInvokeHelper.processRequest(reqMsg);
		String sysTraceNo = SysTraceNoService
				.generateSysTraceNo(SystemCodeEnum.WEBSITE.getCode());
		String result = invokeService.invoke(
				SerCode.TXNCORE_TRADEORDER_QUERY.getCode(), sysTraceNo,
				SystemCodeEnum.WEBSITE.getCode(),
				SystemCodeEnum.TXNCORE.getCode(),
				SystemCodeEnum.TXNCORE.getVersion(), param.getDataLength(),
				param.getMsgCompress(), param.getDataMsg());

		param.parse(result);
		HessianInvokeHelper.processResponse(param);
		result = param.getDataMsg();

		Map resultMap = JSonUtil.toObject(result, new HashMap().getClass());

		return resultMap;
	}

	/**
	 * 查询支付订单
	 * 
	 * @param paraMap
	 * @return
	 */
	public Map queryPaymentOrder(Map<String, String> paraMap) {

		String reqMsg = JSonUtil.toJSonString(paraMap);
		HessianInvokeParam param = HessianInvokeHelper.processRequest(reqMsg);
		String sysTraceNo = SysTraceNoService
				.generateSysTraceNo(SystemCodeEnum.WEBSITE.getCode());
		String result = invokeService.invoke(
				SerCode.TXNCORE_PAYMENTORDER_QUERY.getCode(), sysTraceNo,
				SystemCodeEnum.WEBSITE.getCode(),
				SystemCodeEnum.TXNCORE.getCode(),
				SystemCodeEnum.TXNCORE.getVersion(), param.getDataLength(),
				param.getMsgCompress(), param.getDataMsg());

		param.parse(result);
		HessianInvokeHelper.processResponse(param);
		result = param.getDataMsg();

		Map resultMap = JSonUtil.toObject(result, new HashMap().getClass());

		return resultMap;
	}

	/**
	 * 
	 * @param queryDetailPara
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	public List<QueryDetail> queryIncomeDetailList(
			QueryDetailPara queryDetailPara, Integer pageNo, Integer pageSize) {

		Map paraMap = MapUtil.bean2map(queryDetailPara);
		paraMap.put("pageNo", pageNo);
		paraMap.put("pageSize", pageSize);

		String reqMsg = JSonUtil.toJSonString(paraMap);
		HessianInvokeParam param = HessianInvokeHelper.processRequest(reqMsg);
		String sysTraceNo = SysTraceNoService
				.generateSysTraceNo(SystemCodeEnum.WEBSITE.getCode());
		String result = invokeService.invoke(
				SerCode.TXNCORE_INCOMEDETAIL_QUERY.getCode(), sysTraceNo,
				SystemCodeEnum.WEBSITE.getCode(),
				SystemCodeEnum.TXNCORE.getCode(),
				SystemCodeEnum.TXNCORE.getVersion(), param.getDataLength(),
				param.getMsgCompress(), param.getDataMsg());

		param.parse(result);
		HessianInvokeHelper.processResponse(param);
		result = param.getDataMsg();

		Map resultMap = JSonUtil.toObject(result, new HashMap().getClass());

		List<Map> listMap = (List<Map>) resultMap.get("list");
		List<QueryDetail> resultList = MapUtil.map2List(QueryDetail.class,
				listMap);

		return resultList;
	}
	
	/**
	 * 统计商户各个币种的交易情况
	 * @param queryDetailPara
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	public List<TradeOrderCount> queryTradeOrderCount(
			QueryDetailPara queryDetailPara) {

		Map paraMap = MapUtil.bean2map(queryDetailPara);

		String reqMsg = JSonUtil.toJSonString(paraMap);
		HessianInvokeParam param = HessianInvokeHelper.processRequest(reqMsg);
		String sysTraceNo = SysTraceNoService
				.generateSysTraceNo(SystemCodeEnum.WEBSITE.getCode());
		String result = invokeService.invoke(
				SerCode.TXNCORE_TRADE_ORDER_COUT.getCode(), sysTraceNo,
				SystemCodeEnum.WEBSITE.getCode(),
				SystemCodeEnum.TXNCORE.getCode(),
				SystemCodeEnum.TXNCORE.getVersion(), param.getDataLength(),
				param.getMsgCompress(), param.getDataMsg());

		param.parse(result);
		HessianInvokeHelper.processResponse(param);
		result = param.getDataMsg();

		Map resultMap = JSonUtil.toObject(result, new HashMap().getClass());

		List<Map> listMap = (List<Map>) resultMap.get("list");
		List<TradeOrderCount> resultList = MapUtil.map2List(TradeOrderCount.class,
				listMap);

		return resultList;
	}

	public Map<String, Object> countRefundOrderList(
			QueryDetailPara queryDetailPara) {

		Map paraMap = MapUtil.bean2map(queryDetailPara);

		String reqMsg = JSonUtil.toJSonString(paraMap);
		HessianInvokeParam param = HessianInvokeHelper.processRequest(reqMsg);
		String sysTraceNo = SysTraceNoService
				.generateSysTraceNo(SystemCodeEnum.WEBSITE.getCode());
		String result = invokeService.invoke(
				SerCode.TXNCORE_COUNTREFUNDORDER_QUERY.getCode(), sysTraceNo,
				SystemCodeEnum.WEBSITE.getCode(),
				SystemCodeEnum.TXNCORE.getCode(),
				SystemCodeEnum.TXNCORE.getVersion(), param.getDataLength(),
				param.getMsgCompress(), param.getDataMsg());

		param.parse(result);
		HessianInvokeHelper.processResponse(param);
		result = param.getDataMsg();

		Map resultMap = JSonUtil.toObject(result, new HashMap().getClass());

		return resultMap;
	}

	public Map<String, Object> querySingleIncomeDetail(Map<String, Object> map) {

		String reqMsg = JSonUtil.toJSonString(map);
		HessianInvokeParam param = HessianInvokeHelper.processRequest(reqMsg);
		String sysTraceNo = SysTraceNoService
				.generateSysTraceNo(SystemCodeEnum.WEBSITE.getCode());
		String result = invokeService.invoke(
				SerCode.TXNCORE_SINGLEINCOMEDETAIL_QUERY.getCode(), sysTraceNo,
				SystemCodeEnum.WEBSITE.getCode(),
				SystemCodeEnum.TXNCORE.getCode(),
				SystemCodeEnum.TXNCORE.getVersion(), param.getDataLength(),
				param.getMsgCompress(), param.getDataMsg());

		param.parse(result);
		HessianInvokeHelper.processResponse(param);
		result = param.getDataMsg();

		Map resultMap = JSonUtil.toObject(result, new HashMap().getClass());

		return resultMap;
	}

	public List<OrderQueryResultDetail> queryTradeUnionPayment(
			Map<String, Object> map) {

		String reqMsg = JSonUtil.toJSonString(map);
		HessianInvokeParam param = HessianInvokeHelper.processRequest(reqMsg);
		String sysTraceNo = SysTraceNoService
				.generateSysTraceNo(SystemCodeEnum.WEBSITE.getCode());
		String result = invokeService.invoke(
				SerCode.TXNCORE_QUERYTRADEUNIONPAYMENT_QUERY.getCode(),
				sysTraceNo, SystemCodeEnum.WEBSITE.getCode(),
				SystemCodeEnum.TXNCORE.getCode(),
				SystemCodeEnum.TXNCORE.getVersion(), param.getDataLength(),
				param.getMsgCompress(), param.getDataMsg());

		param.parse(result);
		HessianInvokeHelper.processResponse(param);
		result = param.getDataMsg();

		Map resultMap = JSonUtil.toObject(result, new HashMap().getClass());

		List<Map> listMap = (List<Map>) resultMap.get("list");

		return MapUtil.map2List(OrderQueryResultDetail.class, listMap);
	}

	public List<RefundOrderQueryResultDetail> queryTradeUnionRefund(
			Map<String, Object> map) {

		String reqMsg = JSonUtil.toJSonString(map);
		HessianInvokeParam param = HessianInvokeHelper.processRequest(reqMsg);
		String sysTraceNo = SysTraceNoService
				.generateSysTraceNo(SystemCodeEnum.WEBSITE.getCode());
		String result = invokeService.invoke(
				SerCode.TXNCORE_QUERYTRADEUNIONREFUND_QUERY.getCode(),
				sysTraceNo, SystemCodeEnum.WEBSITE.getCode(),
				SystemCodeEnum.TXNCORE.getCode(),
				SystemCodeEnum.TXNCORE.getVersion(), param.getDataLength(),
				param.getMsgCompress(), param.getDataMsg());

		param.parse(result);
		HessianInvokeHelper.processResponse(param);
		result = param.getDataMsg();

		Map resultMap = JSonUtil.toObject(result, new HashMap().getClass());

		List<Map> listMap = (List<Map>) resultMap.get("list");

		return MapUtil.map2List(RefundOrderQueryResultDetail.class, listMap);
	}

	public List<OrderQueryResultDetail> queryAllTradeUnionPayment(
			Map<String, Object> map) {

		String reqMsg = JSonUtil.toJSonString(map);
		HessianInvokeParam param = HessianInvokeHelper.processRequest(reqMsg);
		String sysTraceNo = SysTraceNoService
				.generateSysTraceNo(SystemCodeEnum.WEBSITE.getCode());
		String result = invokeService.invoke(
				SerCode.TXNCORE_QUERYALLTRADEUNIONPAYMENT_QUERY.getCode(),
				sysTraceNo, SystemCodeEnum.WEBSITE.getCode(),
				SystemCodeEnum.TXNCORE.getCode(),
				SystemCodeEnum.TXNCORE.getVersion(), param.getDataLength(),
				param.getMsgCompress(), param.getDataMsg());

		param.parse(result);
		HessianInvokeHelper.processResponse(param);
		result = param.getDataMsg();

		Map resultMap = JSonUtil.toObject(result, new HashMap().getClass());

		List<Map> listMap = (List<Map>) resultMap.get("list");

		return MapUtil.map2List(OrderQueryResultDetail.class, listMap);
	}

	public List<RefundOrderQueryResultDetail> queryAllTradeUnionRefund(
			Map<String, Object> map) {

		String reqMsg = JSonUtil.toJSonString(map);
		HessianInvokeParam param = HessianInvokeHelper.processRequest(reqMsg);
		String sysTraceNo = SysTraceNoService
				.generateSysTraceNo(SystemCodeEnum.WEBSITE.getCode());
		String result = invokeService.invoke(
				SerCode.TXNCORE_QUERYALLTRADEUNIONREFUND_QUERY.getCode(),
				sysTraceNo, SystemCodeEnum.WEBSITE.getCode(),
				SystemCodeEnum.TXNCORE.getCode(),
				SystemCodeEnum.TXNCORE.getVersion(), param.getDataLength(),
				param.getMsgCompress(), param.getDataMsg());

		param.parse(result);
		HessianInvokeHelper.processResponse(param);
		result = param.getDataMsg();

		Map resultMap = JSonUtil.toObject(result, new HashMap().getClass());

		List<Map> listMap = (List<Map>) resultMap.get("list");

		return MapUtil.map2List(RefundOrderQueryResultDetail.class, listMap);
	}

	public TradeOrder findByOrderInfo(Map<String, Object> map) {

		String reqMsg = JSonUtil.toJSonString(map);
		HessianInvokeParam param = HessianInvokeHelper.processRequest(reqMsg);
		String sysTraceNo = SysTraceNoService
				.generateSysTraceNo(SystemCodeEnum.WEBSITE.getCode());
		String result = invokeService.invoke(
				SerCode.TXNCORE_FINDBYORDERINFO_QUERY.getCode(), sysTraceNo,
				SystemCodeEnum.WEBSITE.getCode(),
				SystemCodeEnum.TXNCORE.getCode(),
				SystemCodeEnum.TXNCORE.getVersion(), param.getDataLength(),
				param.getMsgCompress(), param.getDataMsg());

		param.parse(result);
		HessianInvokeHelper.processResponse(param);
		result = param.getDataMsg();

		Map resultMap = JSonUtil.toObject(result, new HashMap().getClass());

		return MapUtil.map2Object(TradeOrder.class, resultMap);
	}

	public List<TradeOrder> findByOrderListInfo(Map<String, Object> map) {

		String reqMsg = JSonUtil.toJSonString(map);
		HessianInvokeParam param = HessianInvokeHelper.processRequest(reqMsg);
		String sysTraceNo = SysTraceNoService
				.generateSysTraceNo(SystemCodeEnum.WEBSITE.getCode());
		String result = invokeService.invoke(
				SerCode.TXNCORE_FINDBYORDERLISTINFO_QUERY.getCode(),
				sysTraceNo, SystemCodeEnum.WEBSITE.getCode(),
				SystemCodeEnum.TXNCORE.getCode(),
				SystemCodeEnum.TXNCORE.getVersion(), param.getDataLength(),
				param.getMsgCompress(), param.getDataMsg());

		param.parse(result);
		HessianInvokeHelper.processResponse(param);
		result = param.getDataMsg();

		Map resultMap = JSonUtil.toObject(result, new HashMap().getClass());

		List<Map> listMap = (List<Map>) resultMap.get("list");

		return MapUtil.map2List(TradeOrder.class, listMap);
	}

	public List<ReconcileOrder> queryReconcileOrder(Map<String, Object> map) {

		String reqMsg = JSonUtil.toJSonString(map);
		HessianInvokeParam param = HessianInvokeHelper.processRequest(reqMsg);
		String sysTraceNo = SysTraceNoService
				.generateSysTraceNo(SystemCodeEnum.WEBSITE.getCode());
		String result = invokeService.invoke(
				SerCode.TXNCORE_QUERYRECONCILEORDER_QUERY.getCode(),
				sysTraceNo, SystemCodeEnum.WEBSITE.getCode(),
				SystemCodeEnum.TXNCORE.getCode(),
				SystemCodeEnum.TXNCORE.getVersion(), param.getDataLength(),
				param.getMsgCompress(), param.getDataMsg());

		param.parse(result);
		HessianInvokeHelper.processResponse(param);
		result = param.getDataMsg();

		Map resultMap = JSonUtil.toObject(result, new HashMap().getClass());

		List<Map> listMap = (List<Map>) resultMap.get("list");

		return MapUtil.map2List(ReconcileOrder.class, listMap);
	}
}
