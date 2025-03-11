package Day2;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONArray;
import org.json.JSONObject;

public class ParsingJsonResponseData 
{
	//@Test
	void testJsonResponse()
	{
		/*
		
		//approach 1
		
		given()
		 //.contentType("contentType.JSON")
		
		.when()
		    .get("http://localhost:3000/books")
		.then()
		    .statusCode(200)
		    .header("Content-Type", "application/json")
		    .body("[4].title",equalTo("The Great Gatsby"));
			
		*/
		
		//approach 2
		Response res = given()
                .contentType("application/json") 
            .when()
                .get("http://localhost:3000/books"); 
        
       
        Assert.assertEquals(res.getStatusCode(), 200);
        
        
        String bookname=res.jsonPath().get("[4].title").toString();
        Assert.assertEquals(bookname, "The Great Gatsby");
    }
	@Test
	void testJsonResponseBodyData() {
        Response res = given()
                .accept("application/json") 
            .when()
                .get("http://localhost:3000/books"); 

        // Convert response body to JSON Array
        JSONArray jsonArray = new JSONArray(res.getBody().asString());

       boolean status=false;
        for (int i = 0; i < jsonArray.length(); i++) {
            String bookTitle = jsonArray.getJSONObject(i).getString("title");
            System.out.println(bookTitle);
            
            if(bookTitle.equals("The Great Gatsby"))
            {
            	status =true;
            	break;
            }
        }
     Assert.assertEquals(status, true);
     
     
     // validation for the total price of books
     double totalprice=0;
     for (int i = 0; i < jsonArray.length(); i++) {
         String price = jsonArray.getJSONObject(i).get("price").toString();
     
         totalprice=totalprice + Double.parseDouble(price);
     }
         
     System.out.println("total price of books =========>"+totalprice);
     Assert.assertEquals(totalprice,50.46);
     
    }
	
}
		