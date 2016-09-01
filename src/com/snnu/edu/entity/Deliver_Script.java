package com.snnu.edu.entity;

import java.util.Date;

public class Deliver_Script {
	private int id;
	private Date time;
	private Manuscript manuscript;
	private User user;
	
	public Manuscript getManuscript() {
		return manuscript;
	}
	public void setManuscript(Manuscript manuscript) {
		this.manuscript = manuscript;
	}
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
	
	public Deliver_Script(int id, Date time, Manuscript manuscript, User user) {
		super();
		this.id = id;
		this.time = time;
		this.manuscript = manuscript;
		this.user = user;
	}
	public Deliver_Script(int id, Date time) {
		super();
		this.id = id;
		this.time = time;
	}
	public Deliver_Script() {
		super();
	}
	@Override
	public String toString() {
		return "Deliver_Script [id=" + id + ", time=" + time + "]";
	}
	
}
