package ru.avakyants.java.bball.data.nba;

import java.util.Map;

public class NBAGame {
	long id;
	String gameUrl;
	int seasonId;
	String date;
	String time;
	String arena;
	String city;
	String state;
	String country;
	String homeStartDate;
	String homeStartTime;
	String visitorStartDate;
	String visitorStartTime;
	String previewAvailable;
	String recapAvailable;
	String notebookAvailable;
	String tntOt;
	String buzzerBeater;
	Map<String,String> ticket;
	Map<String,String> periodTime;
	
}
