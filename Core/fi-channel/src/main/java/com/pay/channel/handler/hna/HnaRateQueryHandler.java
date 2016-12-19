package com.pay.channel.handler.hna;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.pay.channel.client.HandlerClientService;
import com.pay.channel.dao.ChannelConfigDAO;
import com.pay.channel.dao.impl.ChannelConfigDAOImpl;
import com.pay.channel.model.ChannelConfig;
import com.pay.channel.model.PaymentChannelItem;
import com.pay.channel.service.PaymentChannelService;
import com.pay.inf.enums.ResponseCodeEnum;
import com.pay.inf.excepiton.HessianInvokeException;
import com.pay.inf.handler.EventHandler;
import com.pay.util.JSonUtil;
/**
 * 海南新生 汇率查询接口
 * @author delin
 *
 */
public class HnaRateQueryHandler implements EventHandler{

	public final Log logger = LogFactory.getLog(HnaRateQueryHandler.class);
	
	private HandlerClientService handlerClientService;
	
	private ChannelConfigDAO channelConfigDao;
	
	private PaymentChannelService paymentChannelService;
	@Override
	public String handle(String dataMsg) throws HessianInvokeException {
		Map<String, Object> paraMap = null;
		Map resultMap = new HashMap();
		try {
			paraMap = JSonUtil.toObject(dataMsg,
					new HashMap<String, String>().getClass());
			String  memberCode = String.valueOf(paraMap.get("partnerId"));
			String  currencyCode = String.valueOf(paraMap.get("currencyCode"));
			String  targetCurrencyCode = String.valueOf(paraMap.get("targetCurrencyCode"));
			String  remark = String.valueOf(paraMap.get("remark"));
		//	String  platformId = String.valueOf(paraMap.get("platformId"));
			String  orderNo = String.valueOf(paraMap.get("orderNo"));
			String orgCode="10077004"; //海南新生的orgCode
			PaymentChannelItem paymentChannelItem=new PaymentChannelItem();
			paymentChannelItem.setMemberCode(Long.valueOf(memberCode));
			paymentChannelItem.setOrgCode(orgCode);
			PaymentChannelItem item = paymentChannelService.queryPaymentChannelItemByOrgCode(orgCode, null);
			ChannelConfig channelConfig = channelConfigDao.findByMerchantCodeOrgCode(item.getOrgMerchantCode(), orgCode);
			Map<String,String> hnaParaMap=new HashMap<String, String>();
			hnaParaMap.put("orgMerchantCode", item.getOrgMerchantCode());
			hnaParaMap.put("siteId", channelConfig.getSupportWebsite());
			hnaParaMap.put("currencyCode", currencyCode);
			hnaParaMap.put("targetCurrencyCode", targetCurrencyCode);
			hnaParaMap.put("remark", remark);
			hnaParaMap.put("orderNo", orderNo);
		//	hnaParaMap.put("platformId",platformId);//位置
            Map<String, String> hnaRateQuery = handlerClientService.hnaRateQuery(item.getPreServerUrl(), hnaParaMap);
			resultMap.put("result", hnaRateQuery);
			resultMap.put("responseCode", ResponseCodeEnum.SUCCESS.getCode());
			resultMap.put("responseDesc", ResponseCodeEnum.SUCCESS.getDesc());
		} catch (Exception e) {
			logger.error("error:", e);
			resultMap.put("responseCode",
					ResponseCodeEnum.UNDEFINED_ERROR.getCode());
			resultMap.put("responseDesc",
					ResponseCodeEnum.UNDEFINED_ERROR.getDesc());
		}
		return JSonUtil.toJSonString(resultMap);
	}

	public void setHandlerClientService(HandlerClientService handlerClientService) {
		this.handlerClientService = handlerClientService;
	}

	public void setPaymentChannelService(PaymentChannelService paymentChannelService) {
		this.paymentChannelService = paymentChannelService;
	}

	public void setChannelConfigDao(ChannelConfigDAO channelConfigDao) {
		this.channelConfigDao = channelConfigDao;
	}
	
}
