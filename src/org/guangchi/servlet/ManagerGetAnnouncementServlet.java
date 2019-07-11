package org.guangchi.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.guangchi.dao.ManagerGetAnnouncementInfoDao;
import org.guangchi.entity.announcement;


@WebServlet("/ManagerGetAnnouncementServlet")
public class ManagerGetAnnouncementServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8" );
		ArrayList<announcement> announcementList=new ArrayList<>();
		ManagerGetAnnouncementInfoDao.MGetAnnouncementInfo(announcementList);
		request.setAttribute("announcementList",announcementList);
		request.getRequestDispatcher("bc-news.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
