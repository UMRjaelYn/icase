package com.snnu.edu.entity;

import java.util.Date;

public class Email {
	private int id;
	private String address;
	private String contentc;
	private String themec;
	private String contente;
	private String themee;
	private Date sendtime;
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContentc() {
		return contentc;
	}
	public void setContentc(String contentc) {
		this.contentc = contentc;
	}
	public String getThemec() {
		return themec;
	}
	public void setThemec(String themec) {
		this.themec = themec;
	}
	public String getContente() {
		return contente;
	}
	public void setContente(String contente) {
		this.contente = contente;
	}
	public String getThemee() {
		return themee;
	}
	public void setThemee(String themee) {
		this.themee = themee;
	}
	public Date getSendtime() {
		return sendtime;
	}
	public void setSendtime(Date sendtime) {
		this.sendtime = sendtime;
	}
	
	public Email(int id, String address, String contentc, String themec,
			String contente, String themee, Date sendtime, User user) {
		super();
		this.id = id;
		this.address = address;
		this.contentc = contentc;
		this.themec = themec;
		this.contente = contente;
		this.themee = themee;
		this.sendtime = sendtime;
		this.user = user;
	}
	public Email(int id, String address, String contentc, String themec,
			String contente, String themee, Date sendtime) {
		super();
		this.id = id;
		this.address = address;
		this.contentc = contentc;
		this.themec = themec;
		this.contente = contente;
		this.themee = themee;
		this.sendtime = sendtime;
	}
	public Email(int id, String contentc, String themec, String contente,
			String themee, Date sendtime) {
		super();
		this.id = id;
		this.contentc = contentc;
		this.themec = themec;
		this.contente = contente;
		this.themee = themee;
		this.sendtime = sendtime;
	}
	public Email() {
		super();
	}
	@Override
	public String toString() {
		return "Email [id=" + id + ", contentc=" + contentc + ", themec="
				+ themec + ", contente=" + contente + ", themee=" + themee
				+ ", sendtime=" + sendtime + "]";
	}
	
}
