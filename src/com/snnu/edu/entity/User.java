package com.snnu.edu.entity;

public class User {
	private int id;	
	private String username;
	private String password;
	private String surnamec;
	private String unamec;
	private String surnamee;
	private String unamee;
	private String sexc;
	private String sexe;
	private String email;
	private String countryc;
	private String countrye;
	private String cityc;
	private String citye;
	private String workplacec;
	private String workplacee;
	private String educationc;
	private String educatione;
	private String majorc;
	private String majore;
	private Position position;
	private Limit limit;
	
	
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public Limit getLimit() {
		return limit;
	}
	public void setLimit(Limit limit) {
		this.limit = limit;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSurnamec() {
		return surnamec;
	}
	public void setSurnamec(String surnamec) {
		this.surnamec = surnamec;
	}
	public String getUnamec() {
		return unamec;
	}
	public void setUnamec(String unamec) {
		this.unamec = unamec;
	}
	public String getSurnamee() {
		return surnamee;
	}
	public void setSurnamee(String surnamee) {
		this.surnamee = surnamee;
	}
	public String getUnamee() {
		return unamee;
	}
	public void setUnamee(String unamee) {
		this.unamee = unamee;
	}
	public String getSexc() {
		return sexc;
	}
	public void setSexc(String sexc) {
		this.sexc = sexc;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountryc() {
		return countryc;
	}
	public void setCountryc(String countryc) {
		this.countryc = countryc;
	}
	public String getCountrye() {
		return countrye;
	}
	public void setCountrye(String countrye) {
		this.countrye = countrye;
	}
	public String getCityc() {
		return cityc;
	}
	public void setCityc(String cityc) {
		this.cityc = cityc;
	}
	public String getCitye() {
		return citye;
	}
	public void setCitye(String citye) {
		this.citye = citye;
	}
	public String getWorkplacec() {
		return workplacec;
	}
	public void setWorkplacec(String workplacec) {
		this.workplacec = workplacec;
	}
	public String getWorkplacee() {
		return workplacee;
	}
	public void setWorkplacee(String workplacee) {
		this.workplacee = workplacee;
	}
	public String getEducationc() {
		return educationc;
	}
	public void setEducationc(String educationc) {
		this.educationc = educationc;
	}
	public String getEducatione() {
		return educatione;
	}
	public void setEducatione(String educatione) {
		this.educatione = educatione;
	}
	public String getMajorc() {
		return majorc;
	}
	public void setMajorc(String majorc) {
		this.majorc = majorc;
	}
	public String getMajore() {
		return majore;
	}
	public void setMajore(String majore) {
		this.majore = majore;
	}
	
	public User(int id, String username, String password, String surnamec,
			String unamec, String surnamee, String unamee, String sexc,
			String sexe, String email, String countryc, String countrye,
			String cityc, String citye, String workplacec, String workplacee,
			String educationc, String educatione, String majorc, String majore,
			Position position, Limit limit) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.surnamec = surnamec;
		this.unamec = unamec;
		this.surnamee = surnamee;
		this.unamee = unamee;
		this.sexc = sexc;
		this.sexe = sexe;
		this.email = email;
		this.countryc = countryc;
		this.countrye = countrye;
		this.cityc = cityc;
		this.citye = citye;
		this.workplacec = workplacec;
		this.workplacee = workplacee;
		this.educationc = educationc;
		this.educatione = educatione;
		this.majorc = majorc;
		this.majore = majore;
		this.position = position;
		this.limit = limit;
		
	}
	public User(int id, String username, String password, String surnamec,
			String unamec, String surnamee, String unamee, String sexc,
			String sexe, String email, String countryc, String countrye,
			String cityc, String citye, String workplacec, String workplacee,
			String educationc, String educatione, String majorc, String majore) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.surnamec = surnamec;
		this.unamec = unamec;
		this.surnamee = surnamee;
		this.unamee = unamee;
		this.sexc = sexc;
		this.sexe = sexe;
		this.email = email;
		this.countryc = countryc;
		this.countrye = countrye;
		this.cityc = cityc;
		this.citye = citye;
		this.workplacec = workplacec;
		this.workplacee = workplacee;
		this.educationc = educationc;
		this.educatione = educatione;
		this.majorc = majorc;
		this.majore = majore;
	}
	public User() {
		super();
	}
	
	
	
}
