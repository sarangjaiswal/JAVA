import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PopUpManagement {
	
	@Test
	public void PopupTest(){
		System.setProperty("webdriver.chrome.driver", "C:\\framework\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/popuptest1.html");
		
		Set<String> windowsIDs = driver.getWindowHandles();
		Iterator<String> it = windowsIDs.iterator();
		System.out.println("Number of Pop ups: " + windowsIDs.size());
		while(it.hasNext())
			System.out.println("Windows ID " + it.next());
		
		System.out.println("-----------------------------------------------");
		driver.get("http://www.popuptest.com/popuptest1.html");
		
		windowsIDs = driver.getWindowHandles();
		it = windowsIDs.iterator();
		System.out.println("Number of Pop ups: " + windowsIDs.size());
		while(it.hasNext())
			System.out.println("Windows ID " + it.next());
		
		
		driver.close();
		driver.quit();
	}

}
