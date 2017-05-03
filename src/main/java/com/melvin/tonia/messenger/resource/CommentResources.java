package com.melvin.tonia.messenger.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.melvin.tonia.messenger.model.Comment;
import com.melvin.tonia.messenger.model.Message;
import com.melvin.tonia.messenger.service.CommentService;
import com.melvin.tonia.messenger.service.MessageService;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CommentResources {
	
	CommentService commentService = new CommentService();
@GET

	public  List<Comment> getAllComments(@PathParam ("messageId") long messageId ){
		
		return commentService.getAllComments(messageId);
	}
@GET
@Path("/{commentId}")
	public Comment getComment(@PathParam ("messageId") long messageId,@PathParam ("commentId") long commentId ){
		
		return commentService.getComment(messageId, commentId);
	}

@POST

public Comment addComment(@PathParam ("messageId") long messageId,Comment comment ){
	
	return commentService.addComment(messageId, comment);
}

@PUT
@Path("/{commentId}")

public Comment updateComment(@PathParam ("messageId") long messageId,@PathParam ("commentId") long commentId ,Comment comment ){
	comment.setId(commentId);
	return commentService.updateComment(messageId, comment);
}
@DELETE
@Path("/{commentId}")
public void  deleteComment(@PathParam ("messageId") long messageId,@PathParam ("commentId") long commentId){	
	commentService.deleteComment(messageId, commentId);
}
}