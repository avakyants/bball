package ru.avakyants.java.bball.model;

public class GameTeam {
	private long id;
	private Team team;
	private short score;
	private Linescores linescores;
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
	public Linescores getLinescores() {
		return linescores;
	}
	public void setLinescores(Linescores linescores) {
		this.linescores = linescores;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
}
