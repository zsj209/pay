/**
 *
 * auto generated by ibatis tools 
 *
 **/
package com.pay.fundout.withdraw.dao.masspaytobank;

import java.util.List;
import java.util.Map;

import com.pay.fundout.withdraw.dto.masspaytobank.MassPaytobankImportDetailDTO;
import com.pay.fundout.withdraw.model.masspaytobank.MassPaytobankImportDetail;
import com.pay.inf.dao.BaseDAO;
import com.pay.inf.exception.AppException;

public interface MassPaytobankImportDetailDAO extends
		BaseDAO<MassPaytobankImportDetail> {
	/**
	 * 得到明细列表（分页）
	 * 
	 * @param params
	 * @return
	 */
	public List getDetailInfoList(Map params);

	/**
	 * 记录总数
	 * 
	 * @param params
	 * @return
	 */
	public Integer getTotalCount(Map params);

	/**
	 * 得到明细列表
	 * 
	 * @param params
	 * @return
	 */
	public List getDetailInfoListAll(Map params);

	/**
	 * 更新是否生成子订单标志
	 * 
	 * @param detail
	 * @return
	 */
	public int updateOrderStatus(MassPaytobankImportDetailDTO detail);

	/**
	 * 批量存储上传明细
	 * 
	 * @param details
	 * @throws AppException
	 */
	public void createDetails(List<MassPaytobankImportDetail> details)
			throws AppException;
}