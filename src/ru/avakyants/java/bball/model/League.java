package ru.avakyants.java.bball.model;

import java.util.List;

public class League {
	
	private long id;
	private String name;
	private List<Season> seasonList;
	
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
	public List<Season> getSeasonList() {
		return seasonList;
	}
	public void setSeasonList(List<Season> seasonList) {
		this.seasonList = seasonList;
	}

}
