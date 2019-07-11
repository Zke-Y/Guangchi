package org.guangchi.entity;

public class NewReservation {
	int idReservation;
	String Date;
	String State;
	String Sumcost;
	String Comment;
	public static int st_reservation;
	public NewReservation() {};
	public NewReservation(int idReservation, String date, String state, String sumcost, String comment) {
		super();
		this.idReservation = idReservation;
		st_reservation=idReservation;
		Date = date;
		State = state;
		Sumcost = sumcost;
		Comment = comment;
	}
	public String getComment() {
		return Comment;
	}
	public void setComment(String comment) {
		
		Comment = comment;
	}
	public int getIdReservation() {
		
		return idReservation;
	}
	public void setIdReservation(int idReservation) {
		st_reservation=idReservation;
		this.idReservation = idReservation;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getSumcost() {
		return Sumcost;
	}
	public void setSumcost(String sumcost) {
		Sumcost = sumcost;
	}
}
