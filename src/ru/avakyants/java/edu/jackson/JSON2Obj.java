package ru.avakyants.java.edu.jackson;

import java.io.IOException;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

import ru.avakyants.java.bball.model.Game;

public class JSON2Obj {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		//String json = "{\"id\":1,\"visitor\":\"CLE\",\"home\":\"GSW\"}";
		
		Game game = null;
		try {
			game = mapper.readValue(new URL("http://localhost:8080/bballREST/api/hello"), Game.class);
			//FROM STRING
			//game = mapper.readValue(json, Game.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(game!=null) {
			System.out.println("Game id="+game.getId()+" visitor:"+game.getVisitor()+" home:"+game.getHome());
		}else {
			System.out.println("Error");
		}
		
	}

}
