package org.guangchi.dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.guangchi.entity.Login;

import java.sql.Connection;

//用于处理登陆
public class LoginDao {
	public static int login() {
		int result=-1;
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://106.52.87.204/Java_Test?useSSL=false&serverTimezone=GMT&useUnicode=true&characterEncoding=utf8","root","chen123");
			String sql="select count(*) from Customer where idCustomer=? and password=?";
			pstmt=((java.sql.Connection) conn).prepareStatement(sql);
			pstmt.setString(1,Login.getName());
			pstmt.setString(2, Login.getPwd());
			rs=pstmt.executeQuery();
			if(rs.next()) {
				result	=rs.getInt(1);
			}
			if(result>0) {
				return 1;
			}else {
				return 0;
			}
			
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
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	
	}
}
