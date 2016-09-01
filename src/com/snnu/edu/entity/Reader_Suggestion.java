package com.snnu.edu.entity;

public class Reader_Suggestion {
	private int id;
	private String suggestion;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSuggestion() {
		return suggestion;
	}
	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}
	public Reader_Suggestion(int id, String suggestion) {
		super();
		this.id = id;
		this.suggestion = suggestion;
	}
	public Reader_Suggestion() {
		super();
	}
	@Override
	public String toString() {
		return "Reader_Suggestion [id=" + id + ", suggestion=" + suggestion
				+ "]";
	}
	
}
