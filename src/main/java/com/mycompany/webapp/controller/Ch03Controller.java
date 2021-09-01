package com.mycompany.webapp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ch03Controller {
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Ch03Controller-exec()");
		
		String param1 = request.getParameter("param1");
		String param2 = request.getParameter("param2");
		String param3 = request.getParameter("param3");
		String param4 = request.getParameter("param4");
		String param5 = request.getParameter("param5");
		
		System.out.println("param1: " + param1);
		System.out.println("param2: " + param2);
		System.out.println("param3: " + param3);
		System.out.println("param4: " + param4);
		System.out.println("param5: " + param5);
		
		
		return "ch03/content";
	}
}
