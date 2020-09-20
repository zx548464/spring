package com.ssm.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssm.service.UserService;

/**
 * @author ZYB
 * @date ����ʱ�䣺2020��5��10��
 * @serial
 * 
 */
public class Testlogin {

	public static void main(String[] agrs) {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("Context.xml");

		UserService userservice = (UserService) cxt.getBean("userservice");
		boolean success = userservice.login("00001", "123456");
		if (success) {
			System.out.print("Success");
		} else {
			System.out.print("fail");

		}
	}
}
