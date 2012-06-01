package com.impetus.xamry.examples.rest;

import javax.ws.rs.client.Client;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.ClientFactory;


public class RESTClient
{

    public static void main(String[] args)
    {
        
        Client client = ClientFactory.newClient();
       
        // Get plain text
        System.out.println(client.target("http://localhost:8080/REST-examples/rest/hello").request(MediaType.TEXT_PLAIN).get(String.class));
        // Get XML
        System.out.println(client.target("http://localhost:8080/REST-examples/rest/hello").request(MediaType.TEXT_XML).get(String.class));
        // The HTML
        System.out.println(client.target("http://localhost:8080/REST-examples/rest/hello").request(MediaType.TEXT_HTML).get(String.class));
        
        System.out.println(client.target("http://localhost:8080/REST-examples/rest/todo").request(MediaType.APPLICATION_XML).get(String.class));
        
        System.out.println(client.target("http://localhost:8080/REST-examples/rest/todo").request(MediaType.APPLICATION_JSON).get(String.class));
        
        
    }
}
