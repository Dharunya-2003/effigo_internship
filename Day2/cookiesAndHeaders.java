package Day2;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;
public class cookiesAndHeaders 
{
	@Test(priority=1)
	void testCookies()
	{
		given()
			
		
		.when()
		 	.get("https://www.google.com/");
		 	
		
		//.then()
			//.cookie("AEC","AVcja2fZetObRrnSPbOOGmCBbSNbmTnxdk8l5I67NI3cn0We0A6dX2hpOTU")
			//.log().all();
			
		 
		
	}
	
	@Test(priority=2)
	void getCookies()
	{
		Response res =given()
		 
			
		
		.when()
		 	.get("https://www.google.com/");
		
		// get single cookie response
		// String cookie_value=res.getCookie("AEC");
		// System.out.print("value of the cookie is==========>> " +cookie_value );
		
		//get all cookie info
		
		Map<String,String >cookies_values=res.getCookies();
		//System.out.println(cookies_values.keySet());
		
		
		for(String k: cookies_values.keySet())
		{
			String cookies_value=res.getCookie(k);
			System.out.println(k+ "    "+cookies_value);
		}
		
		
	
		
		 	
		
		
		 
		
	}

}
