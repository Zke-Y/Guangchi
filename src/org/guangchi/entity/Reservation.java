package org.guangchi.entity;

public class Reservation {
	int idReservation;
	String idCustomer;
	String date;
	String state;
	String sumcost;
	String comment;
	public String getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(String idCustomer) {
		this.idCustomer = idCustomer;
	}
	public Reservation(int idReservation, String idCustomer, String date, String state, String sumcost,
			String comment) {
		super();
		this.idReservation = idReservation;
		this.idCustomer = idCustomer;
		this.date = date;
		this.state = state;
		this.sumcost = sumcost;
		this.comment = comment;
	}
	public Reservation(int idReservation, String date, String state, String sumcost, String comment) {
		super();
		this.idReservation = idReservation;
		this.date = date;
		this.state = state;
		this.sumcost = sumcost;
		this.comment = comment;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getIdReservation() {
		return idReservation;
	}
	public void setIdReservation(int idReservation) {
		this.idReservation = idReservation;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getSumcost() {
		return sumcost;
	}
	public void setSumcost(String sumcost) {
		this.sumcost = sumcost;
	}
}
