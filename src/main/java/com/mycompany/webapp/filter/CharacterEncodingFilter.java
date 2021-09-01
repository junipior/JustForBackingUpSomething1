package com.mycompany.webapp.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharacterEncodingFilter implements Filter {
	private String encoding;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.encoding = filterConfig.getInitParameter("encoding");
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
		throws IOException, ServletException {
		
		//전처리 -----------------------------------
		System.out.println("CharacterEncodingFilter 전처리");
		
		request.setCharacterEncoding(this.encoding);
		
		// ----------------------------------------
		
		chain.doFilter(request, response);
		
		//후처리 -----------------------------------
		System.out.println("CharacterEncodingFilter 후처리");
		//-----------------------------------------
	}
}
