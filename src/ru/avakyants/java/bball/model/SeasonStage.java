package ru.avakyants.java.bball.model;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SeasonStage {
	
	private long id;
	private String name;
	
	@JsonIgnore
	private LocalDate startDate;
	private String startDateString;
	
	@JsonIgnore
	private LocalDate endDate;
	private String endDateString;
	
	@JsonManagedReference private Season season;
	
	@JsonBackReference
	private List<Game> gameList = new ArrayList<>();
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDateString = DateTimeFormatter.ISO_LOCAL_DATE.format(startDate);
		this.startDate = startDate;		
	}
	
	@JsonProperty("startdate")
	public String getStartDateString() {
		return this.startDateString;
	}
	@JsonProperty("startdate")
	public void setStartDateString(String dateString) {
		this.startDate = LocalDate.parse(dateString, DateTimeFormatter.ISO_LOCAL_DATE);
		this.startDateString = dateString;		
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDateString = DateTimeFormatter.ISO_LOCAL_DATE.format(endDate);
		this.endDate = endDate;
	}
	
	@JsonProperty("enddate")
	public String getEndDateString() {
		return this.endDateString;
	}
	@JsonProperty("enddate")
	public void setEndDateString(String dateString) {
		this.endDate = LocalDate.parse(dateString, DateTimeFormatter.ISO_LOCAL_DATE);
		this.endDateString = dateString;		
	}
	
	
	public Season getSeason() {
		return season;
	}
	public void setSeason(Season season) {
		this.season = season;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Game> getGameList() {
		return gameList;
	}
	public void setGameList(List<Game> gameList) {
		this.gameList = gameList;
	}

}
