package com.snnu.edu.entity;

public class Field {
	private int id;
	private String fieldc;
	private String fielde;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFieldc() {
		return fieldc;
	}
	public void setFieldc(String fieldc) {
		this.fieldc = fieldc;
	}
	public String getFielde() {
		return fielde;
	}
	public void setFielde(String fielde) {
		this.fielde = fielde;
	}
	public Field(int id, String fieldc, String fielde) {
		super();
		this.id = id;
		this.fieldc = fieldc;
		this.fielde = fielde;
	}
	public Field() {
		super();
	}
	@Override
	public String toString() {
		return "Field [id=" + id + ", fieldc=" + fieldc + ", fielde=" + fielde
				+ "]";
	}
	
}
