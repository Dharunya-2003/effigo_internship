package Day3;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import day1.Pojo_postRequest;

public class SerlizationandDeserlization 
{
	
    @Test
	void covertpojo2Json() throws JsonProcessingException
	{
    	
    	//create the java object  using pojo class
		student stupojo=new student();
		stupojo.setName("dharunya");
		stupojo.setLocation("france");
		stupojo.setPhone("1234455");
		String coursearr[]= {"C","C++"};
		stupojo.setCourses(coursearr);
				
		
		//convert java object -------> json object(serlization)
		ObjectMapper objMapper=new ObjectMapper();
		String jsondata=objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(stupojo);
		
		System.out.println(jsondata);
         
	}
    
    // Deserialization 
    @Test
   	void covertjsontopojo() throws JsonProcessingException
   	{
    	
      	
       	String jsondata= "{\r\n"
       			+ "  \"name\" : \"dharunya\",\r\n"
       			+ "  \"location\" : \"france\",\r\n"
       			+ "  \"phone\" : \"1234455\",\r\n"
       			+ "  \"courses\" : [ \"C\", \"C++\" ]\r\n"
       			+ "}";
   				
   		
   		//convert json data-------> pojo object(deserlization)
   		
   		
   		ObjectMapper stuobj=new ObjectMapper();
		student stu=stuobj.readValue(jsondata,student.class);
		System.out.println("Name:"+stu.getName());
		System.out.println("Location:"+stu.getLocation());
		System.out.println("Phone:"+stu.getPhone());
	    System.out.println("Course 1:"+stu.getCourses()[0]);
		System.out.println("Course 1:"+stu.getCourses()[1]);
            
   }
}

