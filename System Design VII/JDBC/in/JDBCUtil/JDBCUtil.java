package in.JDBCUtil;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtil {
	public static Connection  getJdbcConnection() throws SQLException, IOException{
			
			
			//STEP1: take the data from the Properties File
			FileInputStream fis = new FileInputStream("Application.properties");
			Properties P =new Properties();
			P.load(fis);
	     
		String url=P.getProperty("url");
		String user= P.getProperty("user");
		String password = P.getProperty("password");
		
		//just to confirm if the properties came here we will just do the below code
		
		System.out.println(url);
		System.out.println(user);
		System.out.println(password);
	
	           //STEP2: establish the connection 
		Connection connection = DriverManager.getConnection(url, user, password);
	
		
		return connection;
	}

	public static void cleanUp(Connection con ,PreparedStatement statement,ResultSet resultset) throws SQLException {
		//step 6 
		if(con!=null) {
			con.close();
		}
		if(statement != null) {
			statement.close();
		}
		if(resultset != null) {
			resultset.close();
		}
	}
}
