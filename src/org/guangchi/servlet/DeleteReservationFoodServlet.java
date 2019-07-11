package org.guangchi.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.guangchi.dao.DeleteReservationFoodDao;
import org.guangchi.entity.NewReservation;


@WebServlet("/DeleteReservationFoodServlet")
public class DeleteReservationFoodServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8" );
		String name=request.getParameter("fname");
		int rid=NewReservation.st_reservation;
		DeleteReservationFoodDao.DeleteReservationFood(name, rid);
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request,response);
	}

}