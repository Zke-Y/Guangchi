package org.guangchi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ManagerDeleteAnnouncementDao {
	public static void DeleteAnnouncement(int id) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://106.52.87.204/Java_Test?useSSL=false&serverTimezone=GMT&useUnicode=true&characterEncoding=utf8","root","chen123");
			String sql="delete from announcement where idannouncement=?";
			pstmt=((java.sql.Connection) conn).prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
   	}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("´íÎó");
			e.printStackTrace();
			
		}catch (SQLException e) {
			System.out.println("´íÎó2");
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
	}
}
