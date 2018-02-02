package ru.avakyants.java.bball.model;

import java.time.ZonedDateTime;

public class Game {
	private long id;
	private long sourceId;
	private ZonedDateTime dateTime;
	private SeasonStage seasonStage;
	private Arena arena;
	private GameTeam visitor;
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
