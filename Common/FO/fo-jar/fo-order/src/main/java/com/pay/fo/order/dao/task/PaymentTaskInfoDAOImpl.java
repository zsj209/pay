package com.pay.fo.order.dao.task;

import com.pay.fo.order.model.task.PaymentTaskInfo;
import com.pay.fo.order.model.task.PaymentTaskInfoExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class PaymentTaskInfoDAOImpl extends SqlMapClientDaoSupport implements PaymentTaskInfoDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table FO.PAYMENT_TASK_INFO
     *
     * @ibatorgenerated Tue Nov 01 17:25:26 CST 2011
     */
    public PaymentTaskInfoDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table FO.PAYMENT_TASK_INFO
     *
     * @ibatorgenerated Tue Nov 01 17:25:26 CST 2011
     */
    public int countByExample(PaymentTaskInfoExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("FO_PAYMENT_TASK_INFO.ibatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table FO.PAYMENT_TASK_INFO
     *
     * @ibatorgenerated Tue Nov 01 17:25:26 CST 2011
     */
    public void insert(PaymentTaskInfo record) {
        getSqlMapClientTemplate().insert("FO_PAYMENT_TASK_INFO.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table FO.PAYMENT_TASK_INFO
     *
     * @ibatorgenerated Tue Nov 01 17:25:26 CST 2011
     */
    public void insertSelective(PaymentTaskInfo record) {
        getSqlMapClientTemplate().insert("FO_PAYMENT_TASK_INFO.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table FO.PAYMENT_TASK_INFO
     *
     * @ibatorgenerated Tue Nov 01 17:25:26 CST 2011
     */
    public List selectByExample(PaymentTaskInfoExample example) {
        List list = getSqlMapClientTemplate().queryForList("FO_PAYMENT_TASK_INFO.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table FO.PAYMENT_TASK_INFO
     *
     * @ibatorgenerated Tue Nov 01 17:25:26 CST 2011
     */
    public int updateByExampleSelective(PaymentTaskInfo record, PaymentTaskInfoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("FO_PAYMENT_TASK_INFO.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table FO.PAYMENT_TASK_INFO
     *
     * @ibatorgenerated Tue Nov 01 17:25:26 CST 2011
     */
    public int updateByExample(PaymentTaskInfo record, PaymentTaskInfoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("FO_PAYMENT_TASK_INFO.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table FO.PAYMENT_TASK_INFO
     *
     * @ibatorgenerated Tue Nov 01 17:25:26 CST 2011
     */
    private static class UpdateByExampleParms extends PaymentTaskInfoExample {
        private Object record;

        public UpdateByExampleParms(Object record, PaymentTaskInfoExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}