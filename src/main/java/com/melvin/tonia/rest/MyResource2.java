package com.melvin.tonia.rest;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/test2Forscope")
@Singleton
public class MyResource2 {

	private int count;
	@GET
	@Produces(MediaType.TEXT_PLAIN)
		public String sayHi(){
			count =  count+1;
			return "It worked and called  "+count+"times";
		}
}
