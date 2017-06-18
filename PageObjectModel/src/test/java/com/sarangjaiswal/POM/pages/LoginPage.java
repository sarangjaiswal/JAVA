package com.sarangjaiswal.POM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sarangjaiswal.POM.basepage.BasePage;
import com.sarangjaiswal.POM.utils.Constants;

public class LoginPage extends BasePage{
	
	
	@FindBy(xpath=Constants.Username_Text_Xpath)
	private WebElement username_text;
	
	@FindBy(xpath=Constants.Password_Text_Xpath)
	private WebElement password_text;
	
	@FindBy(xpath=Constants.Login_Button_Xpath)
	private WebElement signin_button;
	
	public LoginPage(){
		//Default Constructor
		System.out.println("In LoginPage -> Default Constructor");
	}

	public LoginPage(WebDriver driver){
		//Over ridden Constructor
		super(driver);
		System.out.println("In LoginPage -> Overridden Constructor");
		
	}
	
	public LaunchPage doLogin(String uname, String pwd){
		username_text.sendKeys(uname);
		password_text.sendKeys(pwd);
		signin_button.click();
		//HAPPY Path - Assuming that the login is successful
		return PageFactory.initElements(driver, LaunchPage.class);
		
	}
}
