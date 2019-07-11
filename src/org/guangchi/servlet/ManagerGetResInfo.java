package org.guangchi.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.guangchi.dao.ManagReservationInfoDao;
import org.guangchi.entity.Reservation;


@WebServlet("/ManagerGetResInfo")
public class ManagerGetResInfo extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8" );
		ArrayList<Reservation> reservationList=new ArrayList<>();
		ManagReservationInfoDao.MGetReservationInfo(reservationList);
		request.setAttribute("reservationList",reservationList);
		request.getRequestDispatcher("bc-order.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
