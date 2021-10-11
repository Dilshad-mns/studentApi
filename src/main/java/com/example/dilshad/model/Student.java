package com.example.dilshad.model;

import java.util.Date;

public class Student {
	private int id;
	private String name;
	private Date birthDate;
	
	@Override
	public String toString() {
		return "modelStudent [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
}
