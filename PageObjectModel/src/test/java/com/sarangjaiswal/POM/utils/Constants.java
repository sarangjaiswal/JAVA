package com.sarangjaiswal.POM.utils;


public class Constants {
	
	//----------URL's ------------------------
	public static final String SITE_URL = "https://www.lendingtree.com/";
	
	//----------File Location ------------------------
	public static final String CHROME_DRIVER_URL = System.getProperty("user.dir")+"\\resources\\chromedriver.exe";
	public static final String REPORT_FOLDER = System.getProperty("user.dir")+"\\Reports\\";
	public static final String SCREENSHOT_FOLDER = System.getProperty("user.dir")+"\\Screenshot\\";
	public static final String REPORTCONFIGPATH = System.getProperty("user.dir")+"\\reportconfig.xml";
	
	//----------Locator's --------------------
	//Launch Page
	public static final String Login_Link_Xpath = "html/body/header/div[1]/div/nav/ul/li[5]/a";
	
	//Login Page
	public static final String Username_Text_Xpath = "//*[@id='UserName']"; 
	public static final String Password_Text_Xpath = "//*[@id='Password']";
	public static final String Login_Button_Xpath = "html/body/div[1]/div[3]/div[1]/form/fieldset/button";
	
	
	//----------Data --------------------
	public static final String username = "sarang.j@outlook.com";
	public static final String password = "hitter1982";
}
