/**
 * 
 */
package com.pay.gateway.commons;

/**
 * @author chaoyue
 *
 */
public enum BusinessType {

	ACQUIRE("0001","下单"),
	REFUND("0002","退款"),
	QUERY("0003","查询"),
	RECON("0004","对账"),
	PREAUTHCOMP("0005","预授权完成"),
	PREAUTH("0006","预授权"),
	RECURRING("0007","循环扣款")
	;
	
	private String type;
	private String desc;
	
	private BusinessType(String type,String desc){
		this.type = type;
		this.desc = desc;
	}

	public String getType() {
		return type;
	}

	public String getDesc() {
		return desc;
	}
	
}
