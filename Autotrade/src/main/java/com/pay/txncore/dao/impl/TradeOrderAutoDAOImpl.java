/**
 *
 * auto generated by ibatis tools 
 *
 **/
package com.pay.txncore.dao.impl;



import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.pay.artificial.trade.model.AutoTranRela;

import com.pay.txncore.dao.TradeOrderAutoDAO;


public class TradeOrderAutoDAOImpl extends  SqlMapClientDaoSupport  implements TradeOrderAutoDAO {


	@Override
	public void createAutoTranRela(AutoTranRela autoTranRela) {
		getSqlMapClientTemplate().insert("tradeOrderAuto.createAutoTranRelaauto",autoTranRela); 
		
	}

}