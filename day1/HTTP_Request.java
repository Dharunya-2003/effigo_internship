package day1;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
public class HTTP_Request 
{
	int id;
	@Test(priority=1)
	void getuser() {
	given()
	
	.when()
		.get("https://reqres.in/api/users?page=2")
		
	 .then()
	 	.statusCode(200)
	 	.body("page",equalTo(2))
	 	.log().all();

}
	@Test(priority=2)
   void createuser()
   {
	  HashMap data=new HashMap();
	  data.put("name", "Dharunya");
	  data.put("job", "intern");
	  
	  id=given()
			 
			.contentType("application/json")
			.body(data)
			
			.when()
				.post("https://reqres.in/api/users")
				.jsonPath().getInt("id");
				
   }
	@Test(priority=3,dependsOnMethods= {"createuser"})
	
	void  updateuser()
	{
		 HashMap data=new HashMap();
		  data.put("name", "Dharunya");
		  data.put("job", "fulltime");
		  
		  given()
				 .contentType("application/json")
				.body(data)
				
				.when()
					.put("https://reqres.in/api/users/"+id)
				.then()
				 	.statusCode(200)
				 	
				 	.log().all();
	}
	
	@Test(priority=4,dependsOnMethods= {"createuser"})
	void deleteUser()
	{
		given()
		.when()
		  .delete("https://reqres.in/api/users/"+id)
		.then()
		.statusCode(204)
	 	
	 	.log().all();
}
	}
	
	

