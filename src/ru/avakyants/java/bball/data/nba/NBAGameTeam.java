package ru.avakyants.java.bball.data.nba;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NBAGameTeam {
	long id;
	String key;
	String city;
	String abbreviation;
	String nickname;
	String urlName;
	String code;
	short score;
	NBAGameLinescore linescores;
	
	public long getId() {
		return this.id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	@JsonProperty("team_key")
	public String getKey() {
		return this.key;
	}
	
	@JsonProperty("team_key")
	public void setKey(String key) {
		this.key = key;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getAbbreviation() {
		return this.abbreviation;
	}
	
	public void setAbbreviation(String a) {
		this.abbreviation = a;
	}
	
	public String getNickname() {
		return this.nickname;
	}
	
	public void setNickname(String nick) {
		this.nickname = nick;
	}

	@JsonProperty("url_name")
	public String getUrlName() {
		return urlName;
	}
	
	@JsonProperty("url_name")
	public void setUrlName(String urlName) {
		this.urlName = urlName;
	}

	@JsonProperty("team_code")
	public String getCode() {
		return code;
	}

	@JsonProperty("team_code")
	public void setCode(String code) {
		this.code = code;
	}

	public short getScore() {
		return score;
	}

	public void setScore(short score) {
		this.score = score;
	}

	public NBAGameLinescore getLinescores() {
		return linescores;
	}

	public void setLinescores(NBAGameLinescore linescores) {
		this.linescores = linescores;
	}
}
