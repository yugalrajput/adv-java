package in.co.rays.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class JdbcExample2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
    ResourceBundle rs=ResourceBundle.getBundle("system");
    Class.forName(rs.getString("Driver"));
    String user=rs.getString("user");
    String ps=rs.getString("password");
    String url=rs.getString("url");
    Connection con=DriverManager.getConnection(url,user,ps);
    Statement st=con.createStatement();
    int i=st.executeUpdate("insert into marksheet values(14,114,'suman','rajput',96,98,45,239,80)");
    System.out.println(i+"done");
    con.close();
	}

}
