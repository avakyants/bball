package ru.avakyants.java.bball.data.nba;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NBAGames {
	
	List<NBAGame> game;
	
	@JsonProperty("game")
	public List<NBAGame> getGames(){
		return this.game;
	}
	
	@JsonProperty("game")
	public void setGames(List<NBAGame> games) {
		this.game = games;
	}

}
