package ru.avakyants.java.bball.restapi;

import java.net.URI;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;
import org.glassfish.jersey.client.ClientConfig;

public class ClientHello {

	public static void main(String[] args) {
		ClientConfig conf = new ClientConfig();
		Client client = ClientBuilder.newClient(conf);
		WebTarget target = client.target(getBaseURI());
		
		System.out.println("Server at "+getBaseURI().toString()+" response:");
		System.out.println(target.path("api").path("hello").request().accept(MediaType.APPLICATION_JSON).get(String.class));
	}
	
	private static URI getBaseURI() {
		return UriBuilder.fromUri("http://localhost:8080/bballREST").build();
	}

}
