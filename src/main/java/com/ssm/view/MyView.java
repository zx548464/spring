package com.ssm.view;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;

/**
 * @author ZYB
 * @date 创建时间：2020年5月27日
 * @serial
 * 
 */
@Component
public class MyView implements View {
	@Override
	public String getContentType() {
		return "text/html";
	}

	@Override
	public void render(Map<String, ?> arg0, HttpServletRequest arg1, HttpServletResponse arg2) throws Exception {
		arg2.getWriter().println("12321321312");

	}

}
