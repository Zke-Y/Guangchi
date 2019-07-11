package org.guangchi.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class CreateReservationDao {
	public static void CreateReservation(String uname) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://106.52.87.204/Java_Test?useSSL=false&serverTimezone=GMT&useUnicode=true&characterEncoding=utf8","root","chen123");
			CallableStatement cs=conn.prepareCall("{call precourse_createReservation(?)}");
			cs.setString(1,uname);
			cs.execute();
			}
		 catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			
			try {
			if(pstmt!=null) pstmt.close();
			if(conn!=null) conn.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

