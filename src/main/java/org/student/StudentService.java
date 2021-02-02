package org.student;

import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;


@Path("/v2")
@RegisterRestClient
public interface StudentService{


    @GET
    @Path("/name/{name}")
    Set<Student> getStudent(@PathParam String name);

    @POST
    @Path("/name/{name}")
    Set<Student> saveStudent(@PathParam String name);


}