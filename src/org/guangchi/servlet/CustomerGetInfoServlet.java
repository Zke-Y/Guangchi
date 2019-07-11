package org.guangchi.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.guangchi.dao.CustomerGetCredit;
import org.guangchi.entity.Login;


@WebServlet("/CustomerGetInfoServlet")
public class CustomerGetInfoServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8" );
		String name=Login.getName();
		String isCredit=CustomerGetCredit.GetInfo(name);
		request.setAttribute("name",name);
		request.setAttribute("isCredit",isCredit);
		request.getRequestDispatcher("u-module.jsp#info").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
