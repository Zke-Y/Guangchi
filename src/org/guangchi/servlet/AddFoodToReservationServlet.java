package org.guangchi.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.guangchi.dao.AddFoodToReservationDao;
import org.guangchi.dao.SelectNewReservationDao;
import org.guangchi.dao.UpdateOrderDao;
import org.guangchi.entity.Login;
import org.guangchi.entity.NewReservation;


@WebServlet("/AddReservationServlet")
public class AddFoodToReservationServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8" );
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html,charset=UTF-8");
		String name=request.getParameter("fname");
		int price=Integer.parseInt(request.getParameter("fprice"));
		System.out.println(price);
		UpdateOrderDao.UpdateOrderCost(price);
		int rid=SelectNewReservationDao.SelectNewReservation(Login.getName());
		AddFoodToReservationDao.AddReservation(name, rid);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request,response);
	}

}
