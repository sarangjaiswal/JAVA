package com.sarangjaiswal.POM.basetestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sarangjaiswal.POM.utils.Constants;

public class BaseTest {
	public WebDriver driver = null;
	public BaseTest(){
		System.out.println("In BaseTest -> Default Constructor");
		System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_URL);
		driver = new ChromeDriver();		
	}
}
