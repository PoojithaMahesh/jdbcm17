package mavenjdbcm17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertUser {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
//	1.Load and Register the Driver
	Class.forName("com.mysql.cj.jdbc.Driver");
//	2.Establish the Connection
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm17","root","root");
//	3.Create a Statement
	Statement statement=connection.createStatement();
//	4.Execute a query
	statement.execute("insert into user values(22,'swati','mysore')");
//	5.Close the Connection
	connection.close();

	System.out.println("Data inserted successfully");
}
}
