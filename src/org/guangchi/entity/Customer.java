package org.guangchi.entity;

public class Customer {
	String name;
	String pwd;
	String isCredit;
	public String getIsCredit() {
		return isCredit;
	}
	public void setIsCredit(String isCredit) {
		this.isCredit = isCredit;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Customer(String name, String pwd,String isCredit) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.isCredit=isCredit;
	}
}
