package ru.avakyants.java.bball.model;

import java.util.List;

public class CountryState {
	private long id;
	private String name;
	private List<City> cityList;
	private Country country;
	
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
	public List<City> getCityList() {
		return cityList;
	}
	public void setCityList(List<City> cityList) {
		this.cityList = cityList;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	
}
