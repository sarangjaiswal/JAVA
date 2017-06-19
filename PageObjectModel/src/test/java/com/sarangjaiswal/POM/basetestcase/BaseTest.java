package com.sarangjaiswal.POM.basetestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.sarangjaiswal.POM.utils.Constants;
import com.sarangjaiswal.POM.utils.ExtentManager;

public class BaseTest {
	
	//Global Variable's - These will be avaliable at all the test.
	public WebDriver driver = null;
	public ExtentReports extent = ExtentManager.getInstance();
	public ExtentTest test;
	
	public BaseTest(){
		System.out.println("In BaseTest -> Default Constructor");
		System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_URL);
		driver = new ChromeDriver();		
	}
}
