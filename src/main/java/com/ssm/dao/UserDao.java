package com.ssm.dao;

/**
 * @author ZYB
 * @date ����ʱ�䣺2020��5��10��
 * @serial
 * 
 */
public class UserDao {
	public boolean login(String code, String pwd) {
		if (code.equals("00001") && pwd.equals("123456")) {
			return true;
		}

		return false;

	}

}
