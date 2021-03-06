package com.pay.poss.systemmanager.service;

import java.util.List;
import java.util.Map;

import com.pay.inf.dao.Page;
import com.pay.poss.systemmanager.formbean.UserFormBean;
import com.pay.poss.systemmanager.formbean.UserRelation;
import com.pay.poss.systemmanager.model.Users;

/**
 * 用户管理接口类
 * 
 * @author wucan
 * @descript
 * @data 2010-7-22 下午04:39:55
 */
public interface IUserService {

	void saveUser(UserFormBean userFormBean) throws Exception;

	boolean updateUser(UserFormBean userFormBean) throws Exception;

	boolean deleteUser(String id);

	List<UserFormBean> queryAll(Map<String, String> map);

	Map queryAllDutyAndOrg();

	UserFormBean queryUserByKy(String id);

	public boolean changePassword(String currentPassword, String newPassword);

	public Page<UserFormBean> search(Page<UserFormBean> page,
			Map<String, String> map);

	/**
	 * 有权限处理指定流程和节点的用户列表
	 * 
	 * @param wokeFlowName
	 *            工作流名称（必选）
	 * @param nodeName
	 *            节点名称（可选）
	 * @return 用户登录名称 列表
	 * @author 戴德荣
	 */
	// public List<String> findLoginIdByFlowName(String wokeFlowName,String
	// nodeName);

	/**
	 * 有权限处理指定流程和节点的用户列表
	 * 
	 * @param wokeFlowName
	 *            工作流名称（必选）
	 * @return 用户登录名称 列表
	 * @author 戴德荣
	 */
	// public List<String> findLoginIdByFlowName(String wokeFlowName);

	/**
	 *　通过登录名查找用户
	 * 
	 * @param loginId
	 * @return 　Users／null
	 * @date 2010-11-30
	 */
	public Users findUserByLoginId(String loginId);

	/**
	 * 通过id得到用户
	 * 
	 * @param 登录名称
	 * @return Users
	 * @date 2010-11-30
	 * @author 戴德荣
	 */
	Users findUserById(String id);

	/**
	 * 得到所有的用户
	 * 
	 * @return Users
	 * @date 2011-1-6
	 * @author 戴德荣
	 */
	List<Users> findAllUsers();
	/***
	 * 获取BD所有的登入名称
	 * @return
	 */
	List getBDName();
	/***
	 * 增加BD
	 * @param userR
	 */
	void saveUserRelation(UserRelation userR);
	/***
	 * 修改BD
	 * @param userR
	 */
	void updateUserRelation(UserRelation userR);
	/**
	 * 获取leader
	 * @return
	 */
	UserRelation getLeader();
	/***
	 * 通过登入用户名查询
	 * @param getpLoginId
	 * @return
	 */
	UserRelation findUserRelation(String loginId);

	List<UserRelation> findByLayer(Long id);
	/***
	 *把leader当作id查询UserRelation
	 * @param layer
	 * @return
	 */
	UserRelation findUseRelationById(String layer);

}
