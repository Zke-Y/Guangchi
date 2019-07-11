package org.guangchi.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.guangchi.dao.ManagerCreateAnnouncementDao;
import org.guangchi.dao.ManagerGetAnnouncementInfoDao;
import org.guangchi.entity.announcement;


@WebServlet("/ManagerCreateAnnoServlet")
public class ManagerCreateAnnoServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8" );
		String context=request.getParameter("context");
		ManagerCreateAnnouncementDao.CreateAnnouncement(context);
		request.getRequestDispatcher("/ManagerGetAnnouncementServlet").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
