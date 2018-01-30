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
import ru.avakyants.java.bball.model.test.SampleData;

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
	
	/*тестируем генерацию json на основе сложного объекта, в объектными полями 
	 * на основе тестовой модели ru.avakyants.java.bball.model.test.SampleData
	 * 
	 * {
			"sportsContent":{
				"meta":{
					"dateTime":"20180130 1116",
					"seasonMeta":{
						"prop1":"value1",
						"prop2":"value2",
						"prop3":"value3"
					},
					"test":"1212" -- ignored!!!!
				},
				"games":[
					{"id":1,"home":"GSW","visitor":"BOS"},
					{"id":1,"home":"LAL","visitor":"BOS"},
					{"id":1,"home":"POR","visitor":"MIN"},
					{"id":1,"home":"HOU","visitor":"CHI"}
				]
			}
		}
	 * 
	 * */
	@POST
	@Path("/testobj")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response testDataObj(SampleData data) {
		String result = "OK: "+data.getSportsContent().getGames().get(1).getId();
		return Response.status(201).entity(result).build();
	}
	
}
