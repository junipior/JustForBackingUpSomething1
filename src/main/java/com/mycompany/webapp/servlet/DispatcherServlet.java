package com.mycompany.webapp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycompany.webapp.controller.Ch01Controller;
import com.mycompany.webapp.controller.Ch02Controller;
import com.mycompany.webapp.controller.Ch03Controller;

public class DispatcherServlet extends HttpServlet {

	public DispatcherServlet() {
		System.out.println("DispatcherServlet 객체 생성");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("DispatcherServlet 초기화");
		String contextConfigLocation = config.getInitParameter("contextConfigLocation");
		System.out.println("contextConfigLocation: " + contextConfigLocation);

	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service() 실행");
		String viewName = "redirect:/";
		
		//요청 경로별로 컨트롤러를 선택해서 실행
		String requestUri = request.getRequestURI();
		if(requestUri.startsWith("/ch01")) {
			Ch01Controller ctrl = new Ch01Controller();
			viewName = ctrl.exec(request, response);
		} else if(requestUri.startsWith("/ch02")) {
			Ch02Controller ctrl = new Ch02Controller();
			viewName = ctrl.exec(request, response);
		} else if(requestUri.startsWith("/ch03")) {
			Ch03Controller ctrl = new Ch03Controller();
			viewName = ctrl.exec(request, response);
		}
		
		//뷰 이름을 해석해서 리다이렉트할건지 포워드할건지를 결정 (ViewResolver)
		if(viewName.startsWith("redirect:")) {
			//리다이렉트
			String uri = viewName.split(":")[1];
			response.sendRedirect(uri);
		} else {
			//포워드
			String prefix = "/WEB-INF/views/";
			String suffix = ".jsp";
			String jspPath = prefix + viewName + suffix;
			RequestDispatcher rd = request.getRequestDispatcher(jspPath);
			rd.forward(request, response);
		}
	}
}
