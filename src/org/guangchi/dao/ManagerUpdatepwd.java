package org.guangchi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ManagerUpdatepwd {
	public static int Updatepwd(String oldpwd,String newpwd) {
		Connection conn=null;
		PreparedStatement pstmt1=null;
		PreparedStatement pstmt2=null;
		ResultSet rs=null;
		int flag=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://106.52.87.204/Java_Test?useSSL=false&serverTimezone=GMT&useUnicode=true&characterEncoding=utf8","root","chen123");
			String sql1="select password from Manager where idManager='chentaijie'";
			String sql2="update Manager set password=? where idManager='chentaijie'";
			pstmt1=((java.sql.Connection) conn).prepareStatement(sql1);
			pstmt2=((java.sql.Connection) conn).prepareStatement(sql2);
			rs=pstmt1.executeQuery();
			while(rs.next()) {
				String password=rs.getString("password");
				if(password.equals(oldpwd)&&!password.equals(newpwd)){
					System.out.println("密码成功更改。");
					pstmt2.setString(1,newpwd);
					pstmt2.executeUpdate();
					flag=1;//flag 等于1代表成功更改
				}else if(password.equals(oldpwd)&&password.equals(newpwd)){
					System.out.println("新旧密码相同，更改失败！！！");
					flag=2;
				}else{
					System.out.println("密码错误，更改失败！！！");
					flag=3;
				}
			}
			
			
			return flag;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
			return flag;
		}catch (SQLException e) {
			e.printStackTrace();
			return flag;
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
