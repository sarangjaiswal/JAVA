import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isElementPresentExample {

	static WebDriver driver = null;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\framework\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://www.bing.com");
		while(iselementpresent("//*[@id='scpl0']")){
			driver.findElement(By.xpath("//*[@id='scpl0']")).click();
		}
	}
	
	public static boolean iselementpresent(String xpath){
		List<WebElement> elements = driver.findElements(By.xpath(xpath));
		if (elements.size() > 0){
			return true;
		}else {
			return false;
		}
	}
}
