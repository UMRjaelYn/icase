package com.snnu.edu.entity;

import java.util.Date;

public class Fire {
	private int id;
	private String reason;
	private Date firetime;
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Date getFiretime() {
		return firetime;
	}
	public void setFiretime(Date firetime) {
		this.firetime = firetime;
	}
	
	public Fire(int id, String reason, Date firetime, User user) {
		super();
		this.id = id;
		this.reason = reason;
		this.firetime = firetime;
		this.user = user;
	}
	public Fire(int id, String reason, Date firetime) {
		super();
		this.id = id;
		this.reason = reason;
		this.firetime = firetime;
	}
	public Fire() {
		super();
	}
	@Override
	public String toString() {
		return "Fire [id=" + id + ", reason=" + reason + ", firetime="
				+ firetime + "]";
	}
	
}
