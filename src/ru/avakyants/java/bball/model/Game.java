package ru.avakyants.java.bball.model;

import java.time.ZonedDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Game {
	private long id;
	private long sourceId;
	
	@JsonFormat(shape = JsonFormat.Shape.NUMBER)
	private ZonedDateTime dateTime;
	@JsonIgnore
	private SeasonStage seasonStage;
	@JsonIgnore
	private Arena arena;
	@JsonIgnore
	private GameTeam visitor;
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
}
