package org.guangchi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.guangchi.entity.Reservation;

public class ManagReservationInfoDao {
	public static void MGetReservationInfo(ArrayList<Reservation> reservationList) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://106.52.87.204/Java_Test?useSSL=false&serverTimezone=GMT&useUnicode=true&characterEncoding=utf8","root","chen123");
			String sql="select *from Reservation";
			pstmt=((java.sql.Connection) conn).prepareStatement(sql);
			rs=pstmt.executeQuery();
   	while(rs.next()) {
		int idReservation=Integer.parseInt(rs.getString(1));
		String idCustomer=rs.getString(2);
		String date=rs.getString(3);
		String state=rs.getString(4);
		String comment=rs.getString(5);
		String sumcost=rs.getString(6);
		reservationList.add(new Reservation(idReservation,idCustomer,date,state,comment,sumcost));
   	}}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("mgetfood����");
			e.printStackTrace();
			
		}catch (SQLException e) {
			System.out.println("mgetfood����2");
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
