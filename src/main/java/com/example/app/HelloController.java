package com.example.app;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Controller for handling HTTP requests to the '/hello' path.
 */
@Path="/hello"
public class HelloController {

    /**
     * Returns a simple 'Hello World' message.
     * @return the 'Hello World' message
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String helloWorld() {
        return "Hello World";
    }
}
