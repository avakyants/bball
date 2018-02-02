package ru.avakyants.java.bball.model;

import java.time.LocalDate;
import java.util.List;

public class Season {
	
	private long id;
	private LocalDate startDate;
	private LocalDate endDate;
	private League league;
	private List<SeasonStage> stageList;
	private List<Game> gameList;
}
