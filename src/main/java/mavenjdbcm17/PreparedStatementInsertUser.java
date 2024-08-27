package mavenjdbcm17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class PreparedStatementInsertUser {
public static void main(String[] args) throws Exception  {
//	1.Load and Register the Driver
//	a.Load the Driver
	Driver driver=new Driver();
//	b.Register the Driver
	DriverManager.registerDriver(driver);
//	Establish the Connection
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm17?user=root&password=root");
//	Create a Statement
	PreparedStatement preparedStatement=connection.prepareStatement("insert into user values(?,?,?)");
	
	Scanner scanner=new Scanner(System.in);
     System.out.println("Please enter your id");
     int id=scanner.nextInt();
     
     System.out.println("Please enter the name");
     String name=scanner.next();
     
     System.out.println("Please enter the addresss");
     String address=scanner.next();
     
     preparedStatement.setInt(1, id);
     preparedStatement.setString(2, name);
     preparedStatement.setString(3, address);
  
//     execute a query
     preparedStatement.execute();
//     close theconnection
     connection.close();
     System.out.println("Data inserted successfully with PS");
}
}
