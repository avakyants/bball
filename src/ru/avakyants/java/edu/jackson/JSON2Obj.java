package ru.avakyants.java.edu.jackson;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import ru.avakyants.java.bball.model.dto.GameDTO;

public class JSON2Obj {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		//String json = "{\"id\":1,\"visitor\":\"CLE\",\"home\":\"GSW\"}";
		
		GameDTO game = null;
		try {
			game = mapper.readValue(new URL("http://localhost:8080/bballREST/api/hello"), GameDTO.class);
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
		
		
		//ARRAY FROM JSON
		List<GameDTO> list = new ArrayList<GameDTO>();
		try {
			list = mapper.readValue(new URL("http://localhost:8080/bballREST/api/hello/arr"), new TypeReference<List<GameDTO>>(){});
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Game List size:"+list.size());
		System.out.println("Game 0 id="+list.get(0).getId());
		
	}

}
