package com.snnu.edu.entity;

public class Limit {
	private int id;
	private int contribute;
	private int checkscript;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getContribute() {
		return contribute;
	}
	public void setContribute(int contribute) {
		this.contribute = contribute;
	}
	public int getCheckscript() {
		return checkscript;
	}
	public void setCheckscript(int checkscript) {
		this.checkscript = checkscript;
	}
	public Limit(int id, int contribute, int checkscript) {
		super();
		this.id = id;
		this.contribute = contribute;
		this.checkscript = checkscript;
	}
	public Limit() {
		super();
	}
	@Override
	public String toString() {
		return "Limit [id=" + id + ", contribute=" + contribute
				+ ", checkscript=" + checkscript + "]";
	}
	
}
