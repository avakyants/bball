package ru.avakyants.java.bball.data.nba;

import java.util.List;
import java.util.Map;

public class NBAGameLinescore {
	
	List<Map<String,String>> period;
	
	public List<Map<String,String>> getPeriod(){
		return this.period;
	}
	
	public void setPeriod(List<Map<String,String>> period) {
		this.period = period;
	}

}
