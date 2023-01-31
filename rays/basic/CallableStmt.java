package in.co.rays.basic;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;



public class CallableStmt {

	
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			// TODO Auto-generated method stub
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/task","root","root");
			CallableStatement cs=con.prepareCall("{call usercount(?)}");
			System.out.println("hi");
			cs.registerOutParameter(1,Types.INTEGER);
			
			cs.execute();
			System.out.println("hi");
			int count=cs.getInt(1);
			System.out.println("success"+""+count);


	}

}
