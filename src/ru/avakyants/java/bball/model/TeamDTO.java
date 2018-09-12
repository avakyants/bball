package ru.avakyants.java.bball.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class TeamDTO {
	private long id;
	private String name;
	private String key;
	
	@JsonIgnore
	private List<GameTeamDTO> gameTeamList = new ArrayList<>();
	
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
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public List<GameTeamDTO> getGameTeamList() {
		return gameTeamList;
	}
	public void setGameTeamList(List<GameTeamDTO> gameTeamList) {
		this.gameTeamList = gameTeamList;
	}	
}
