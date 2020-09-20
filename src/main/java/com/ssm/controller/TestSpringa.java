package com.ssm.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZYB
 * @date 创建时间：2020年5月10日
 * @serial
 * 
 */
public class TestSpringa {
	public static void main(String[] agrs) {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("Context.xml");
		Springa a = (Springa) cxt.getBean("springa");
		a.print();
	}

}
