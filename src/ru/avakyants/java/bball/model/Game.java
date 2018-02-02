package ru.avakyants.java.bball.model;

import java.time.ZonedDateTime;

public class Game {
	private long id;
	private long sourceId;
	private ZonedDateTime dateTime;
	private SeasonStage seasonStage;
	private Arena arena;
	private int periodCnt;
	private GameTeam visitor;
	private GameTeam home;
}
