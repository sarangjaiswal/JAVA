package com.sarangjaiswal.pom.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sarangjaiswal.pom.pages.LandingPage;
import com.sarangjaiswal.pom.pages.LaunchPage;
import com.sarangjaiswal.pom.pages.LoginPage;

public class ProfileTest extends BaseTest{
	
	@Test
	public void testProfile(){
		
		
		LaunchPage launchpage = PageFactory.initElements(driver, LaunchPage.class);
		LoginPage loginpage = launchpage.gotoLoginPage();
		
		Object page = loginpage.doLogin("testid@test.test", "test1234");
		if(page instanceof LandingPage){
			System.out.println("Successful");
		}else if(page instanceof LoginPage){
			Assert.fail("Login Failed");
		}
		
		loginpage.getMenu().logout(); //getter setter method
		//loginpage.menu.logout(); 
		
	}

}
