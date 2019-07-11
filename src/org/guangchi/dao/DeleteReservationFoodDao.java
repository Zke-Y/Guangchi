package org.guangchi.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DeleteReservationFoodDao {
	public static void DeleteReservationFood(String fname,int rid) {
		Connection conn=null;
        CallableStatement cstmt = null;    
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://106.52.87.204/Java_Test?useSSL=false&serverTimezone=GMT&useUnicode=true&characterEncoding=utf8","root","chen123");
	             cstmt=conn.prepareCall("{call precourse_DeleteFoodToReservation(?,?)}");
	            cstmt.setString(1,fname);  
	            cstmt.setInt(2,rid);  
	            cstmt.execute();
	        }catch(SQLException se){     
	            System.out.println("���ݿ�����ʧ�ܣ�");     
	            se.printStackTrace() ;     
	        } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{  
	            }     
	            if(cstmt != null){   // �ر�����     
	                try{     
	                    cstmt.close() ;     
	                }catch(SQLException e){     
	                    e.printStackTrace() ;     
	                }     
	            }     
	            if(conn != null){  // �ر����Ӷ���     
	                try{     
	                    conn.close() ;     
	                }catch(SQLException e){     
	                    e.printStackTrace() ;     
	                }     
	            }    
	        }   
}


