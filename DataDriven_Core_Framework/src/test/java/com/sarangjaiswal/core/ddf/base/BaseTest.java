package com.sarangjaiswal.core.ddf.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class BaseTest {
	
	public WebDriver driver = null;
	public Properties prop = new Properties();
	File file = new File("C:\\Users\\SARANG\\OneDrive\\Workspace\\JAVA\\DataDriven_Core_Framework\\src\\test\\java\\com\\sarangjaiswal\\core\\ddf\\util\\or.properties");
	
	
	public String getDatafromOR(String key){
		FileInputStream ip;
		try {
			ip = new FileInputStream(file);
			prop.load(ip);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}
	public void OpenBrowser(String btype){
		
		
		if(btype.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\framework\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
	}
	
	public void navigate(String url){
		driver.get(url);
	}
	
	public void click(String locator){
		WebElement element = isElementPresent(locator);
		if(element!=null){
			element.click();
		}else{
			//add logging logic
		}
	}
	public void type(){
		
	}
	
	public WebElement isElementPresent(String locator){
		List<WebElement> allelement = driver.findElements(By.xpath(locator));
		if (allelement.size()>0){
			//put logic to analyze if the locator is Xpath, CSS Selector, id etc.,
			return driver.findElement(By.xpath(locator));
		}else{
			return null;
		}
	}
	
	//--------------Validate ----------------
	
	public boolean verifyTitle(){
		return false;
		
	}

	public boolean isElementPresent(){
		return false;
		
	}
	
	//---------------------------Reporting --------------------
	public void reportPass(String msg){
		
	}
	
	public void reportFail(String msg){
		
	}
	
	public void TakeScreenshot(){
		
	}
}
