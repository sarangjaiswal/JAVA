package com.sarangjaiswal.restassured.tests;

import org.testng.annotations.Test;

import com.sarangjaiswal.restassured.commons.EndPoint;

import static io.restassured.RestAssured.given;

public class Examples {
	
	@Test
	public void checkstatus(){
		given().get("http://echo.jsontest.com/key/value/one/two").then().statusCode(200).log().all();
	}
	
	@Test(groups="demo")
	public void checkstatus_v2(){
		given().get(EndPoint.Luis).then().statusCode(200).log().all();
	}

}
