package com.pay.poss.base.env.context;

import javax.servlet.ServletContextEvent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.context.ContextLoaderListener;

public class ContextStartup extends ContextLoaderListener {
	private static Log logger = LogFactory.getLog(ContextStartup.class);

	public void contextInitialized(ServletContextEvent context) {
		super.contextInitialized(context);


//		try {
//			IDataManager dataManager = contextService.getDataMgr();
//			dataManager.load();
//		} catch (Exception e) {
//			logger.error("加载系统数据出错", e);
//			throw new IllegalStateException("无法加载系统数据");
//		}
	}

	public void contextDestroyed(ServletContextEvent servlet) {
	}

}
