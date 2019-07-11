package org.guangchi.servlet;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.guangchi.dao.SelectReservationDao;
import org.guangchi.entity.Login;
import org.guangchi.entity.Reservation;


@WebServlet("/SelectReservationServlet")
public class SelectReservationServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8" );
		String name=Login.getName();
		ArrayList<Reservation> reservationList=new ArrayList<>();
		System.out.println("servlet starting");
		SelectReservationDao.SelectReservation(name,reservationList);
		request.setAttribute("reservationList",reservationList);
		System.out.println("≤È—Ø∂©µ•÷¥––"+name);
		request.getRequestDispatcher("u-order-list.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request,response);
	}

}
