package com.snnu.edu.entity;

public class Manuscript {
	private int id;
	private String mnamec;
	private String mnamee;
	private String typec;
	private String typee;
	private String titlec;
	private String titlee;
	private String summaryc;
	private String summarye;
	private String keywordc;
	private String keyworde;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMnamec() {
		return mnamec;
	}
	public void setMnamec(String mnamec) {
		this.mnamec = mnamec;
	}
	public String getMnamee() {
		return mnamee;
	}
	public void setMnamee(String mnamee) {
		this.mnamee = mnamee;
	}
	public String getTypec() {
		return typec;
	}
	public void setTypec(String typec) {
		this.typec = typec;
	}
	public String getTypee() {
		return typee;
	}
	public void setTypee(String typee) {
		this.typee = typee;
	}
	public String getTitlec() {
		return titlec;
	}
	public void setTitlec(String titlec) {
		this.titlec = titlec;
	}
	public String getTitlee() {
		return titlee;
	}
	public void setTitlee(String titlee) {
		this.titlee = titlee;
	}
	public String getSummaryc() {
		return summaryc;
	}
	public void setSummaryc(String summaryc) {
		this.summaryc = summaryc;
	}
	public String getSummarye() {
		return summarye;
	}
	public void setSummarye(String summarye) {
		this.summarye = summarye;
	}
	public String getKeywordc() {
		return keywordc;
	}
	public void setKeywordc(String keywordc) {
		this.keywordc = keywordc;
	}
	public String getKeyworde() {
		return keyworde;
	}
	public void setKeyworde(String keyworde) {
		this.keyworde = keyworde;
	}
	public Manuscript(int id, String mnamec, String mnamee, String typec,
			String typee, String titlec, String titlee, String summaryc,
			String summarye, String keywordc, String keyworde) {
		super();
		this.id = id;
		this.mnamec = mnamec;
		this.mnamee = mnamee;
		this.typec = typec;
		this.typee = typee;
		this.titlec = titlec;
		this.titlee = titlee;
		this.summaryc = summaryc;
		this.summarye = summarye;
		this.keywordc = keywordc;
		this.keyworde = keyworde;
	}
	public Manuscript() {
		super();
	}
	@Override
	public String toString() {
		return "Manuscript [id=" + id + ", mnamec=" + mnamec + ", mnamee="
				+ mnamee + ", typec=" + typec + ", typee=" + typee
				+ ", titlec=" + titlec + ", titlee=" + titlee + ", summaryc="
				+ summaryc + ", summarye=" + summarye + ", keywordc="
				+ keywordc + ", keyworde=" + keyworde + "]";
	}
	
}
