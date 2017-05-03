package com.melvin.tonia.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.melvin.tonia.messenger.model.Message;

public class RestApiClient1 {

	
	public static void main(String args[]){
		
		Client client = ClientBuilder.newClient();
		WebTarget wtarget =client.target("http://localhost:8080/adavncedRestApiClient/api/messages/1");
		Builder builder= wtarget.request();
		Response response =builder.get();
		Message message = response.readEntity(Message.class);
		System.out.println(message.getMessage());
	}
	
	
}
