package in.co.rays.basic;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class CallablestmtEx1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/task","root","root");
		CallableStatement cs=con.prepareCall("{call getDetails(?,?)}");
		//Scanner sc=new Scanner(System.in);
		System.out.println("hi");
		
		//int id=sc.nextInt();
		cs.setInt(1, 1);
		cs.registerOutParameter(2,Types.VARCHAR);
		cs.execute();
		System.out.println("hlo");
		//int i=cs.getInt(1);
		String nm=cs.getString(2);
		System.out.println("id"+""+"roll_no");
		

	}

}
