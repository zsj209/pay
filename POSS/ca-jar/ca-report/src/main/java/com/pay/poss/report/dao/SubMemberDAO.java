/**
 *
 * auto generated by ibatis tools 
 *
 **/
package com.pay.poss.report.dao;

import java.util.Map;

import com.pay.inf.dao.BaseDAO;
import com.pay.inf.dao.Page;
import com.pay.poss.report.dto.SubMemberDTO;

public interface SubMemberDAO extends BaseDAO<SubMemberDTO> {
	/**
	 * 查询商户
	 * 
	 * @param page
	 * @param map
	 * @return
	 */
	public Page<SubMemberDTO> querySubMember(Page<SubMemberDTO> page,
			Map<String, Object> map);

	/**
	 * 根据父memberCode查找商户信息
	 * 
	 * @param id
	 * @return
	 */
	public SubMemberDTO findByMemberCode(Long memberCode);

	/**
	 * 根据parentId删除商户信息
	 * 
	 * @param parentId
	 * @return
	 */
	public void deleteByParentId(Long parentId);
}