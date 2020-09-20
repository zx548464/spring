package com.ssm.entity;

import java.util.Map;

/**
 * @author ZYB
 * @date 创建时间：2020年5月26日
 * @serial
 * 
 */
public class UserMap {
	private Map<String, Usera> uMap;

	public Map<String, Usera> getuMap() {
		return uMap;
	}

	public void setuMap(Map<String, Usera> uMap) {
		this.uMap = uMap;
	}

}
