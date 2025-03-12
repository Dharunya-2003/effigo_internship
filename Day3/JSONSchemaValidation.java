package Day3;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

public class JSONSchemaValidation {
    @Test
    public void jsonSchemaValidation() {
        given()
        .when()
            .get("http://localhost:4000/books") 
        .then()
            .assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("storjsonschema.json"));
    }

}
