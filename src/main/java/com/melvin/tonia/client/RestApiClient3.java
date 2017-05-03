package com.melvin.tonia.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.melvin.tonia.messenger.model.Message;

public class RestApiClient3 {
	public static void main(String args[])
	{
	Client client = ClientBuilder.newClient();
	Message message = client.target("http://localhost:8080/adavncedRestApiClient/api/messages/2")
			.request(MediaType.APPLICATION_JSON)
			.get(Message.class);	
	System.out.println(message.getMessage());
	
	}
}

