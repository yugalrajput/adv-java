package in.co.rays.MarksheetModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

import in.co.rays.Bean.MarksheetBean;

public class MarksheetModel {
	public MarksheetBean add(MarksheetBean bean) throws ClassNotFoundException, SQLException{
		ResourceBundle rd=ResourceBundle.getBundle("system");
		Class.forName(rd.getString("Driver"));
		
		String user=rd.getString("user");
		String psw=rd.getString("password");
		String url=rd.getString("url");
		
		Connection con=DriverManager.getConnection(url,user,psw);
		PreparedStatement ps=con.prepareStatement("insert into marksheet values(?,?,?,?,?,?,?,?,?)");
		
		ps.setInt(1,bean.getId());
		ps.setInt(2, bean.getRoll_no());
		ps.setString(3, bean.getFname());
		ps.setString(4,bean.getLname());
		ps.setInt(5,bean.getPhysics());
		ps.setInt(6, bean.getChemistry());
		ps.setInt(7, bean.getMaths());
		ps.setInt(8, bean.getTotal());
		ps.setInt(9, bean.getPercentage());
		int i=ps.executeUpdate();
		return bean;
		
	}

}
