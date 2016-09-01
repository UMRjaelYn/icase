package com.snnu.edu.entity;

public class Position {
	private int id;
	private String positionc;
	private String positione;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPositionc() {
		return positionc;
	}
	public void setPositionc(String positionc) {
		this.positionc = positionc;
	}
	public String getPositione() {
		return positione;
	}
	public void setPositione(String positione) {
		this.positione = positione;
	}
	public Position(int id, String positionc, String positione) {
		super();
		this.id = id;
		this.positionc = positionc;
		this.positione = positione;
	}
	public Position() {
		super();
	}
	@Override
	public String toString() {
		return "Position [id=" + id + ", positionc=" + positionc
				+ ", positione=" + positione + "]";
	}
	
}
