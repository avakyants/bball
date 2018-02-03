package ru.avakyants.java.bball.model;

import java.util.ArrayList;
import java.util.List;

public class GameTeam {
	private long id;
	private Team team;
	private short score;
	private List<Period> linescores = new ArrayList<>();
	private Game game;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public short getScore() {
		return score;
	}
	public void setScore(short score) {
		this.score = score;
	}
	public List<Period> getLinescores() {
		return linescores;
	}
	public void setLinescores(List<Period> linescores) {
		this.linescores = linescores;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
}
