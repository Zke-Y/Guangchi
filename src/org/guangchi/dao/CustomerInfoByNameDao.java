package org.guangchi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.guangchi.entity.Customer;

public class CustomerInfoByNameDao {
	public static void GetInfo(String tname,ArrayList<Customer> arrList) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://106.52.87.204/Java_Test?useSSL=false&serverTimezone=GMT&useUnicode=true&characterEncoding=utf8","root","chen123");
			String sql="select * from Customer where idCustomer=?";
			pstmt=((java.sql.Connection) conn).prepareStatement(sql);
			pstmt.setString(1, tname);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				String name=rs.getString(1);
				String pwd=rs.getString(2);
				String isCredit=rs.getString(3);
				arrList.add(new Customer(name,pwd,isCredit));
			}		
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
