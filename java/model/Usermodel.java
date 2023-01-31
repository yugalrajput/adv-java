package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import Bean.UserBean;

public class Usermodel {
	public Integer nextPK() throws ClassNotFoundException, SQLException {
		ResourceBundle rd = ResourceBundle.getBundle("System");
		Class.forName(rd.getString("Driver"));
		String user = rd.getString("user");
		String psw = rd.getString("password");
		String url = rd.getString("url");

		Connection con = DriverManager.getConnection(url,user,psw);
		PreparedStatement ps = con.prepareStatement("SELECT MAX(ID)FROM userregistration");
		int pk = 0;
		try {
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				pk = rs.getInt(1);
			}
			rs.close();
		} catch (Exception e) {
			System.out.println("exception of getting pk");
		}
		return pk + 1;
	}
  public UserBean add(UserBean Bean) throws ClassNotFoundException, SQLException {
	  ResourceBundle rs=ResourceBundle.getBundle("System");
	  System.out.println(rs);
	  Class.forName(rs.getString("Driver"));
	  String url=rs.getString("url");
	  String user=rs.getString("user");
	  String psw=rs.getString("password");
	 
	 
	  
	  Connection con=DriverManager.getConnection(url,user,psw);
	  PreparedStatement ps=con.prepareStatement("insert into userregistration values(?,?,?,?,?,?)");
	  
	  try {
		  ps.setInt(1,nextPK());
		  
		  ps.setString(2,Bean.getFname());
		  ps.setString(3,Bean.getLname());
		  ps.setString(4,Bean.getEmail());
		  ps.setString(5,Bean.getPassword());
		  ps.setString(6,Bean.getDate());
		  
		  int i=ps.executeUpdate();
		  
	  }
	  catch(SQLException e) {
		  
		 e.printStackTrace();
		  
		  con.close();
		  
	  }
	return Bean;
	
	  
	  
  }
  

}
