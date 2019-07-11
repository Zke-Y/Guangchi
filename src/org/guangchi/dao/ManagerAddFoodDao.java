package org.guangchi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.guangchi.entity.Food;
import org.guangchi.entity.NewFood;

public class ManagerAddFoodDao {
	public static void AddFood(NewFood food) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://106.52.87.204/Java_Test?useSSL=false&serverTimezone=GMT&useUnicode=true&characterEncoding=utf8","root","chen123");
			String sql="insert into Food values(?,?,?,?)";
			pstmt=((java.sql.Connection) conn).prepareStatement(sql);
			pstmt.setString(1,food.getFname());
			pstmt.setString(2,food.getFtype());
			pstmt.setInt(3,food.getPrice());
			pstmt.setString(4,food.getPath());
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
