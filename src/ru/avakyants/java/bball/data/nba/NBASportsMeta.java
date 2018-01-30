package ru.avakyants.java.bball.data.nba;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties({ "next" })
public class NBASportsMeta {
	
	String dateTimeString;
	Map<String,String> seasonMeta;
	
	@JsonProperty("date_time")
	public String getDateTimeString() {
		return this.dateTimeString;
	}
	
	@JsonProperty("date_time")
	public void setDateTimeString(String dts) {
		this.dateTimeString = dts;
	}
	
	@JsonProperty("season_meta")
	public Map<String,String> getSeasonMeta(){
		return this.seasonMeta;
	}
	
	@JsonProperty("season_meta")
	public void setSeasonMeta(Map<String,String> meta) {
		this.seasonMeta = meta;
	}

}
