package com.melvin.tonia.rest;

import java.util.Calendar;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("dateWritter")
public class MyResource4 {


@GET
@Produces(MediaType.TEXT_PLAIN)
	public Date printDate(){
		
		return Calendar.getInstance().getTime();
	}

}
