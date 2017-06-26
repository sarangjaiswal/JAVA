package Archive;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class dataprovider {
	
	@DataProvider(name="getdata")
	public static Object[][] getdata(Method m){
		
		Object[][] data = null;
		if(m.getName()=="TestA"){
			data = new Object[2][2];
			
			data[0][0]= "Mumbai";
			data[0][1]= "Pune";
			
			data[1][0]= "Bangalore";
			data[1][1]= "Chennai";
			
		}else if (m.getName()=="TestB"){
			data = new Object[2][3];
			data[0][0]= "Charlotte";
			data[0][1]= "New York";
			data[0][2] = "Myrtle Beach";
			
			data[1][0]= "California";
			data[1][1]= "San diego";
			data[1][2]= "Atlanta";
		}
		
		
		return data;
	}
}
