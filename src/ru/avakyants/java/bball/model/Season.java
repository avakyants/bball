package ru.avakyants.java.bball.model;

import java.time.LocalDate;
import java.util.List;

public class Season {
	
	private long id;
	private LocalDate startDate;
	private LocalDate endDate;
	private League league;
	private List<SeasonStage> stageList;
	private List<Game> gameList;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
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
		return gameList;
	}
	public void setGameList(List<Game> gameList) {
		this.gameList = gameList;
	}
}
