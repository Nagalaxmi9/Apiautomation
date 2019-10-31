package RestAssured.APIautomation;

import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class gettweet{
	 @Test
	  public void start() throws Exception
	  {
		 Logger L = Logger.getLogger("gettweet");  
		  Testing t=new Testing();
			RestAssured.baseURI=t.url();
		  Response res= ((RequestSpecification) t.test()).
				queryParam("q","Qualitest").
				when().get(resource.gettwitter1()).then().and().extract().response();
				
				
				String response=res.asString();
				L.info(response);
				System.out.println(response);
				JsonPath js=new JsonPath(response);
				int count=js.get("statuses.size()");
			    System.out.println(count);
			    for(int i=0;i<count;i++)
			    {
			    	String username=js.getString("statuses["+i+"].user.screen_name");
			    	System.out.println(username);
			    }

				
	  }				
				

}
