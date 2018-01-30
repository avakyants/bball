package ru.avakyants.java.bball.model.test;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties({ "test" })
public class SportsMeta {
	
	String dateTime;
	Map<String,String> seasonMeta;

	public String getDateTime() {
		return this.dateTime;
	}
	
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	
	@JsonProperty("season-meta")
	public Map<String,String> getSeasonMeta(){
		return this.seasonMeta;
	}
	
	@JsonProperty("season-meta")
	public void setSeasonMeta(Map<String,String> seasonMeta) {
		this.seasonMeta = seasonMeta;
	}
	
}
