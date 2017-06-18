package com.sarangjaiswal.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sarangjaiswal.pom.util.Constants;

public class LoginPage extends BasePage{
	
	
	@FindBy(xpath=Constants.Locators_Xpath_username)
	public WebElement email;
	
	@FindBy(xpath=Constants.Locators_Xpath_Pass)
	public WebElement password;
	
	@FindBy(xpath=Constants.Locators__Xpath_Login)
	public WebElement loginbutton;
	
	
	public LoginPage(WebDriver driver){
		super(driver);
	}
	
	public Object doLogin(String username, String pwd){
		email.sendKeys(username);
		password.sendKeys(pwd);
		loginbutton.click();
		
		boolean loginsuccess=true;
		if(loginsuccess)
			return PageFactory.initElements(driver, LandingPage.class);	
		else
			return PageFactory.initElements(driver, LoginPage.class);
	}

}
