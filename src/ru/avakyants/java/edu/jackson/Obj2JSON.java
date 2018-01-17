package ru.avakyants.java.edu.jackson;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ru.avakyants.java.bball.model.Game;

public class Obj2JSON {

	public static void main(String[] args) {
		Game game = new Game();
		game.setId(2);
		game.setHome("LAL");
		game.setVisitor("BOS");
		
		ObjectMapper mapper = new ObjectMapper();
		
		//write to String
		String json = "";
		try {
			json = mapper.writeValueAsString(game);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Object as JSON: "+json);
		
		//Array of Objects as JSON
		Game g1 = new Game();
		g1.setId(3);
		g1.setHome("CHI");
		g1.setVisitor("UTA");
		
		Game g2 = new Game();
		g2.setId(4);
		g2.setHome("MIN");
		
		List<Game> gameArr = new ArrayList<>();
		gameArr.add(g1);
		gameArr.add(g2);
		
		try {
			json = mapper.writeValueAsString(gameArr);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		System.out.println("Array of Objects as JSON: "+json);
		
	}

}
