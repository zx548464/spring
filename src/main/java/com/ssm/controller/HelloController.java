package com.ssm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @author ZYB
 * @date 2020.5.17
 * @serial
 * 
 */

public class HelloController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("HelloController.handleReuest()");
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "SpringMVC");
		mv.setViewName("/index.jsp");
		return mv;
	}

}
