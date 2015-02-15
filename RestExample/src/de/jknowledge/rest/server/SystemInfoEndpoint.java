package de.jknowledge.rest.server;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.jknowledge.rest.dto.SystemDto;

@Path("/systemInfo")
public class SystemInfoEndpoint {

	@Path("/xml")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public SystemDto getSystemInfoAsXml() {
		String javaVersion = System.getProperty("java.version");
		String os = System.getProperty("os.name");
		SystemDto systemObj = new SystemDto(javaVersion, os);
		return systemObj;
	}
	
	@Path("/json")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public SystemDto getSystemInfoAsJson() {
		String javaVersion = System.getProperty("java.version");
		String os = System.getProperty("os.name");
		SystemDto systemObj = new SystemDto(javaVersion, os);
		return systemObj;
	}
	
}
