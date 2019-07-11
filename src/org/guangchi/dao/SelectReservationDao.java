package org.guangchi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.guangchi.entity.Reservation;

public class SelectReservationDao {
	public static void SelectReservation(String uname,ArrayList<Reservation> reservationList) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://106.52.87.204/Java_Test?useSSL=false&serverTimezone=GMT&useUnicode=true&characterEncoding=utf8","root","chen123");
			String sql="select idReservation,Date,State,Sumcost,Comment from Reservation where idCustomer=?";
			pstmt=((java.sql.Connection) conn).prepareStatement(sql);
			pstmt.setString(1,uname);
			rs=pstmt.executeQuery();
			while(rs.next()){
				int idReservation = rs.getInt("idReservation");
				String date = rs.getString("Date");
				String state = rs.getString("State");
				String sumcost = rs.getString("Sumcost");
				String comment = rs.getString("Comment");
				
				System.out.println("Ω¯»ÎSelectReservationDao");
				System.out.println(idReservation);
				System.out.println(date);
				System.out.println(state);
				System.out.println(sumcost);
				System.out.println(comment);
				System.out.println(" /// ");
				
				Reservation res= new Reservation(idReservation, date,state,sumcost,comment);
				reservationList.add(res);
			}
			//return reservationList;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}catch (SQLException e) {
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
