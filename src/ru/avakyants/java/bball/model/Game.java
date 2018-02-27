package ru.avakyants.java.bball.model;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Game {
	private long id;
	private long sourceId;
	
	@JsonIgnore
	private ZonedDateTime dateTime;
	
	//String representation on ZonedDateTime
	private String dateTimeString;
	
	@JsonManagedReference
	private SeasonStage seasonStage;
	
	private Arena arena;
	
	@JsonManagedReference private GameTeam visitor;
	@JsonIgnore
	private GameTeam home;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getSourceId() {
		return sourceId;
	}
	public void setSourceId(long sourceId) {
		this.sourceId = sourceId;
	}
	public ZonedDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(ZonedDateTime dateTime) {
		this.dateTime = dateTime;
		this.dateTimeString = DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(dateTime);
	}
	public SeasonStage getSeasonStage() {
		return seasonStage;
	}
	public void setSeasonStage(SeasonStage seasonStage) {
		this.seasonStage = seasonStage;
	}
	
	public Arena getArena() {
		return arena;
	}
	public void setArena(Arena arena) {
		this.arena = arena;
	}
	public GameTeam getVisitor() {
		return visitor;
	}
	public void setVisitor(GameTeam visitor) {
		this.visitor = visitor;
	}
	public GameTeam getHome() {
		return home;
	}
	public void setHome(GameTeam home) {
		this.home = home;
	}
	
	@JsonProperty("datetime")
	public String getDateTimeString() {
		return dateTimeString;
	}
	@JsonProperty("datetime")
	public void setDateTimeString(String dateTimeString) {
		this.dateTime = ZonedDateTime.parse(dateTimeString, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
		this.dateTimeString = dateTimeString;		
	}

}
