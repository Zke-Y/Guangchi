package org.guangchi.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.guangchi.dao.ManagerDeleteAnnouncementDao;



@WebServlet("/ManagerDeleteAnnoServlet")
public class ManagerDeleteAnnoServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8" );
		int  id=Integer.parseInt(request.getParameter("id"));
		ManagerDeleteAnnouncementDao.DeleteAnnouncement(id);
		request.getRequestDispatcher("ManagerGetAnnouncementServlet").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
