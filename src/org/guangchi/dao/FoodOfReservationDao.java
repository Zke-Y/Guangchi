package org.guangchi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.guangchi.entity.Food;


public class FoodOfReservationDao {
	public static void GetFoodInfo(int id,ArrayList<Food> foodList) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://106.52.87.204/Java_Test?useSSL=false&serverTimezone=GMT&useUnicode=true&characterEncoding=utf8","root","chen123");
			String sql="select distinct(f.Foodname),f.price,f.image from Food f,Reservation_has_Food r where f.Foodname=r.Food_Foodname and r.Reservation_idReservation=?";
			pstmt=((java.sql.Connection) conn).prepareStatement(sql);
			pstmt.setInt(1, id);
			rs=pstmt.executeQuery();
   	while(rs.next()) {
		String fname=rs.getString("Foodname");
		int price=rs.getInt("price");
		String path=rs.getString("image");
		System.out.println(fname+"   "+price+"   "+path+"  ");
		foodList.add(new Food(fname,path,price));
   	}}catch (ClassNotFoundException e) {
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
		//return reservationList;
	}
}
