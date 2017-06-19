package com.sarangjaiswal.POM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sarangjaiswal.POM.basepage.BasePage;
import com.sarangjaiswal.POM.utils.Constants;

public class LandingPage extends BasePage{
	

	
	@FindBy(xpath=Constants.Login_Link_Xpath)
	private WebElement LoginLink;
	
	
	public LandingPage(){
		//Default Constructor
		test.log(LogStatus.INFO,"In LandingPage -> Default Constructor");
	}
	
	public LandingPage(WebDriver driver, ExtentTest test){
		//COnstructor Overridden
		super(driver, test);
		
		
		test.log(LogStatus.INFO, "In LandingPage -> Overridden Constructor -> Initializing Driver");
		
	}
	
	public void gotowebsite(String url){
		test.log(LogStatus.INFO, "In LandingPage -> gotowebsite -> opening the website");
		driver.get(url);
	}
	
	public LoginPage gotoLoginPage(){
		test.log(LogStatus.INFO, "In landingPage -> gotoLoginPage -> navigating to Login Page");
		LoginLink.click();
		//HAPPY PATH - Assumption is that there is no failure while navigating to the LoginPage. 
		LoginPage loginpage = new LoginPage(driver, test);
		PageFactory.initElements(driver, loginpage);
		return loginpage;
	}

}
