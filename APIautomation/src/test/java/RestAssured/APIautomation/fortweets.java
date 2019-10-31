package RestAssured.APIautomation;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class fortweets {
	@Test
	  public void start() throws Exception
	  {
		Logger L = Logger.getLogger("fortweets ");  
	
	 String[] a= {"2295383", "28218", "23424977", "23424852"};
	
	 for(int i=0; i<4; i++) {
		  Testing t=new Testing();
			RestAssured.baseURI=t.url();
		 Response res= ((RequestSpecification) t.test()).
	 
	
	  queryParam("id", a[i]).
	  when().get(resource.fortwitter1()). then().extract().response();
			        
	 String response= res.asString();
	 L.info(response);
	 System.out.println(response);
			        
	 JsonPath js= new JsonPath(response);
	
  }

			 }
	}
	    
	
	
	


