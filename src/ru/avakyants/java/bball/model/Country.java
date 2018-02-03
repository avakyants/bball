package ru.avakyants.java.bball.model;

import java.util.ArrayList;
import java.util.List;

public class Country {
	private long id;
	private String name;
	private List<CountryState> countryStateList = new ArrayList<>();
	
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
	public List<CountryState> getCountryStateList() {
		return countryStateList;
	}
	public void setCountryStateList(List<CountryState> countryStateList) {
		this.countryStateList = countryStateList;
	}	
}
