package mavenjdbcm17;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CallableStatementInsertUser {
public static void main(String[] args) throws Exception {
//	1.Load and Register the Driver
	Class.forName("com.mysql.cj.jdbc.Driver");
//	2.Establish the Connection
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm17","root","root");
//	3.Create a Statement
	CallableStatement callableStatement=connection.prepareCall("call insertUser(1000,'poo','bang')");
//	4.Execute a query
	callableStatement.execute();
//	5.Close the Connection
	connection.close();

	System.out.println("Data inserted successfully");
}
}
