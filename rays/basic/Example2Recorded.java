package in.co.rays.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Example2Recorded {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/task", "root", "root");
		PreparedStatement stmt = con.prepareStatement(
				"Select id,roll_no,fname,lname,physics,chemistry,maths,(physics+chemistry+maths)as total from marksheet");
ResultSet rs=stmt.executeQuery();
System.out.println("                              MARKSHEET                             ");
System.out.println("id"+" "+"roll_no"+" "+"fname"+" "+"lname"+" "+"physics"+" "+"chemistry"+" "+"maths"+" "+"total");
while(rs.next()) {
	System.out.print(rs.getInt(1)+"\t");
	System.out.print(rs.getInt(2)+"\t");
	System.out.print(rs.getString(3)+"\t");
	System.out.print(rs.getString(4)+"\t");
	System.out.print(rs.getInt(5)+"\t");
	System.out.print(rs.getInt(6)+"\t");
	System.out.println(rs.getInt(7));
}
con.close();
	}
}
