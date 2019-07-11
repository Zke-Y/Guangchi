package org.guangchi.entity;

public class NewFood {
	public static String fname;
	public static String ftype;
	public static String path;
	public static int price;
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	public String getFtype() {
		return ftype;
	}
	public NewFood( String path) {
		super();
		this.path = path;

	}
	public NewFood(String fname, String ftype, int price) {
		super();
		this.fname = fname;
		this.ftype = ftype;
		this.price = price;
	}
	public void setFtype(String ftype) {
		this.ftype = ftype;
	}

	public NewFood(String fname, int price) {
		super();
		this.fname = fname;
		this.price = price;
	}
	public NewFood(String fname, String ftype, String path, int price) {
		super();
		this.fname = fname;
		this.ftype = ftype;
		this.path = path;
		this.price = price;
	}
	public  String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
