package ru.avakyants.java.bball.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

public class Season {
	
	private long id;
	@JsonManagedReference private League league;
	@JsonBackReference private List<SeasonStage> stageList = new ArrayList<>();
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public League getLeague() {
		return league;
	}
	public void setLeague(League league) {
		this.league = league;
	}
	public List<SeasonStage> getStageList() {
		return stageList;
	}
	public void setStageList(List<SeasonStage> stageList) {
		this.stageList = stageList;
	}
	
}
