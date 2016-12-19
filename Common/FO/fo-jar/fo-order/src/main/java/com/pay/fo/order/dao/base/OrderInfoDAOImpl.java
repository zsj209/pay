package com.pay.fo.order.dao.base;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.pay.fo.order.model.base.OrderInfo;
import com.pay.fo.order.model.base.OrderInfoExample;

public class OrderInfoDAOImpl extends SqlMapClientDaoSupport implements OrderInfoDAO {

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table FO.ORDER_INFO
     *
     * @abatorgenerated Tue Jul 19 16:04:00 CST 2011
     */
    public OrderInfoDAOImpl() {
        super();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table FO.ORDER_INFO
     *
     * @abatorgenerated Tue Jul 19 16:04:00 CST 2011
     */
    public void insert(OrderInfo record) {
        getSqlMapClientTemplate().insert("FO_ORDER_INFO.abatorgenerated_insert", record);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table FO.ORDER_INFO
     *
     * @abatorgenerated Tue Jul 19 16:04:00 CST 2011
     */
    public int updateByPrimaryKey(OrderInfo record) {
        int rows = getSqlMapClientTemplate().update("FO_ORDER_INFO.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table FO.ORDER_INFO
     *
     * @abatorgenerated Tue Jul 19 16:04:00 CST 2011
     */
    public int updateByPrimaryKeySelective(OrderInfo record) {
        int rows = getSqlMapClientTemplate().update("FO_ORDER_INFO.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table FO.ORDER_INFO
     *
     * @abatorgenerated Tue Jul 19 16:04:00 CST 2011
     */
    public List selectByExample(OrderInfoExample example) {
        List list = getSqlMapClientTemplate().queryForList("FO_ORDER_INFO.abatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table FO.ORDER_INFO
     *
     * @abatorgenerated Tue Jul 19 16:04:00 CST 2011
     */
    public OrderInfo selectByPrimaryKey(Long orderId) {
        OrderInfo key = new OrderInfo();
        key.setOrderId(orderId);
        OrderInfo record = (OrderInfo) getSqlMapClientTemplate().queryForObject("FO_ORDER_INFO.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table FO.ORDER_INFO
     *
     * @abatorgenerated Tue Jul 19 16:04:00 CST 2011
     */
    public int deleteByExample(OrderInfoExample example) {
        int rows = getSqlMapClientTemplate().delete("FO_ORDER_INFO.abatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table FO.ORDER_INFO
     *
     * @abatorgenerated Tue Jul 19 16:04:00 CST 2011
     */
    public int deleteByPrimaryKey(Long orderId) {
        OrderInfo key = new OrderInfo();
        key.setOrderId(orderId);
        int rows = getSqlMapClientTemplate().delete("FO_ORDER_INFO.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table FO.ORDER_INFO
     *
     * @abatorgenerated Tue Jul 19 16:04:00 CST 2011
     */
    public int countByExample(OrderInfoExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("FO_ORDER_INFO.abatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table FO.ORDER_INFO
     *
     * @abatorgenerated Tue Jul 19 16:04:00 CST 2011
     */
    public int updateByExampleSelective(OrderInfo record, OrderInfoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("FO_ORDER_INFO.abatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table FO.ORDER_INFO
     *
     * @abatorgenerated Tue Jul 19 16:04:00 CST 2011
     */
    public int updateByExample(OrderInfo record, OrderInfoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("FO_ORDER_INFO.abatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This class was generated by Abator for iBATIS.
     * This class corresponds to the database table FO.ORDER_INFO
     *
     * @abatorgenerated Tue Jul 19 16:04:00 CST 2011
     */
    private static class UpdateByExampleParms extends OrderInfoExample {
        private Object record;

        public UpdateByExampleParms(Object record, OrderInfoExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}