package ru.avakyants.java.bball.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

public class GameDTO {
	private long id;
	private long sourceId;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
	private Date dateTime;
    //private ZonedDateTime dateTime;
	
	private GameTeamDTO visitor;
	private GameTeamDTO home;
	
	private LeagueDTO league;
	
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
	
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	
	public GameTeamDTO getVisitor() {
		return visitor;
	}
	public void setVisitor(GameTeamDTO visitor) {
		this.visitor = visitor;
	}
	public GameTeamDTO getHome() {
		return home;
	}
	public void setHome(GameTeamDTO home) {
		this.home = home;
	}
	public LeagueDTO getLeague() {
		return league;
	}
	public void setLeague(LeagueDTO league) {
		this.league = league;
	}
}
