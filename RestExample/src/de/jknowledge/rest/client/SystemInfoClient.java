package de.jknowledge.rest.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.client.ClientConfig;

import de.jknowledge.rest.dto.SystemDto;

public class SystemInfoClient {
	
	public static void main(String[] args)  {
		ClientConfig clientConfig = new ClientConfig();
		Client client = ClientBuilder.newClient(clientConfig);
		WebTarget webTarget = client.target("http://localhost:8080/RestExample/rest");
		
		WebTarget xmlResource = webTarget.path("systemInfo/xml");
		SystemDto systemInfoXml = xmlResource
				.request(MediaType.APPLICATION_XML)
				.get(SystemDto.class);
		System.out.println("XML: " + systemInfoXml.toString());
		
		WebTarget jsonResource = webTarget.path("systemInfo/json");
		SystemDto systemInfoJson = jsonResource
				.request(MediaType.APPLICATION_JSON)
				.get(SystemDto.class);
		
		System.out.println("JSON: " + systemInfoJson.toString());

	}

}
