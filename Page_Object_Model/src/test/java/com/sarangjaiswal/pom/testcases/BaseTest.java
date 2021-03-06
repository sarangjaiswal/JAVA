package com.sarangjaiswal.pom.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sarangjaiswal.pom.util.Constants;

public class BaseTest {
	
	WebDriver driver;
	public void init(String bType){
		if(bType.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", Constants.Chrome_URL);
			driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,  TimeUnit.SECONDS);
	}
}
