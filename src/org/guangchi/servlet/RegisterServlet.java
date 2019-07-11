package org.guangchi.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.guangchi.dao.LoginDao;
import org.guangchi.dao.RegisterDao;
import org.guangchi.entity.Login;



@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("....");
		request.setCharacterEncoding("utf-8" );
		response.setContentType("text/html; charset=UTF-8");
		String name=request.getParameter("uname");
		String pwd=request.getParameter("upwd"); 
		System.out.println(name+"  "+pwd);
		Login.setName(name);
		Login.setPwd(pwd);
		int result=LoginDao.login();
		//request.setAttribute("result",result);
		//request.getRequestDispatcher("test.jsp").forward(request, response);
		if(result==1) {
			response.sendRedirect("Welcome.jsp");
		;
		}else if(result==0){
			RegisterDao.Register();
			result=LoginDao.login();
			if(result==1) {
				 response.sendRedirect("m-Customer-login.jsp");
			}else if(result==0){
				
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);	
	}

}
