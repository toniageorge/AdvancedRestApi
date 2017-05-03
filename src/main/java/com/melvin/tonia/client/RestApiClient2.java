package com.melvin.tonia.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.core.Response;

import com.melvin.tonia.messenger.model.Message;

public class RestApiClient2 {

public static void main(String args[]){
		
		Client client = ClientBuilder.newClient();
		Response response = client.target("http://localhost:8080/adavncedRestApiClient/api/messages/2").request().get();
		
		Message message = response.readEntity(Message.class);
		System.out.println(message.getMessage());
	}
}
