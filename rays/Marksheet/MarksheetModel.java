package in.co.rays.Marksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class MarksheetModel {
	private static final String Bean = null;
	public Integer nextPK() throws ClassNotFoundException, SQLException {
		ResourceBundle rd = ResourceBundle.getBundle("System");
		Class.forName(rd.getString("Driver"));
		String user = rd.getString("user");
		String psw = rd.getString("password");
		String url = rd.getString("url");

		Connection con = DriverManager.getConnection(url,user,psw);
		PreparedStatement ps = con.prepareStatement("SELECT MAX(ID)FROM student");
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
	  
        public void add(Bean bean) throws ClassNotFoundException, SQLException {
        	ResourceBundle rd=ResourceBundle.getBundle("System");
        	Class.forName(rd.getString("Driver"));
        	String user=rd.getString("user");
        	String psw=rd.getString("password");
        	String url=rd.getString("url");
        	
        	Connection con=DriverManager.getConnection(url,user,psw);
        	PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?,?,?,?,?) ");
        	ps.setInt(1, nextPK());
        	ps.setInt(2, bean.getRoll_no());
        	ps.setString(3, bean.getFname());
        	ps.setString(4, bean.getLname());
        	ps.setString(5, bean.getEmailid());
        	ps.setInt(6, bean.getPhysics());
        	ps.setInt(7, bean.getChemistry());
        	ps.setInt(8, bean.getMaths());
        	int i=ps.executeUpdate();
        	
        	
        }
        
        public static ArrayList meritList() throws ClassNotFoundException, SQLException {
        	ArrayList list=new ArrayList();
        	ResourceBundle rd=ResourceBundle.getBundle("System");
        	//System.out.println(rd.getString("Driver"));
        	Class.forName(rd.getString("Driver"));
        	String user=rd.getString("user");
        	String psw=rd.getString("password");
        	String url=rd.getString("url");
        	Connection co=DriverManager.getConnection(url,user,psw);
        	PreparedStatement ps=co.prepareStatement("select *from student");
        	
        	ResultSet rs=ps.executeQuery();
        	
        	while(rs.next()){
        		Bean b=new Bean();
        		b.setId(rs.getInt(1));
        		b.setRoll_no(rs.getInt(2));
        		b.setFname(rs.getString(3));
        		b.setLname(rs.getString(4));
        		b.setEmailid(rs.getString(5));
        		b.setPhysics(rs.getInt(6));
        		b.setChemistry(rs.getInt(7));
        		b.setMaths(rs.getInt(8));
        		
        		list.add(b);
        		
        		
        	
        	}
 
			return list;
        }
        	
			 public void update(Bean bean) throws ClassNotFoundException, SQLException{
		        	ResourceBundle rd=ResourceBundle.getBundle("System");
		        	Class.forName(rd.getString("Driver"));
		        	String user=rd.getString("user");
		        	String psw=rd.getString("password");
		        	String url=rd.getString("url");
		        	
		        	Connection con=DriverManager.getConnection(url,user,psw);
		        	PreparedStatement ps=con.prepareStatement("update student set fname=?,lname=? where id=?");
		        	ps.setString(1, bean.getFname());
		        	ps.setString(2, bean.getLname());
		        	ps.setInt(3,bean.getId());
		        	int i=ps.executeUpdate();
		        	
		        	
		        }
			 
			 public void delete(Bean bean) throws ClassNotFoundException, SQLException{
		        	ResourceBundle rd=ResourceBundle.getBundle("System");
		        	Class.forName(rd.getString("Driver"));
		        	String user=rd.getString("user");
		        	String psw=rd.getString("password");
		        	String url=rd.getString("url");
		        	
		        	Connection con=DriverManager.getConnection(url,user,psw);
		        	PreparedStatement ps=con.prepareStatement("delete from student where roll_no=?");
		        	ps.setInt(1,bean.getRoll_no());
		        	int i=ps.executeUpdate();
        }
			 public static Bean get(Bean bean) throws ClassNotFoundException, SQLException{
		        	ResourceBundle rd=ResourceBundle.getBundle("System");
		        	Class.forName(rd.getString("Driver"));
		        	String user=rd.getString("user");
		        	String psw=rd.getString("password");
		        	String url=rd.getString("url");
		        	
		        	Connection con=DriverManager.getConnection(url,user,psw);
		        	PreparedStatement ps=con.prepareStatement("Select *from student where roll_no=?");
		        	Bean b=null;
		        	ps.setInt(1,bean.getRoll_no());
		        	ResultSet rs=ps.executeQuery();
		        	while(rs.next()){
		        		 b=new Bean();
		        		b.setId(rs.getInt(1));
		        		b.setRoll_no(rs.getInt(2));
		        		b.setFname(rs.getString(3));
		        		b.setLname(rs.getString(4));
		        		b.setEmailid(rs.getString(5));
		        		b.setPhysics(rs.getInt(6));
		        		b.setChemistry(rs.getInt(7));
		        		b.setMaths(rs.getInt(8));
			 }
		        	return b;
    }
}

