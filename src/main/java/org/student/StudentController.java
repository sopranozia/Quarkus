package org.student;

// import java.util.Collections;
// import java.util.LinkedHashMap;
import java.util.Set;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
// import javax.ws.rs.Produces;
// import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("/student")
public class StudentController {


    @Inject
    @RestClient
    StudentService studentService;

    /*
    private Set<Student> students = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    public StudentController() {
        students.add(new Student("victor",50,'D'));
        students.add(new Student("alton", 30,'F'));
        students.add(new Student("john", 37,'D'));
        students.add(new Student("sipho", 56,'C'));
        students.add(new Student("lucky", 60,'C'));
        students.add(new Student("mohamed", 71,'A'));
        students.add(new Student("rosa", 45,'D'));
        students.add(new Student("vanessa", 33,'D'));
        students.add(new Student("ricardo", 39,'D'));
        students.add(new Student("franklin", 40,'D'));


    }

*/
/*
    @POST
    @Path("/name/{name}")    
    public Set<Student> add(Student student) {
        students.add(student);
        return students;
    }
 */
    @GET
    @Path("/name/{name}")
    public Set<Student> name(@PathParam String name) {
        return studentService.getStudent(name);
    }
   
    @POST
    @Path("/name/{name}")
    public Set<Student> name1(@PathParam String name) {
        return studentService.saveStudent(name);
    }



/*
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }


    */



}