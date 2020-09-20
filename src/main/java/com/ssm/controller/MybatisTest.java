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
 * @date ����ʱ�䣺2020��7��7��
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
		// ��ȡmybatis�����ļ�
		String resource = "mybatis-config.xml";
		InputStream inputStream;
		try {
			// �õ������ļ���
			inputStream = Resources.getResourceAsStream(resource);
			// ���������ļ������Ự����
			sqlSeesionFactroy = new SqlSessionFactoryBuilder().build(inputStream);
			// ͨ�������õ�SqlSession
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
