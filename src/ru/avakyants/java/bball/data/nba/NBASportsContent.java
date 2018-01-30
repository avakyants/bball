package ru.avakyants.java.bball.data.nba;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NBASportsContent {
	NBASportsMeta sportsMeta;
	NBAGames games;
	
	@JsonProperty("sports_meta")
	public NBASportsMeta getSportsMeta() {
		return this.sportsMeta;
	}
	
	@JsonProperty("sports_meta")
	public void setSportsMeta(NBASportsMeta meta) {
		this.sportsMeta = meta;
	}
	
	public NBAGames getGames() {
		return this.games;
	}
	
	public void setGames(NBAGames games) {
		this.games = games;
	}
}
