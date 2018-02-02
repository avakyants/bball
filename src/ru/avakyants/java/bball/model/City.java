package ru.avakyants.java.bball.model;

import java.util.List;

public class City {

	private long id;
	private String name;
	private CountryState countryState;
	private List<Arena> arenaList;
	
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
