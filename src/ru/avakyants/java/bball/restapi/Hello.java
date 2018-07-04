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
import ru.avakyants.java.bball.model.test.SampleData;

@Path("/hello")
public class Hello {

	
	/*
	 * преобразует ответ из объекта в json
	 * */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Game> sayPlainTextHello() {
		
		Country country = new Country();
		country.setId(7L);
		country.setName("Russia");
		
		CountryState state = new CountryState();
		state.setId(1L);
		state.setName("Moscow");
		state.setCountry(country);
		country.getCountryStateList().add(state);
		
		City city  =new City();
		city.setId(1L);
		city.setName("Moscow");
		city.setCountryState(state);
		state.getCityList().add(city);
		
		Arena arena = new Arena();
		arena.setId(1L);
		arena.setName("USC CSKA");
		arena.setCity(city);
		city.getArenaList().add(arena);
		
		League league = new League();
		league.setId(1L);
		league.setName("Euroleague");
		
		Season season = new Season();
		season.setId(1L);
		season.setLeague(league);
		
		SeasonStage stage = new SeasonStage();
		stage.setId(1L);
		stage.setName("Regular Season");
		stage.setSeason(season);
		stage.setStartDate(LocalDate.of(2017, 9, 1));
		stage.setEndDate(LocalDate.of(2018, 5, 31));
		season.getStageList().add(stage);
		
		Team teamHome = new Team();
		teamHome.setId(1L);
		teamHome.setKey("CSKA");
		teamHome.setName("Central Sport Club of Army");
		teamHome.setCity(city);
		
		Team teamVisitor = new Team();
		teamVisitor.setId(2L);
		teamVisitor.setKey("RMD");
		teamVisitor.setName("BC Real Madrid");
		teamVisitor.setCity(null);//lazy create Real Madrid city
		
		GameTeam home = new GameTeam();
		home.setId(1L);
		home.setTeam(teamHome);
		home.setScore((short)87);
		teamHome.getGameTeamList().add(home);
		
		GameTeam visitor = new GameTeam();
		visitor.setId(2L);
		visitor.setTeam(teamVisitor);
		visitor.setScore((short)81);
		teamVisitor.getGameTeamList().add(visitor);
		
		Game g1 = new Game();
		g1.setId(1L);
		g1.setArena(arena);
		//g1.setDateTime(ZonedDateTime.of(2018, 2, 2, 19, 0, 0, 0, ZoneId.of("Europe/Moscow")));
		
		ZonedDateTime zdt = ZonedDateTime.of(2018, 2, 2, 19, 0, 0, 0, ZoneId.of("Europe/Moscow"));
		g1.setDateTime(Date.from(zdt.toInstant()));
		g1.setSourceId(12345678901L);
		g1.setSeasonStage(stage);
		g1.setHome(home);
		g1.setVisitor(visitor);
		
		List<Game> games = new  ArrayList<>();
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
