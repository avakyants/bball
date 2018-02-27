package ru.avakyants.java.bball.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

public class Arena {
	
	private long id;
	private String name;
	@JsonManagedReference private City city;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}

}
