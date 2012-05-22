package com.impetus.xamry.examples.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/todo")
public class ToDoService
{

    @GET
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public ToDo getToDo()
    {
        System.out.println("getToDo called");
        ToDo todo = new ToDo();
        todo.setSummary("My ToDo");
        todo.setDescription("This is my first todo");
        return todo;
    }
}
