package mavenjdbcm17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class MultipleInsertion {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm17","root","root");
	PreparedStatement preparedStatement=connection.prepareStatement("insert into user values(?,?,?)");
	Scanner scanner=new Scanner(System.in);
	System.out.println("please enter the number of entires that you want to save");
	int entries=scanner.nextInt();
	int i=0;
	while(i<entries) {
		System.out.println("Id");
		int id=scanner.nextInt();
		System.out.println("please give name");
		String name=scanner.next();
		System.out.println("address");
		String address=scanner.next();
		
		preparedStatement.setInt(1, id);
		preparedStatement.setString(3, address);
		preparedStatement.setString(2, name);
		
		preparedStatement.execute();
		i++;
	}
	connection.close();
	System.out.println("Multiple data inserted successfully");
	
}
}
