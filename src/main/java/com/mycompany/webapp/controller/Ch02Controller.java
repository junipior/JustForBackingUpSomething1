package com.mycompany.webapp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ch02Controller {
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Ch02Controller-exec()");
		return "redirect:/";
	}
}
