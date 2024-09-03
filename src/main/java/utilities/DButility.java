package utilities;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DButility {
	
	Connection conn;
	public void getDBConnection() throws SQLException
	{
		Driver ref=new Driver();
		DriverManager.registerDriver(ref);
		DriverManager.getConnection(null, null, null);
		
	}
	
	public void closeDBConnection()
	{
		try {
			conn.close();
		}catch (Exception e) {
			System.out.println("andle Exception");
		}
	}

}
