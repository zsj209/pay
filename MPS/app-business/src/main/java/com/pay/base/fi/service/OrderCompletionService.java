/**
 * 
 */
package com.pay.base.fi.service;

import java.util.Map;

import com.pay.base.fi.model.CustomizationParam;

/**
 * 系统补单Service
 * @author PengJiangbo
 *
 */
public interface OrderCompletionService {

	/**
	 * 定制化参数设定
	 * @param customizationParam
	 * @return
	 */
	public long insertCustomizationParam(CustomizationParam customizationParam) ;
	
	/**
	 * 查询最新一条customization_param记录
	 * @return
	 */
	public CustomizationParam findCustomizationParam() ;
	
	/**
	 * 修改
	 * @param id
	 * @return
	 */
	public int updateCustomizationParam(Map<String, Object> map) ;
}
