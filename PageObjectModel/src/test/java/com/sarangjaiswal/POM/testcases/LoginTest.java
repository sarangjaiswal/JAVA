package com.sarangjaiswal.POM.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sarangjaiswal.POM.basetestcase.BaseTest;
import com.sarangjaiswal.POM.pages.LandingPage;
import com.sarangjaiswal.POM.pages.LaunchPage;
import com.sarangjaiswal.POM.pages.LoginPage;
import com.sarangjaiswal.POM.utils.Constants;
import com.sarangjaiswal.POM.utils.ExtentManager;

public class LoginTest extends BaseTest{
	
	@BeforeTest
	public void init(){

	}
	
	@Test
	public void logintest(){
		test = extent.startTest("Login Test");
		
		test.log(LogStatus.INFO, "Launching the browser");
		LandingPage landingpage = new LandingPage(driver, test);
		PageFactory.initElements(driver, landingpage);
		
		test.log(LogStatus.INFO, "Navigating to Website");
		landingpage.gotowebsite(Constants.SITE_URL);
		test.log(LogStatus.INFO, "navigating to Login Page");
		LoginPage loginpage = landingpage.gotoLoginPage();
		test.log(LogStatus.INFO, "Login into applicaion");
		LaunchPage launchpage = loginpage.doLogin(Constants.username, Constants.password);
	

	}
	
	@AfterMethod
	public void post(){
		if(extent != null){
			extent.endTest(test);
			extent.flush();
		}
	}
}
