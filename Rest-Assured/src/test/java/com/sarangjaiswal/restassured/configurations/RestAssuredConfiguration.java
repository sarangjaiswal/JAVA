package com.sarangjaiswal.restassured.configurations;

import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;

public class RestAssuredConfiguration {
	
	@BeforeSuite(alwaysRun = true)
	public void configure(){
		
		//http://openweathermap.org/API
		http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=ebb80415da02157c8768054a79dbbac4

		RestAssured.baseURI = "http://openweathermap.org";
		//RestAssured.port = 8080;
		RestAssured.basePath = "/data/2.5";
		
		
		
	}

}
