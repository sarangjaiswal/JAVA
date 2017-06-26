package Archive;
import org.testng.annotations.*;

public class AppOne {
	
	@Test
	public void TestOne(){
		System.out.println("--- TestOne");
	}
	
	@Test
	public void TestTwo(){
		System.out.println("--- TestTwo");
	}
	
	@Test
	public void TestThree(){
		System.out.println("--- TestThree");
	}
	
	@Test
	public void TestFour(){
		System.out.println("--- TestFour");
	}
	
	@BeforeClass
	public void BeforeClass(){
		System.out.println("--- Before Class");
	}

	@AfterClass
	public void AfterClass(){
		System.out.println("--- After Class");
	}
	@BeforeMethod
	public void BeforeMethod(){
		System.out.println("--- Before Method");
	}
	@AfterMethod
	public void AfterMethod(){
		System.out.println("--- After Method");
	}
	@BeforeSuite
	public void BeforeSuite(){
		System.out.println("--- Before Suite");
	}
	@AfterSuite
	public void AfterSuite(){
		System.out.println("--- After Suite");
	}
	@AfterGroups
	public void AfterGroups(){
		System.out.println("--- After Groups");
	}
	@BeforeGroups
	public void BeforeGroups(){
		System.out.println("--- Before Groups");
	}
	@Test(dataProviderClass=dataprovider.class, dataProvider="getdata")
	public void TestA(String a, String b){
		
	}
	@Test(dataProviderClass=dataprovider.class, dataProvider="getdata")
	public void TestB(String a, String b, String c){
		
	}	
}
