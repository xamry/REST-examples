package com.impetus.xamry.examples.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

@Path("/crud")
public class CRUDResource
{
    
    @Context
    UriInfo uriInfo;
    @Context
    Request request;

    @GET
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public Object find()
    {
        System.out.println("find called");
        Employee emp = new Employee();
        emp.setId("1");
        emp.setName("Amresh");
        return emp;        
    }
}
