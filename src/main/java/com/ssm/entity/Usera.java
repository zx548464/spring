package com.ssm.entity;

/**
 * @author ZYB
 * @date
 * @serial
 * 
 */
public class Usera {
	public String code;
	public String name;
	public String dept;
	private Address addre;

	public Address getAddre() {
		return addre;
	}

	public void setAddre(Address addre) {
		this.addre = addre;
	}

	public String getCode() {
		return code;
	}

	public Usera() {

		// TODO Auto-generated constructor stub
	}

	public Usera(String code, String name, String dept, Address addre) {
		super();
		this.code = code;
		this.name = name;
		this.dept = dept;
		this.addre = addre;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Usera(String name, String dept) {

		this.name = name;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void print() {
		System.out.print(code + "---  " + name + "---  " + dept);

	}

	@Override
	public String toString() {
		return "User[code=  " + code + "  name= " + name + " dept=  " + dept + "   address=" + addre + "]";
	}

}
