/**
 *Copyright (c) 2006-2010 pay.com,Inc. All Rights Reserved.
 *@Project_Name app-business 
 *@CreateDate 下午06:08:29 2010-11-11
 */
package com.pay.base.dao.memberaccttemplate;

import java.util.Map;


			/**
 * @author Sunny Ying
 * @description TODO
 * @version 下午06:08:29 & 2010-11-11
 */

public interface MemberAcctTemplateDAO {

	/**
	 * 查询 科目号
	 * @author Sunny Ying
	 * @param map
	 * @throw null
	 * @return String
	 */
	public String getSubjectCode(Map map);
}
