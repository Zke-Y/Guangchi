package org.guangchi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.guangchi.entity.Food;

public class SelectFoodToCollectionDao {
	public static void SelectFoodToCollection(String uname,ArrayList<Food> foodList) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://106.52.87.204/Java_Test?useSSL=false&serverTimezone=GMT&useUnicode=true&characterEncoding=utf8","root","chen123");
			String sql="select f.Foodname,f.Foodtype,f.price,f.image from Collection as S,Food f where S.Food_Foodname=f.Foodname and S.Customer_idCustomer=?";
			pstmt=((java.sql.Connection) conn).prepareStatement(sql);
			pstmt.setString(1,uname);
			rs=pstmt.executeQuery();
			while(rs.next()){
				int price = rs.getInt("price");
				String foodname = rs.getString("Foodname");
				String foodtype = rs.getString("Foodtype");
				String image = rs.getString("image");
				
				Food food= new Food(foodname,foodtype,image,price);
				foodList.add(food);
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
