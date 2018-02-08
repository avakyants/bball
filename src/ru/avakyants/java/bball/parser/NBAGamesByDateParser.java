package ru.avakyants.java.bball.parser;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;

import ru.avakyants.java.bball.data.in.NBAGamesByDateData;

public class NBAGamesByDateParser {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		//String out = new Scanner(new URL("http://data.nba.com/data/5s/json/cms/noseason/scoreboard/20180129/games.json").openStream(), "UTF-8").useDelimiter("\\A").next();
		//System.out.println(out);
		
		ObjectMapper mapper = new ObjectMapper();
		NBAGamesByDateData data = mapper.readValue(new URL("http://data.nba.com/data/5s/json/cms/noseason/scoreboard/20180129/games.json"), NBAGamesByDateData.class);
		String result = "OK: "+data.getSportsContent().getGames().getGames().get(0).getHome().getKey();
		System.out.println(result);
		
	}

}
