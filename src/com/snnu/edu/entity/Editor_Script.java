package com.snnu.edu.entity;

import java.util.Date;

public class Editor_Script {
	private int id;
	private Date checktimec;
	private Date overtimec;
	private Date checktimee;
	private Date overtimee;
	private String statec;
	private String statee;
	private User user;
	private Manuscript manuscript;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Manuscript getManuscript() {
		return manuscript;
	}
	public void setManuscript(Manuscript manuscript) {
		this.manuscript = manuscript;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getChecktimec() {
		return checktimec;
	}
	public void setChecktimec(Date checktimec) {
		this.checktimec = checktimec;
	}
	public Date getOvertimec() {
		return overtimec;
	}
	public void setOvertimec(Date overtimec) {
		this.overtimec = overtimec;
	}
	public Date getChecktimee() {
		return checktimee;
	}
	public void setChecktimee(Date checktimee) {
		this.checktimee = checktimee;
	}
	public Date getOvertimee() {
		return overtimee;
	}
	public void setOvertimee(Date overtimee) {
		this.overtimee = overtimee;
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
	
	public Editor_Script(int id, Date checktimec, Date overtimec,
			Date checktimee, Date overtimee, String statec, String statee,
			User user, Manuscript manuscript) {
		super();
		this.id = id;
		this.checktimec = checktimec;
		this.overtimec = overtimec;
		this.checktimee = checktimee;
		this.overtimee = overtimee;
		this.statec = statec;
		this.statee = statee;
		this.user = user;
		this.manuscript = manuscript;
	}
	public Editor_Script(int id, Date checktimec, Date overtimec,
			Date checktimee, Date overtimee, String statec, String statee) {
		super();
		this.id = id;
		this.checktimec = checktimec;
		this.overtimec = overtimec;
		this.checktimee = checktimee;
		this.overtimee = overtimee;
		this.statec = statec;
		this.statee = statee;
	}
	public Editor_Script() {
		super();
	}
	@Override
	public String toString() {
		return "Editor_Script [id=" + id + ", checktimec=" + checktimec
				+ ", overtimec=" + overtimec + ", checktimee=" + checktimee
				+ ", overtimee=" + overtimee + ", statec=" + statec
				+ ", statee=" + statee + "]";
	}
	
}
