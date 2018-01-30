package ru.avakyants.java.bball.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.avakyants.java.bball.data.nba.NBASportsContent;

public class NBAGamesByDateData {
	
	NBASportsContent sportsContent;
	
	@JsonProperty("sports_content")
	public NBASportsContent getSportsContent() {
		return this.sportsContent;
	}
	
	@JsonProperty("sports_content")
	public void setSportsContent(NBASportsContent content) {
		this.sportsContent = content;
	}

}
