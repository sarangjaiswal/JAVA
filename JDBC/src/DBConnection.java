import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class DBConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/";
		String driver = "com.mysql.jdbc.driver";
		String dbName = "testing";
		String username = "root";
		String pass="";
		try{
		Class.forName(driver).newInstance();
		conn =(Connection) DriverManager.getConnection(url+dbName,username,pass);
		
		System.out.println(conn.isClosed());
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
