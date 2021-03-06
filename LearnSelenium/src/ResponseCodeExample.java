import java.io.IOException;
import java.util.List;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResponseCodeExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\framework\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.bing.com");
		
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		
		for (int i=0;i<alllinks.size();i++){
			System.out.println(alllinks.get(i).getText() + "  -----  " + getresponsecode(alllinks.get(i).getAttribute("href")));
		}
	}
	
	public static int getresponsecode(String url){
		int responsecode = 0;
		
		try {
			responsecode = Request.Get(url).execute().returnResponse().getStatusLine().getStatusCode();
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return responsecode;
		
	}
}
