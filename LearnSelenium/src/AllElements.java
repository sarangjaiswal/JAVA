import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AllElements {
	
	@Test
	public void getAllLinks(){
		System.setProperty("webdriver.chrome.driver", "C:\\framework\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.bbc.com");
		
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		System.out.println(elements.size());
		System.out.println("--------------------------------------------");
		
		for (int i=0; i<elements.size();i++){
			System.out.println(elements.get(i).getText() + "  -  "+ elements.get(i).isDisplayed());
		}
		
		
		
		
		driver.close();
		driver.quit();
		
	}

}
