package ru.avakyants.java.bball.model;

import java.util.List;

public class Linescores {
	private long id;
	private List<Period> periodList;
	private GameTeam gameTeam;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<Period> getPeriodList() {
		return periodList;
	}
	public void setPeriodList(List<Period> periodList) {
		this.periodList = periodList;
	}
	public GameTeam getGameTeam() {
		return gameTeam;
	}
	public void setGameTeam(GameTeam gameTeam) {
		this.gameTeam = gameTeam;
	}
}
