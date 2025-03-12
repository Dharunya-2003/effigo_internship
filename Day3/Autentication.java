package Day3;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.OAuthSignature;
import io.restassured.specification.RequestSpecification;

public class Autentication
{
	//@Test(priority=1)
	void testBasicAuthication()
	{
		given()
		 .auth().basic("postman","password")
		
		.when()
		.get("https://postman-echo.com/basic-auth")
		
		
		.then()
		
		    .statusCode(200)
		    .body("authenticated",equalTo(true))
		    .log().all();
		
	
	}
		
	
	//@Test(priority=2)
	void testDigestAuthication()
	{
		given()
		 .auth().digest("postman","password")
		
		.when()
		.get("https://postman-echo.com/basic-auth")
		
		
		.then()
		
		    .statusCode(200)
		    .body("authenticated",equalTo(true))
		    .log().all();
		
	
	}
	

	
	
	//@Test(priority=1)
	void testPreemptiveAuthication()
	{
		given()
		 .auth().preemptive().basic("postman","password")
		
		.when()
		.get("https://postman-echo.com/basic-auth")
		
		
		.then()
		
		    .statusCode(200)
		    .body("authenticated",equalTo(true))
		    .log().all();
		
	
	}

	//@Test
	void  testBearerTokenAuthentication()
	{
		String bearerToken="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";
	    given()
	     .header("Authorization","Bearer "+ bearerToken)
	    .when()
	     .get("https://api.github.com/user/repos")
	           
	    .then()
	    .statusCode(200)
	    
	    .log().all();
	
	
	}
	
	
	//@Test
	void testOAuth1Authentication() {
        RequestSpecification request = RestAssured.given()
            .auth()
            .oauth("consumerKey", "consumerSecret", "accessToken", "tokenSecret", OAuthSignature.HEADER);

        request.when()
            .get("https://your-api-url.com")
            .then()
            .statusCode(200)
            .log().all();
    }
	
	//@Test
	void testOAuth2Authentication()
	{
		 given()
	     .auth().oauth2("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")
	    .when()
	     .get("https://api.github.com/user/repos")
	           
	    .then()
	    .statusCode(200)
	    
	    .log().all();
	}
	@Test
	void testAPIKeyAuthentication()
	{
		//method1
		/*given()
		.queryParam("appid","fe9c5cddb7e01d747b4611c3fc9eaf2c")
		.when()
		.get("https://api.openweathermap.org/data/2.5/forecast/daily?q=Delhi&units=metric&cnt=7")
		.then()
		.statusCode(200)
		.log().all();
		*/
		//method2
		given()
		.queryParam("appid","fe9c5cddb7e01d747b4611c3fc9eaf2c")
		.pathParam("mypath","data/2.5/forecast/daily")
		.queryParam("q","Delhi")
		.queryParam("units","metric")
		.queryParam("cnt","7")
		
		.when()
		.get("https://api.openweathermap.org/{mypath}")
		.then()
		.statusCode(200)
		.log().all();
	}
	
	
	
	
	
}
