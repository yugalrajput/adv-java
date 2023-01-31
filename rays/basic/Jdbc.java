package in.co.rays.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		add();

	}

	private static void add() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/task","root","root");
		Statement stmt=con.createStatement();
		int i=stmt.executeUpdate("insert into marksheet values(12,112,'subham','singh',100,100,100,300,100)");
		System.out.println(i+""+"data inserted");
		stmt.close();
		con.close();
	}

}
