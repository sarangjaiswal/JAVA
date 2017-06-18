package com.sarangjaiswal.POM.basepage;

import org.openqa.selenium.WebDriver;

public class BasePage {
	public WebDriver driver;
	
	public BasePage(){
		//default Constructor
		System.out.println("In BasePage -> Dafault Constructor");
	}
	
	public BasePage(WebDriver driver){
		//Over ridden constructor
		System.out.println("In BasePage -> Overridden Constructor -> initializing the Driver");
		this.driver = driver;
	}

}
