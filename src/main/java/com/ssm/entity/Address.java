package com.ssm.entity;

/**
 * @author ZYB
 * @date 创建时间：2020年5月26日
 * @serial
 * 
 */
public class Address {
	private String province;
	private String city;

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String province, String city) {
		super();
		this.province = province;
		this.city = city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address[  city=" + city + " province=" + province + " ]";

	}

}
