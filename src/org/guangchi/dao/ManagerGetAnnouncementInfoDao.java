package org.guangchi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.guangchi.entity.announcement;

public class ManagerGetAnnouncementInfoDao {
	public static void MGetAnnouncementInfo(ArrayList<announcement> announcementList) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://106.52.87.204/Java_Test?useSSL=false&serverTimezone=GMT&useUnicode=true&characterEncoding=utf8","root","chen123");
			String sql="select * from announcement";
			pstmt=((java.sql.Connection) conn).prepareStatement(sql);
			rs=pstmt.executeQuery();
   	while(rs.next()) {
		int id=Integer.parseInt(rs.getString(1));
		String context=rs.getString(2);
		String date=rs.getString(3);
		announcementList.add(new announcement(id,context,date));
   	}}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("mgetfood´íÎó");
			e.printStackTrace();
			
		}catch (SQLException e) {
			System.out.println("mgetfood´íÎó2");
			e.printStackTrace();
		}finally{
				try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		//return reservationList;
	}
}
