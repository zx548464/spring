package com.ssm.entity;

/**
 * @author ZYB
 * @date 创建时间：2020年7月7日
 * @serial
 * 
 */
public class UserTest {
	private long id;
	private String userName;
	private String reporter;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getReporter() {
		return reporter;
	}

	public void setReporter(String reporter) {
		this.reporter = reporter;
	}

	public UserTest() {

		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserTest [id=" + id + ", userName=" + userName + ",  reporter=" + reporter + " ]";

	}

}
