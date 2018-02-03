package ru.avakyants.java.bball.model;

import java.util.ArrayList;
import java.util.List;

public class Team {
	private long id;
	private City city;
	private String name;
	private String key;
	private List<GameTeam> gameTeamList = new ArrayList<>();
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public List<GameTeam> getGameTeamList() {
		return gameTeamList;
	}
	public void setGameTeamList(List<GameTeam> gameTeamList) {
		this.gameTeamList = gameTeamList;
	}	
}
