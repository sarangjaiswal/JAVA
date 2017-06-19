package com.sarangjaiswal.POM.basepage;

import java.util.Date;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sarangjaiswal.POM.utils.Constants;

public class BasePage {
	public WebDriver driver;
	public ExtentTest test;
	
	public BasePage(){
		//default Constructor
		System.out.println("In BasePage -> Dafault Constructor");
	}
	
	public BasePage(WebDriver driver, ExtentTest test){
		//Over ridden constructor
		System.out.println("In BasePage -> Overridden Constructor -> initializing the Driver");
		this.driver = driver;
		this.test = test;
	}
	
	public void takeScreenshot(){
		Date d = new Date();
		String imagefilename = d.toString().replace(":", "_").replace(" ", "_");
		test.log(LogStatus.INFO, test.addScreenCapture(Constants.SCREENSHOT_FOLDER + imagefilename + ".jpg"));
	}

}
