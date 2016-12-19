package com.pay.channel.handler.channelcurrency;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeanUtils;

import com.pay.channel.service.ChannelCurrencyService;
import com.pay.inf.enums.ResponseCodeEnum;
import com.pay.inf.excepiton.HessianInvokeException;
import com.pay.inf.handler.EventHandler;
import com.pay.util.JSonUtil;
/**
 * 渠道币种配置增
 * @author delin
 *	@date 2016年6月21日17:44:32
 */
public class ChannelCurrencyAddHandler  implements EventHandler{
	public final Log logger = LogFactory.getLog(ChannelCurrencyAddHandler.class);
	
	private ChannelCurrencyService channelCurrencyService;
	
	@Override
	public String handle(String dataMsg) throws HessianInvokeException {
		Map<String, Object> paraMap = null;
		Map resultMap = new HashMap();

		try {
			paraMap = JSonUtil.toObject(dataMsg,
					new HashMap<String, String>().getClass());
			List<Map> list=(List<Map>) paraMap.get("list");
			channelCurrencyService.addChannelCurrency(list);
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

	
	
	public void setChannelCurrencyService(
			ChannelCurrencyService channelCurrencyService) {
		this.channelCurrencyService = channelCurrencyService;
	}
}
