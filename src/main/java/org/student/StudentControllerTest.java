package org.student;

import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.Test;
import io.quarkus.test.junit.QuarkusTest;
import static io.restassured.RestAssured.given;



@QuarkusTest
public class StudentControllerTest {
    


    @Test
    public void testStudentNameEndpoint() {
        given()
          .when().get("/student/name/victor")
          .then()
             .statusCode(200)
             .body("$.size()", is(1),
                     "[0].mark", is(40),
                     "[0].grade", is('D')
                     
             );
    }



}
