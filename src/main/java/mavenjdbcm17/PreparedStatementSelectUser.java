package mavenjdbcm17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class PreparedStatementSelectUser {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm17","root","root");
		PreparedStatement preparedStatement=connection.prepareStatement("select * from User");
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("Please enter id to be selected");
//		int id=scanner.nextInt();
//		preparedStatement.setInt(1, id);
		ResultSet resultSet=preparedStatement.executeQuery();
		while(resultSet.next()) {
			System.out.println(resultSet.getInt("id"));
			System.out.println(resultSet.getString("name"));
			System.out.println(resultSet.getString(3));
		}
		connection.close();
		
	}
}
