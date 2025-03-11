package Day2;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class loginDemo
{
	@Test
	void testlos()
	{
		given()
		
		.when()
		    .get("https://reqres.in/api/users?page=2")
		.then()
		  //.log().body();
		//.log().headers();	
		.log().all();
		}

}
