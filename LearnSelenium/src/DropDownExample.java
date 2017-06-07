import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownExample {
	
	@Test
	public void DropDownTest(){
		System.setProperty("webdriver.chrome.driver", "C:\\framework\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.bbc.com");	
	}
	

}
