package com.pay.txncore.crosspay.dao.impl;


import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pay.inf.dao.impl.BaseDAOImpl;
import com.pay.txncore.crosspay.dao.TransactionRateDAO;
import com.pay.txncore.model.TransactionRate;
import com.pay.util.StringUtil;

public class TransactionRateDAOImpl extends
		BaseDAOImpl<TransactionRate> implements TransactionRateDAO {

	@Override
	public TransactionRate findCurrentCurrencyRate(String sourceCurrency,
			String targetCurrency, String status, String memberCode,Date currentDate) {

		Map<String,Object> paraMap = new HashMap<String,Object>();
		paraMap.put("sourceCurrency", sourceCurrency);
		paraMap.put("targetCurrency", targetCurrency);
		paraMap.put("memberCode", memberCode);
		
		if(currentDate!=null){
			Calendar c = Calendar.getInstance();
			c.setTime(currentDate);
            c.add(Calendar.DAY_OF_MONTH,-30);
            
		    Date effectDate = c.getTime();
		    paraMap.put("effectDate", effectDate);

		    paraMap.put("expireDate",currentDate);
		}
		
		if(!StringUtil.isEmpty(status)){
			paraMap.put("status", status);
		}
		
		List<TransactionRate> list = super.findByCriteria(
				"findCurrentCurrencyRate", paraMap);
		if (null != list && !list.isEmpty()) {
			return list.get(0);
		} else {
			return null;
		}
	}
	
	@Override
	public TransactionRate newFindCurrentCurrencyRate(Map<String,Object> paraMap) {
		
		if(paraMap.containsKey("currentDate")){
			Date currentDate = (Date) paraMap.get("currentDate");			
			Calendar c = Calendar.getInstance();
			c.setTime(currentDate);
            c.add(Calendar.DAY_OF_MONTH,-30);
            
		    Date effectDate = c.getTime();
		    paraMap.put("effectDate", effectDate);
		    paraMap.put("expireDate",currentDate);
		}
		
		List<TransactionRate> list = super.findByCriteria(
				"newFindCurrentCurrencyRate", paraMap);
		if(list!=null&&!list.isEmpty()){
			return list.get(0);
		}
		
		return null;
	}
	
	private Date getDate(Date date,int i){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH,i);
		
		return calendar.getTime();
	}
	
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
        c.add(Calendar.DAY_OF_MONTH,-30);
        
	    Date effectDate = c.getTime();
	    
	    System.out.println("date: "+effectDate);
	    
	}

}
