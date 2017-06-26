package Archive;
import org.testng.annotations.Test;

public class performanceTestingExample {
	
	@Test(invocationCount=100, threadPoolSize=10)
	public void TestA(){
		System.out.println("I am in Test A");
	}

}
