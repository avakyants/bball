package ru.avakyants.java.bball.data.nba;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties({ "lp","dl","broadcasters","ticket","tnt_ot","notebookAvailable","recapAvailable","previewAvailable","home_start_date","home_start_time","visitor_start_date","visitor_start_time" })
public class NBAGame {
	long id;
	String gameURL;
	long seasonId;
	String date;
	String time;
	String arena;
	String city;
	String state;
	String country;	
	String buzzerBeater;
	Map<String,String> periodTime;
	
	NBAGameTeam visitor;
	NBAGameTeam home;
	
	public long getId() {
		return this.id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	@JsonProperty("game_url")
	public String getGameURL() {
		return this.gameURL;
	}
	
	@JsonProperty("game_url")
	public void setGameURL(String url) {
		this.gameURL = url;
	}
	
	@JsonProperty("season_id")
	public long getSeasonId() {
		return this.seasonId;
	}
	
	@JsonProperty("season_id")
	public void setSeasonId(long id) {
		this.seasonId = id;
	}
	
	public String getDate() {
		return this.date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getTime() {
		return this.time;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	
	public String getArena() {
		return this.arena;
	}
	
	public void setArena(String arena) {
		this.arena = arena;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return this.state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getCountry() {
		return this.country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getBuzzerBeater() {
		return this.buzzerBeater;
	}
	
	public void setBuzzerBeater(String buzzerBeater) {
		this.buzzerBeater = buzzerBeater;
	}
	
	@JsonProperty("period_time")
	public Map<String,String> getPeriodTime(){
		return this.periodTime;
	}
	
	@JsonProperty("period_time")
	public void setPeriodTime(Map<String,String> pt) {
		this.periodTime = pt;
	}

	public NBAGameTeam getVisitor() {
		return visitor;
	}

	public void setVisitor(NBAGameTeam visitor) {
		this.visitor = visitor;
	}

	public NBAGameTeam getHome() {
		return home;
	}

	public void setHome(NBAGameTeam home) {
		this.home = home;
	}
	
}
