package com.melvin.tonia.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
@Path("/{pathParam}/test3")
public class MyResource3 {

@PathParam("pathParam")  private String pathParam;
@QueryParam( "QueryParam") private String queryParam;
@GET
@Produces(MediaType.TEXT_PLAIN)
	public String sayHi(){
		
		return "he Tonia path param is" +pathParam+ "and query param is"+queryParam;
	}

}
