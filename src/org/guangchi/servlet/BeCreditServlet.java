package org.guangchi.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.guangchi.dao.BeCreditDao;
import org.guangchi.entity.Login;


@WebServlet("/BeCreditServlet")
public class BeCreditServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8" );
		String name=request.getParameter("uname");
		String pwd=request.getParameter("upwd"); 
		Login login=new Login();
		Login.setName(name);
		Login.setPwd(pwd);
		BeCreditDao.BeCredit();
	}

}
