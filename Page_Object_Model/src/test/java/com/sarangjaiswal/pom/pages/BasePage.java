package com.sarangjaiswal.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	public WebDriver driver;
	public TopMenu menu;
	
	
	public BasePage(){
		
	}
	
	public BasePage(WebDriver driver){
		this.driver = driver;
		menu = PageFactory.initElements(driver, TopMenu.class);
	}
	
	public TopMenu getMenu(){
		return menu;
	}
}
