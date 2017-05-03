package com.melvin.tonia.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.melvin.tonia.model.MyDate;

@Path("/date/{dateParam}")
public class DateResource {	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getDateValue(@PathParam ("dateParam") MyDate date){
		
		return date.toString();
	}
	
}
