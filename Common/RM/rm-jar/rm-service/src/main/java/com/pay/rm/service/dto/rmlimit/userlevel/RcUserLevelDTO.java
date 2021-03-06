package com.pay.rm.service.dto.rmlimit.userlevel;

import com.pay.inf.model.BaseObject;

/**
 * RC_USER_LEVEL 用户等级
 */
public class RcUserLevelDTO extends BaseObject {

	private static final long serialVersionUID = 2084627528330754205L;
	private Integer status;
	private Integer userLevel;
	private String levelName;

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getUserLevel() {
		return userLevel;
	}

	public void setUserLevel(Integer userLevel) {
		this.userLevel = userLevel;
	}

	public String getLevelName() {
		return levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

}