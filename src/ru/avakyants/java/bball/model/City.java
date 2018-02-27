package ru.avakyants.java.bball.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

public class City {

	private long id;
	private String name;
	@JsonManagedReference private CountryState countryState;
	@JsonBackReference private List<Arena> arenaList = new ArrayList<>();
	
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
	public CountryState getCountryState() {
		return countryState;
	}
	public void setCountryState(CountryState countryState) {
		this.countryState = countryState;
	}
	public List<Arena> getArenaList() {
		return arenaList;
	}
	public void setArenaList(List<Arena> arenaList) {
		this.arenaList = arenaList;
	}
	
}
