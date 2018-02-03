package ru.avakyants.java.bball.model;

import java.util.ArrayList;
import java.util.List;

public class Season {
	
	private long id;
	private League league;
	private List<SeasonStage> stageList = new ArrayList<>();
	private List<Game> gameList = new ArrayList<>();
	
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
	public List<Game> getGameList() {
		gameList = new ArrayList<>();
		for(SeasonStage stage : stageList) {
			gameList.addAll(stage.getGameList());
		}
		return gameList;
	}
}
