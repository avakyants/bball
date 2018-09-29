package ru.avakyants.java.bball.restapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ru.avakyants.java.bball.data.NBAGamesByDateData;
import ru.avakyants.java.bball.model.*;
import ru.avakyants.java.bball.model.dto.GameDTO;
import ru.avakyants.java.bball.model.dto.GameTeamDTO;
import ru.avakyants.java.bball.model.dto.LeagueDTO;
import ru.avakyants.java.bball.model.dto.TeamDTO;
import ru.avakyants.java.bball.model.test.SampleData;

@Path("/hello")
public class Hello {

	
	/*
	 * преобразует ответ из объекта в json
	 * */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<GameDTO> sayPlainTextHello() {
		
		LeagueDTO league = new LeagueDTO();
		league.setId(1L);
		league.setName("Euroleague");
		
		TeamDTO teamHome = new TeamDTO();
		teamHome.setId(1L);
		teamHome.setKey("CSKA");
		teamHome.setName("Central Sport Club of Army");
		
		TeamDTO teamVisitor = new TeamDTO();
		teamVisitor.setId(2L);
		teamVisitor.setKey("RMD");
		teamVisitor.setName("BC Real Madrid");
		
		GameTeamDTO home = new GameTeamDTO();
		home.setId(1L);
		home.setTeam(teamHome);
		home.setScore((short)87);
		teamHome.getGameTeamList().add(home);
		
		GameTeamDTO visitor = new GameTeamDTO();
		visitor.setId(2L);
		visitor.setTeam(teamVisitor);
		visitor.setScore((short)81);
		teamVisitor.getGameTeamList().add(visitor);
		
		GameDTO g1 = new GameDTO();
		g1.setId(1L);
		//g1.setDateTime(ZonedDateTime.of(2018, 2, 2, 19, 0, 0, 0, ZoneId.of("Europe/Moscow")));
		
		ZonedDateTime zdt = ZonedDateTime.of(2018, 2, 2, 19, 0, 0, 0, ZoneId.of("Europe/Moscow"));
		g1.setDateTime(Date.from(zdt.toInstant()));
		g1.setSourceId(12345678901L);
		g1.setHome(home);
		g1.setVisitor(visitor);
		g1.setLeague(league);
		
		List<GameDTO> games = new  ArrayList<>();
		games.add(g1);
		
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
	public Response addData(GameDTO game) {		
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
/*	@POST
	@Path("/testobj")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response testDataObj(SampleData data) {
		String result = "OK: "+data.getSportsContent().getGames().get(1).getId();
		return Response.status(201).entity(result).build();
	}
	
	@POST
	@Path("/testnba")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response testNBAGameList(NBAGamesByDateData data) {
		
		String result = "OK: "+data.getSportsContent().getGames().getGames().get(0).getHome().getKey();
		return Response.status(201).entity(result).build();
	}
*/	
}
