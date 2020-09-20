package com.ssm.controller;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ssm.entity.UserTest;

/**
 * @author ZYB
 * @date 创建时间：2020年7月7日
 * @serial
 * 
 */
public class MybatisTest {
	private SqlSessionFactory sqlSeesionFactroy;
	private SqlSession sqlSession;

//	public static void main(String[] args) {
//		MybatisTest a = new MybatisTest();
//		a.init();
//		a.testFindUserInfoById();
//		a.destory();
//	}

	@Before
	public void init() {
		// 读取mybatis配置文件
		String resource = "mybatis-config.xml";
		InputStream inputStream;
		try {
			// 得到配置文件流
			inputStream = Resources.getResourceAsStream(resource);
			// 根据配置文件创建会话工厂
			sqlSeesionFactroy = new SqlSessionFactoryBuilder().build(inputStream);
			// 通过工厂得到SqlSession
			sqlSession = sqlSeesionFactroy.openSession();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	public void testFindUserTestById() {

		UserTest usertest = sqlSession.selectOne("findUserTestById", "2136165030046352456");
		usertest.toString();

	}

	@After
	public void destory() {
		sqlSession.commit();
		sqlSession.close();

	}
}
