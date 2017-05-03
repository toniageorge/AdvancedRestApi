package com.melvin.tonia.rest;

import java.util.Calendar;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("shortdateWritter")
public class MyResource5 {


@GET
@Produces(value={MediaType.TEXT_PLAIN, "text/shortDate"})
	public Date printDate(){
		
		return Calendar.getInstance().getTime();
	}

}