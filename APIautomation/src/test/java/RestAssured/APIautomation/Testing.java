package RestAssured.APIautomation;

import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import io.restassured.specification.RequestSpecification;

public class Testing {
	
	
	public static RequestSpecification test() throws Exception {
		 Properties prop=new Properties();
		   PropertyConfigurator.configure("C:\\restassured\\APIautomation\\Log4j.properties");
		FileInputStream f=new FileInputStream("C:\\restassured\\APIautomation\\src\\test\\java\\RestAssured\\APIautomation\\data.properties");
		  prop.load(f);
		  String consumer_key=prop.getProperty("ConsumerKey");
			String consumer1=prop.getProperty("ConsumerSecret");
			String token=prop.getProperty("Token");
			String token1=prop.getProperty("TokenSecret");
			return given().auth().oauth(consumer_key,consumer1, token,token1);
	}
	public String url() {
		return "https://api.twitter.com/1.1/";
		
	}

}
