package org.guangchi.entity;

public class Food {
	String fname;
	String ftype;
	String path;
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	int price;
	public String getFtype() {
		return ftype;
	}
	public Food(String fname, String path, int price) {
		super();
		this.fname = fname;
		this.path = path;
		this.price = price;
	}
	public void setFtype(String ftype) {
		this.ftype = ftype;
	}

	public Food(String fname, int price) {
		super();
		this.fname = fname;
		this.price = price;
	}
	public Food(String fname, String ftype, String path, int price) {
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
