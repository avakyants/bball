package ru.avakyants.java.bball.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

public class GameTeamDTO {
	private long id;
	
	
	private TeamDTO team;
	private short score;
	
	@JsonIgnore
	private GameDTO game;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public TeamDTO getTeam() {
		return team;
	}
	public void setTeam(TeamDTO team) {
		this.team = team;
	}
	public short getScore() {
		return score;
	}
	public void setScore(short score) {
		this.score = score;
	}

	public GameDTO getGame() {
		return game;
	}
	public void setGame(GameDTO game) {
		this.game = game;
	}
}
