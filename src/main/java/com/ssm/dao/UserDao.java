package com.ssm.dao;

/**
 * @author ZYB
 * @date 创建时间：2020年5月10日
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
