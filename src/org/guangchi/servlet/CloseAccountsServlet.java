package org.guangchi.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.guangchi.dao.CloseAccountsDao;
import org.guangchi.entity.NewReservation;

@WebServlet("/CloseAccountsServlet")
public class CloseAccountsServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8" );
		int c;
		System.out.println("进入结账页面");
		c=CloseAccountsDao.CloseAccounts();
		String s=String.valueOf(c);
		System.out.println(s);
		request.setAttribute("s",s);
		request.getRequestDispatcher("CloseAccounts.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
