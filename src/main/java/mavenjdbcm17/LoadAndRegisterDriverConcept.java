package mavenjdbcm17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class LoadAndRegisterDriverConcept {
public static void main(String[] args) throws SQLException  {
//	1.a.Load the Driver
	Driver driver=new Driver();
//	b.Register the Driver
	DriverManager.registerDriver(driver);
	
//	2.Establish the Connection
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm17","root","root");
//	3.Create a Statement
	Statement statement=connection.createStatement();
//	4.Execute a query
	statement.execute("insert into user values(100,'swati','mysore')");
//	5.Close the Connection
	connection.close();

	System.out.println("Data inserted successfully with L and R the Driver explicitily");
	
}
}
