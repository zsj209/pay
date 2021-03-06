/**
 *
 * auto generated by ibatis tools 
 *
 **/
package com.pay.poss.report.dao.impl;

import java.util.List;
import java.util.Map;

import com.pay.inf.dao.Page;
import com.pay.inf.dao.impl.BaseDAOImpl;
import com.pay.poss.report.dao.MemberFlowPackageCfgDAO;
import com.pay.poss.report.dto.MemberFlowPackageCfgDTO;

@SuppressWarnings("unchecked")
public class MemberFlowPackageCfgDAOImpl extends BaseDAOImpl implements
		MemberFlowPackageCfgDAO {
	@Override
	public Page<MemberFlowPackageCfgDTO> queryMemberFlowPackageCfg(
			Page<MemberFlowPackageCfgDTO> page, Map<String, Object> map) {
		return super.findByQuery("queryMemberFlowPackageCfg",
				page, map);
	}

	@Override
	public String findByMemberCode(Long memberCode) {
		return (String) super.findObjectByCriteria(
				"queryMemberName", memberCode);
	}

	@Override
	public List<MemberFlowPackageCfgDTO> findOrderbyBegindateAsc(Long memberCode) {
		return super.findByQuery(
				"queryOrderbyBegindateAsc", memberCode);
	}

	@Override
	public List<MemberFlowPackageCfgDTO> findbyBegindate(Map paramMap) {
		return super.findByQuery("querybyBegindate",
				paramMap);
	}
}