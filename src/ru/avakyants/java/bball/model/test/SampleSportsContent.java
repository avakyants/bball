package ru.avakyants.java.bball.model.test;

import java.util.List;

public class SampleSportsContent {

	SportsMeta meta;
	List<SampleGame> games;
	
	public SportsMeta getMeta() {
		return this.meta;
	}
	
	public void setMeta(SportsMeta meta) {
		this.meta = meta;
	}
	
	public List<SampleGame> getGames(){
		return games;
	}
	
	public void setGames(List<SampleGame> games) {
		this.games = games;
	}
	
}
