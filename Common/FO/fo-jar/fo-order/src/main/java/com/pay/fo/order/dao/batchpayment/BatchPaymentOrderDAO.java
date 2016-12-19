package com.pay.fo.order.dao.batchpayment;

import java.util.List;

import com.pay.fo.order.model.base.FundoutOrder;
import com.pay.fo.order.model.base.PayToAcctOrder;
import com.pay.fo.order.model.batchpayment.BatchPaymentOrder;
import com.pay.fo.order.model.batchpayment.BatchPaymentOrderExample;
import com.pay.fo.order.model.batchpayment.BatchPaymentTotalInfo;

public interface BatchPaymentOrderDAO {
    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table FO.BATCH_PAYMENTORDER
     *
     * @abatorgenerated Thu Jun 16 10:55:44 CST 2011
     */
    Long insert(BatchPaymentOrder record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table FO.BATCH_PAYMENTORDER
     *
     * @abatorgenerated Thu Jun 16 10:55:44 CST 2011
     */
    int updateByPrimaryKey(BatchPaymentOrder record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table FO.BATCH_PAYMENTORDER
     *
     * @abatorgenerated Thu Jun 16 10:55:44 CST 2011
     */
    int updateByPrimaryKeySelective(BatchPaymentOrder record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table FO.BATCH_PAYMENTORDER
     *
     * @abatorgenerated Thu Jun 16 10:55:44 CST 2011
     */
    List selectByExample(BatchPaymentOrderExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table FO.BATCH_PAYMENTORDER
     *
     * @abatorgenerated Thu Jun 16 10:55:44 CST 2011
     */
    BatchPaymentOrder selectByPrimaryKey(Long orderId);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table FO.BATCH_PAYMENTORDER
     *
     * @abatorgenerated Thu Jun 16 10:55:44 CST 2011
     */
    int deleteByExample(BatchPaymentOrderExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table FO.BATCH_PAYMENTORDER
     *
     * @abatorgenerated Thu Jun 16 10:55:44 CST 2011
     */
    int deleteByPrimaryKey(Long orderId);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table FO.BATCH_PAYMENTORDER
     *
     * @abatorgenerated Thu Jun 16 10:55:44 CST 2011
     */
    int countByExample(BatchPaymentOrderExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table FO.BATCH_PAYMENTORDER
     *
     * @abatorgenerated Thu Jun 16 10:55:44 CST 2011
     */
    int updateByExampleSelective(BatchPaymentOrder record, BatchPaymentOrderExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table FO.BATCH_PAYMENTORDER
     *
     * @abatorgenerated Thu Jun 16 10:55:44 CST 2011
     */
    int updateByExample(BatchPaymentOrder record, BatchPaymentOrderExample example);
    
    /**
     * 获取处理完成的批付到账户的订单信息
     * @return
     */
    List getCompleteBatchPay2AcctOrders();
    
    /**
     * 获取处理完成的批付到银行的订单信息
     * @return
     */
    List getCompleteBatchPay2BankOrders();
    
    /**
     * 根据总订单号获取指定批量付款到银行订单的完成统计信息
     * @param parentOrderId
     * @return
     */
    BatchPaymentTotalInfo getTotalComplateBatchPay2BankOrder(Long parentOrderId);
    
    /**
     * 根据总订单号获取指定批量付款到账户订单的完成统计信息
     * @param parentOrderId
     * @return
     */
    BatchPaymentTotalInfo getTotalComplateBatchPay2AcctOrder(Long parentOrderId);
    
    /**
	 * 根据总订单号获取到账户子订单
	 * @param parentId
	 * @return
	 */
	List<PayToAcctOrder> getAcctDetailOrderByParentId(final Long parentId);
	
	/**
	 * 根据总订单号获取到银行子订单
	 * @param parentId
	 * @return
	 */
	List<FundoutOrder> getBankDetailOrderByParentId(final Long parentId);
}