package org.guangchi.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.guangchi.dao.CreateReservationDao;
import org.guangchi.dao.SelectNewReservationDao;
import org.guangchi.entity.Login;


@WebServlet("/CreateReservationServlet")
public class CreateReservationServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8" );
		String name=Login.getName();
		CreateReservationDao.CreateReservation(name);
		SelectNewReservationDao.SelectNewReservation(name);
		response.sendRedirect("m-class.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
