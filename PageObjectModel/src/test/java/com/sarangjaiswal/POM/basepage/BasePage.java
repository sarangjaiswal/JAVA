package com.sarangjaiswal.POM.basepage;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File(Constants.SCREENSHOT_FOLDER + imagefilename + ".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.log(LogStatus.INFO, test.addScreenCapture(Constants.SCREENSHOT_FOLDER + imagefilename + ".jpg"));
	}

}