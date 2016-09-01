package com.snnu.edu.entity;

import java.util.Date;

public class Assess {
	private int id;
	private Date time;
	private String statec;
	private String statee;
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
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getStatec() {
		return statec;
	}
	public void setStatec(String statec) {
		this.statec = statec;
	}
	public String getStatee() {
		return statee;
	}
	public void setStatee(String statee) {
		this.statee = statee;
	}
	
	public Assess(int id, Date time, String statec, String statee, User user) {
		super();
		this.id = id;
		this.time = time;
		this.statec = statec;
		this.statee = statee;
		this.user = user;
	}
	public Assess(int id, Date time, String statec, String statee) {
		super();
		this.id = id;
		this.time = time;
		this.statec = statec;
		this.statee = statee;
	}
	public Assess() {
		super();
	}
	@Override
	public String toString() {
		return "Assess [id=" + id + ", time=" + time + ", statec=" + statec
				+ ", statee=" + statee + "]";
	}
	
}
