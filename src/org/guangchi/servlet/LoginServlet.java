package org.guangchi.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.guangchi.dao.LoginDao;
import org.guangchi.entity.Login;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	public LoginServlet() {
		// TODO Auto-generated constructor stub
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8" );
		String name=request.getParameter("uname");
		String pwd=request.getParameter("pwd"); 
		Login.setName(name);
		Login.setPwd(pwd);
		System.out.println(name+"  "+pwd);
		int result=LoginDao.login();
		if(result==1) {
			response.sendRedirect("CreateReservationServlet");
			System.out.println("login servlet");
		}else {
			response.sendRedirect("m-home-unlogin.jsp");
		}
	}

}
