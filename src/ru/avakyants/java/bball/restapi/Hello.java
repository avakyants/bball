package ru.avakyants.java.bball.restapi;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ru.avakyants.java.bball.model.Game;

@Path("/hello")
public class Hello {

	
	/*
	 * преобразует ответ из объекта в json
	 * */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Game> sayPlainTextHello() {
		
		Game g1 = new Game();
		g1.setId(1);
		g1.setHome("GSW");
		g1.setVisitor("CLE");
		
		Game g2 = new Game();
		g2.setId(2);
		g2.setHome("GSW");
		g2.setVisitor("BOS");
		
		Game g3 = new Game();
		g3.setId(3);
		g3.setHome("LAL");
		g3.setVisitor("NO");		
		
		List<Game> games = List.of(g1,g2,g3);
		
		return games;
	}
	
	/*
	 *  Возвращает в виде String без преобразований
	 * 
	 * @GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayPlainTextHello() {
		return "{\"id\":1,\"visitor\":\"CLE\",\"home\":\"GSW\"}";
	}*/
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{gid}")
	public String sayParamHello(@PathParam("gid") long gameId) {
		return "Request for Game id:"+gameId;
	}
	
	@Path("/arr")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayArrayHello() {
		return "[{\"id\":1,\"visitor\":\"CLE\",\"home\":\"GSW\"},{\"id\":2,\"visitor\":\"BOS\",\"home\":\"LAL\"}]";
	}
	
	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addData(Game game) {		
		String result = "Game added: "+game.getId();
		return Response.status(201).entity(result).build();
	}
	
	
}
