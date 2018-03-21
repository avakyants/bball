package ru.avakyants.java.bball.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

public class Period {
	private long id;
	private Periods period;
	private short score;
	@JsonBackReference private GameTeam gameTeam;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Periods getPeriod() {
		return period;
	}
	public void setPeriod(Periods period) {
		this.period = period;
	}
	public short getScore() {
		return score;
	}
	public void setScore(short score) {
		this.score = score;
	}
	
	public GameTeam getGameTeam() {
		return gameTeam;
	}
	
	public void setGameTeam(GameTeam gameTeam) {
		this.gameTeam = gameTeam;
	}
}
