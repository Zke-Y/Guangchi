package org.guangchi.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.guangchi.entity.NewReservation;

public class CloseAccountsDao {
	public static int CloseAccounts() {
		Connection conn=null;
		PreparedStatement pstmt1=null;
		PreparedStatement pstmt2=null;
		PreparedStatement pstmt3=null;
		ResultSet rs=null;
		int c=0; 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://106.52.87.204/Java_Test?useSSL=false&serverTimezone=GMT&useUnicode=true&characterEncoding=utf8","root","chen123");
			// String sql3="select f.price from Reservation r,Reservation_has_Food rf,Food f where r.idReservation=rf.Reservation_idReservation and r.State=\"now\" and f.Foodname=rf.Food_Foodname";
			 String sql1="select Sumcost from Reservation where State='now'";
			 String sql2="update Reservation set State='end' where State='now'";
				pstmt1=((java.sql.Connection) conn).prepareStatement(sql1);
				pstmt2=((java.sql.Connection) conn).prepareStatement(sql2);
				rs=pstmt1.executeQuery();
				pstmt2.executeUpdate();
				while(rs.next()) {
				c=rs.getInt(1);
				}
			 
			 
				return c;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
			return -1;
		}catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}finally{
			
				try {
				if(rs!=null) rs.close();
				if(pstmt1!=null) pstmt1.close();
				if(pstmt2!=null) pstmt2.close();
				if(conn!=null) conn.close();

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	
	}
}
