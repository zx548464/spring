package com.ssm.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssm.entity.Usera;

/**
 * @author ZYB
 * @date 创建时间：2020年5月10日
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
