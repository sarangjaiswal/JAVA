import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties p = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\SARANG\\OneDrive\\Workspace\\JAVA\\LearnJAVA\\src\\test.properties");
		
		p.load(ip);
		
		System.out.println(p.get("OS"));
		

	}

}
