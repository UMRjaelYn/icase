package com.snnu.edu.entity;

public class Study_Field {
private int id;
private User user;
private Field field;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public Field getField() {
	return field;
}
public void setField(Field field) {
	this.field = field;
}
public Study_Field(int id, User user, Field field) {
	super();
	this.id = id;
	this.user = user;
	this.field = field;
}
public Study_Field() {
	super();
}

}
