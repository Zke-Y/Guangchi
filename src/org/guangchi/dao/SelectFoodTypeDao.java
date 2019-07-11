package org.guangchi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.guangchi.entity.Food;


public class SelectFoodTypeDao {
	public static void SelectFoodType(String foodtype,ArrayList<Food> foodList) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://106.52.87.204/Java_Test?useSSL=false&serverTimezone=GMT&useUnicode=true&characterEncoding=utf8","root","chen123");
			String sql="select Foodname,price,Foodtype,image from Food where Foodtype=?";
			pstmt=((java.sql.Connection) conn).prepareStatement(sql);
			pstmt.setString(1,foodtype);
			rs=pstmt.executeQuery();
			while(rs.next()){
				String Foodname = rs.getString("Foodname");
				int price = rs.getInt("price");
				String Foodtype=rs.getString("Foodtype");
				String image=rs.getString("image");
				Food thisfood= new Food(Foodname,Foodtype,image,price);
				foodList.add(thisfood);
			}
			//返回同类食品的list;
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
	}

}
