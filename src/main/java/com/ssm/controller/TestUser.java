package com.ssm.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssm.entity.Usera;

/**
 * @author ZYB
 * @date ����ʱ�䣺2020��5��10��
 * @serial
 * 
 */
public class TestUser {
	public static void main(String[] args) {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("Context.xml");
//		Usera user = (Usera) cxt.getBean("user");
		Usera user = (Usera) cxt.getBean("testp");
		user.print();
	}
}
