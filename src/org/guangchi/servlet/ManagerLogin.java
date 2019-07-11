package org.guangchi.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ManagerLogin")
public class ManagerLogin extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8" );
		String name=request.getParameter("Managername");
		String pwd=request.getParameter("Managerpwd");
		System.out.println(name);
		System.out.println(pwd);
		if("chentaijie".contentEquals(name)&&"chen123".contentEquals(pwd)) {
			System.out.println("登陆成功");
			response.sendRedirect("bc-order.jsp");
		}else {
			//做出登陆失败后的操作
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request,response);
	}

}
