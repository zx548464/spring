package com.ssm.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZYB
 * @date ����ʱ�䣺2020��5��10��
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
