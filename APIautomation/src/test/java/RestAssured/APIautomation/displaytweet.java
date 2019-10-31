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


public class displaytweet {
	@Test
	public void start() throws Exception {
	Logger L = Logger.getLogger("displaytweet ");  
	Testing t=new Testing();
	RestAssured.baseURI=t.url();
	Response res=((RequestSpecification) t.test()).queryParam("q","@RakshitaKM3").
	when().get(resource. displaywitter1()).then().extract().response();
	String response=res.asString();
	L.info(response);
	System.out.println(response);
	JsonPath js=new JsonPath(response);
	String id=js.getString("id");
	System.out.println(id);
	String text=js.getString("text");
	System.out.println(text);
	 
	
	
}
}


