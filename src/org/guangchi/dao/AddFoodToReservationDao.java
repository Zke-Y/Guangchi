package org.guangchi.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AddFoodToReservationDao {
	public static void AddReservation(String fname,int Rid) {
		Connection conn=null;
        CallableStatement cstmt = null;    
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://106.52.87.204/Java_Test?useSSL=false&serverTimezone=GMT&useUnicode=true&characterEncoding=utf8","root","chen123");
			cstmt=conn.prepareCall("{call precourse_AddFoodToReservation(?,?)}");
	            cstmt.setString(1,fname);  
	            cstmt.setInt(2,Rid); 
	            cstmt.execute();
	        }catch(SQLException se){     
	            System.out.println("数据库连接失败！"); 
	            System.out.println(Rid); 
	            se.printStackTrace() ;     
	        } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{  
	            }     
	            if(cstmt != null){   // 关闭声明     
	                try{     
	                    cstmt.close() ;     
	                }catch(SQLException e){     
	                    e.printStackTrace() ;     
	                }     
	            }     
	            if(conn != null){  // 关闭连接对象     
	                try{     
	                    conn.close() ;     
	                }catch(SQLException e){     
	                    e.printStackTrace() ;     
	                }     
	            }    
	        }   
}


