/**
 *
 * auto generated by ibatis tools 
 *
 **/
package com.pay.fundout.withdraw.dao.withdrawtype;

import java.util.List;
import java.util.Map;

import com.pay.fundout.withdraw.dto.type.WithdrawTypeDTO;
import com.pay.inf.dao.BaseDAO;

@SuppressWarnings("hiding")
public interface WithdrawTypeDAO extends BaseDAO {
	public List<WithdrawTypeDTO> searchTypes(Map<String, String> map);
}