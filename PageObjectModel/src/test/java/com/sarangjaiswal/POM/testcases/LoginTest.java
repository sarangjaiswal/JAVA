package com.sarangjaiswal.POM.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.sarangjaiswal.POM.basetestcase.BaseTest;
import com.sarangjaiswal.POM.pages.LandingPage;
import com.sarangjaiswal.POM.pages.LaunchPage;
import com.sarangjaiswal.POM.pages.LoginPage;
import com.sarangjaiswal.POM.utils.Constants;

public class LoginTest extends BaseTest{
	
	@Test
	public void logintest(){

		LandingPage landingpage = PageFactory.initElements(driver, LandingPage.class);
		landingpage.gotowebsite(Constants.SITE_URL);
		LoginPage loginpage = landingpage.gotoLoginPage();
		LaunchPage launchpage = loginpage.doLogin(Constants.username, Constants.password);
		
	}
}
