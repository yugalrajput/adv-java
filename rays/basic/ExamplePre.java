package in.co.rays.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ExamplePre {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/task","root","root");
		PreparedStatement stmt=con.prepareStatement("insert into marksheet values(13,113,'neeraj','rajput',90,90,90,270,90)");
		int i=stmt.executeUpdate();
		System.out.println(i+""+"data inserted");
		con.close();
		

	}

}
