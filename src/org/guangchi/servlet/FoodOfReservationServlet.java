package org.guangchi.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.guangchi.dao.FoodOfReservationDao;
import org.guangchi.entity.Food;

@WebServlet("/FoodOfReservationServlet")
public class FoodOfReservationServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8" );
		int id=Integer.parseInt(request.getParameter("id"));
		int sumcost=Integer.parseInt(request.getParameter("sumcost"));
		System.out.println(id);
		ArrayList<Food> foodList=new ArrayList<>();
		FoodOfReservationDao.GetFoodInfo(id,foodList);
		request.setAttribute("foodList",foodList);
		request.setAttribute("sumcost",sumcost);
		request.getRequestDispatcher("u-details.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
