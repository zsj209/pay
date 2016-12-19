/**
 *
 * auto generated by ibatis tools 
 *
 **/
package com.pay.fundout.withdraw.dao.masspaytobank.impl;

import java.util.List;
import java.util.Map;

import com.pay.fundout.withdraw.dao.masspaytobank.MassPaytobankImportDetailDAO;
import com.pay.fundout.withdraw.dto.masspaytobank.MassPaytobankImportDetailDTO;
import com.pay.fundout.withdraw.model.masspaytobank.MassPaytobankImportDetail;
import com.pay.inf.dao.impl.BaseDAOImpl;
import com.pay.inf.exception.AppException;

@SuppressWarnings("unchecked")
public class MassPaytobankImportDetailDAOImpl extends
		BaseDAOImpl<MassPaytobankImportDetail> implements
		MassPaytobankImportDetailDAO {

	@Override
	public List getDetailInfoList(Map params) {

		return getSqlMapClientTemplate().queryForList(
				namespace.concat("getDetailInfoList"), params);
	}

	@Override
	public Integer getTotalCount(Map params) {
		return (Integer) getSqlMapClientTemplate().queryForObject(
				namespace.concat("getTotalCount"), params);
	}

	@Override
	public List getDetailInfoListAll(Map params) {
		return getSqlMapClientTemplate().queryForList(
				namespace.concat("getDetailInfoListAll"), params);
	}

	@Override
	public int updateOrderStatus(MassPaytobankImportDetailDTO detail) {
		return getSqlMapClientTemplate().update(
				namespace.concat("updateOrderStatus"), detail);
	}

	@Override
	public void createDetails(List<MassPaytobankImportDetail> details)
			throws AppException {
		try {
			getSqlMapClient().startBatch();
			for (MassPaytobankImportDetail model : details) {
				getSqlMapClient().insert(namespace.concat("create"), model);
			}
			getSqlMapClient().executeBatch();
		} catch (Throwable e) {
			throw new AppException(e);
		}

	}
}