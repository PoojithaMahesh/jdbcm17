package mavenjdbcm17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ExecuteUpdateUpdateUser {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm17","root","root");
	Statement statement=connection.createStatement();
	int value=statement.executeUpdate("update user set name='poo' where id=100");
	connection.close();
	System.out.println(value);
	System.out.println("Data updated successfully");
}
}
