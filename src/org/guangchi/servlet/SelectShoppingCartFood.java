package org.guangchi.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.guangchi.dao.FoodOfReservationDao;
import org.guangchi.dao.SelectNewReservationDao;
import org.guangchi.entity.Food;
import org.guangchi.entity.Login;

@WebServlet("/SelectShoppingCartFood")
public class SelectShoppingCartFood extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8" );
		System.out.println(Login.getName()+"查看购物车");
		int id= SelectNewReservationDao.SelectNewReservation(Login.getName());
		System.out.println("搜索购物车"+id);
		ArrayList<Food> gouwucheList=new ArrayList<>();
		FoodOfReservationDao.GetFoodInfo(id,gouwucheList);
		request.setAttribute("gouwucheList",gouwucheList);
		request.getRequestDispatcher("m-shoppingCart.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
