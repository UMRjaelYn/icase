package com.snnu.edu.entity;

import java.util.Date;

public class Thesis {
	private int id;
	private String tname;
	private Date publishtime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Date getPublishtime() {
		return publishtime;
	}
	public void setPublishtime(Date publishtime) {
		this.publishtime = publishtime;
	}
	public Thesis(int id, String tname, Date publishtime) {
		super();
		this.id = id;
		this.tname = tname;
		this.publishtime = publishtime;
	}
	public Thesis() {
		super();
	}
	@Override
	public String toString() {
		return "Thesis [id=" + id + ", tname=" + tname + ", publishtime="
				+ publishtime + "]";
	}
	
}
