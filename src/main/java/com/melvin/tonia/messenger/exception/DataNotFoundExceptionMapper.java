package com.melvin.tonia.messenger.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.melvin.tonia.messenger.model.ErrorMessage;
@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException> {

	public Response toResponse(DataNotFoundException exception) {

		ErrorMessage errorMessage = new ErrorMessage(Status.NOT_FOUND.toString(), exception.getMessage(),"http://DatanotFound")	;
			return Response.status(Status.NOT_FOUND).entity(errorMessage).build();
		
	}

}
