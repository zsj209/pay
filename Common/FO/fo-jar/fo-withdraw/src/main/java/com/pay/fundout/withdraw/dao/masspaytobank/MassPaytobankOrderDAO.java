/**
 *
 * auto generated by ibatis tools 
 *
 **/
package com.pay.fundout.withdraw.dao.masspaytobank;

import java.util.List;

import com.pay.fundout.withdraw.model.masspaytobank.MassPaytobankOrder;
import com.pay.fundout.withdraw.model.masspaytobank.MassPaytobankOrderTotalInfo;
import com.pay.inf.dao.BaseDAO;

public interface MassPaytobankOrderDAO extends BaseDAO<MassPaytobankOrder> {

	/**
	 * 获取完成的批量付款到银行订单信息
	 * 
	 * @param status
	 */
	List<MassPaytobankOrder> getCompleteMassPaytobankOrder();

	/**
	 * 统计完成的批量订单付款到银行的信息
	 * 
	 * @param massOrderSeq
	 * @return
	 */
	MassPaytobankOrderTotalInfo totalComplateMassPaytobankOrderInfo(
			Long massOrderSeq);
}