package Archive;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterizedTestExample {
	
	@Test(dataProvider="getdata")
	public void Test1(String a, String b, String c){
		System.out.println("In Test 1 Method - "+ a +" "+ b + " " + c);
	}
	
	@DataProvider
	public Object[][] getdata(){
		Object[][] data = new Object[2][3];
		
		data[0][0]= "Mumbai";
		data[0][1]= "Pune";
		data[0][2]= "Kalyan";
		
		data[1][0]= "Bangalore";
		data[1][1]= "Mysore";
		data[1][2]= "Nandi";
		
		return data;
	}
}
