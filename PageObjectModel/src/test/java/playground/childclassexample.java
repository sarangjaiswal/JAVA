package playground;

import org.testng.annotations.Test;

public class childclassexample extends parentclassexample{
	public childclassexample(){
		System.out.println("In childclasexample -> default constructor");
	}
	public childclassexample(String text){
		//super(text);
		System.out.println("In childclasexample -> Overridden constructor");
	}
	@Test
	public void test1(){
		System.out.println("In childclasexample -> test1");
	}
}
