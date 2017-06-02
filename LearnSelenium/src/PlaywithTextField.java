import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PlaywithTextField {
	
	@Test
	public void Test_TextField(){
		System.setProperty("webdriver.chrome.driver", "C:\\framework\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.bing.com");
		driver.findElement(By.xpath("//*[@id='sb_form_q']")).sendKeys("Sarang Jaiswal");
		
	}

}
