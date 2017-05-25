import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;

public class AppOne {
	
	@Test
	public void TestOne(){
		System.out.println("--- TestOne");
	}
	
	@Test
	public void TestTwo(){
		System.out.println("--- TestTwo");
	}

	@AfterClass
	public void AfterClass(){
		System.out.println("--- After Class");
	}
}
