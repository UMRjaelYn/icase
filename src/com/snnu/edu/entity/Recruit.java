package com.snnu.edu.entity;

import java.util.Date;

public class Recruit {
	private int id;
	private Date recruittime;
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
	public Date getRecruittime() {
		return recruittime;
	}
	public void setRecruittime(Date recruittime) {
		this.recruittime = recruittime;
	}
	
	public Recruit(int id, Date recruittime, User user) {
		super();
		this.id = id;
		this.recruittime = recruittime;
		this.user = user;
	}
	public Recruit(int id, Date recruittime) {
		super();
		this.id = id;
		this.recruittime = recruittime;
	}
	public Recruit() {
		super();
	}
	@Override
	public String toString() {
		return "Recruit [id=" + id + ", recruittime=" + recruittime + "]";
	}
	
}
