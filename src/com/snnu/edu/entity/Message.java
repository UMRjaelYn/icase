package com.snnu.edu.entity;

import java.util.Date;

public class Message {
	private int id;
	private String contentc;
	private String contente;
	private Date sendtime;
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
	public String getContentc() {
		return contentc;
	}
	public void setContentc(String contentc) {
		this.contentc = contentc;
	}
	public String getContente() {
		return contente;
	}
	public void setContente(String contente) {
		this.contente = contente;
	}
	public Date getSendtime() {
		return sendtime;
	}
	public void setSendtime(Date sendtime) {
		this.sendtime = sendtime;
	}
	
	public Message(int id, String contentc, String contente, Date sendtime,
			User user) {
		super();
		this.id = id;
		this.contentc = contentc;
		this.contente = contente;
		this.sendtime = sendtime;
		this.user = user;
	}
	public Message(int id, String contentc, String contente, Date sendtime) {
		super();
		this.id = id;
		this.contentc = contentc;
		this.contente = contente;
		this.sendtime = sendtime;
	}
	public Message() {
		super();
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", contentc=" + contentc + ", contente="
				+ contente + ", sendtime=" + sendtime + "]";
	}
	
}
