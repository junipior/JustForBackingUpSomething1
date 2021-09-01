package com.mycompany.webapp.context;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoaderListener implements ServletContextListener{
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// WebApplication이 배치될 때 자동으로 실행
		System.out.println("contextInitialized 실행");
		String contextConfigLocation = 
				sce.getServletContext().getInitParameter("contextConfigLocation");
		System.out.println(contextConfigLocation);
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// WebApplication이 배치해제될 때 자동으로 실행
		System.out.println("contextDestroyed 실행");
	}
}
