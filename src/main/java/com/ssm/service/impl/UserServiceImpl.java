package com.ssm.service.impl;

import com.ssm.dao.UserDao;
import com.ssm.service.UserService;

/**
 * @author ZYB
 * @date ����ʱ�䣺2020��5��10��
 * @serial
 * 
 */
public class UserServiceImpl implements UserService {
	UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public boolean login(String code, String pwd) {
		return userDao.login(code, pwd);
	}

}
