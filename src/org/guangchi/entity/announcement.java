package org.guangchi.entity;

public class announcement {
	int id;
	String context;
	String date;
	public announcement(int id,String context, String date) {
		super();
		this.id=id;
		this.context = context;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
