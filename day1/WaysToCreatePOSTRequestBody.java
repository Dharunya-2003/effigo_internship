package day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;



import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class WaysToCreatePOSTRequestBody {
	
	
	//1) POST request body using Hashmap
	
	//@Test(priority=1)
	void testPostusingHashMap()
	{
	HashMap data=new HashMap();
	data.put("name", "riyan");
	data.put("location", "france");
	data.put("phone", "123456");
	
	String courseArr[]= {"C","C++"};
	
	data.put("courses", courseArr);
	
	given()
	.contentType("application/json")
	.body(data)
	.when()
	.post("http://localhost:3000/students")
	.then()
	.statusCode(201)
	.body("name",equalTo("akshay"))
	.body("location",equalTo("france"))
	.body("phone",equalTo("123456"))
	.body("courses[0]",equalTo("C"))
	.body("courses[1]",equalTo("C++"))
	
	.log().all();
	
	}
	//2) POST request body using org.json
	
	@Test(priority=1)
	void testPostusingJSONlibrary()
	{
		JSONObject data=new JSONObject();
		data.put("name","riyan");
		data.put("location","france");
		data.put("phone","1234455");
		String coursearr[]= {"C","C++"};
		data.put("courses", coursearr); 
	
	
	given()
	.contentType("application/json")
	.body(data.toString())
	.when()
	.post("http://localhost:3000/student")
	.then()
	.statusCode(201)
	.body("name",equalTo("akshay"))
	.body("location",equalTo("france"))
	.body("phone",equalTo("1234455"))
	.body("courses[0]",equalTo("C"))
	.body("courses[1]",equalTo("C++"))
	
	.log().all();
	
	}
	
	//3) POST request body using POJO
	
			//@Test(priority=1)
			void testPostusingPOJO()
			{
				Pojo_postRequest data=new Pojo_postRequest();
				data.setName("riyan");
				data.setLocation("france");
				data.setPhone("1234455");
				String coursearr[]= {"C","C++"};
				data.setCourses(coursearr);
						
			
			
			given()
			.contentType("application/json")
			.body(data)
			.when()
			.post("http://localhost:3000/students")
			.then()
			.statusCode(201)
			.body("name",equalTo("riyan"))
			.body("location",equalTo("france"))
			.body("phone",equalTo("1234455"))
			.body("courses[0]",equalTo("C"))
			.body("courses[1]",equalTo("C++"))
			
			.log().all();
			
			}
			//4) POST request body using external json file
			
				@Test(priority=1)
				void testPostusingExternalJSONFile() throws FileNotFoundException
				{
					File f=new File(".\\body.json");
					FileReader fr=new FileReader(f);
					JSONTokener jt=new JSONTokener(fr);
					
					JSONObject data=new JSONObject(jt);
							 
				
				
				given()
				.contentType("application/json")
				.body(data.toString())
				.when()
				.post("http://localhost:3000/students")
				.then()
				.statusCode(201)
				.body("name",equalTo("riyan"))
				.body("location",equalTo("france"))
				.body("phone",equalTo("1234455"))
				.body("courses[0]",equalTo("C"))
				.body("courses[1]",equalTo("C++"))
				
				.log().all();
				
				}
}
