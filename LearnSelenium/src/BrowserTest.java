import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserTest {
	
	@Test
	public void launchChrome(){
		System.setProperty("webdriver.chrome.driver", "C:\\framework\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\www.bing.com");
		driver.findElement(By.id("sb_form_q")).sendKeys("Hello World");
		
	}
	
}
