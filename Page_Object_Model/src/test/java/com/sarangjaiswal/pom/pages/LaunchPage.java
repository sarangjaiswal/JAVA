package com.sarangjaiswal.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.sarangjaiswal.pom.util.Constants;

public class LaunchPage extends BasePage{

	
	public LaunchPage(WebDriver driver){
		super(driver);
	}
	
	public LoginPage gotoLoginPage(){
		driver.get(Constants.appurl);
		return PageFactory.initElements(driver, LoginPage.class);
	}

}
