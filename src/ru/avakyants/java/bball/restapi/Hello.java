package ru.avakyants.java.bball.restapi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Hello {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayPlainTextHello() {
		return "{\"id\":1,\"visitor\":\"CLE\",\"home\":\"GSW\"}";
	}
	
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
	
	
}
