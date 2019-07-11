package org.guangchi.servlet;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.guangchi.dao.SelectFoodTypeDao;
import org.guangchi.entity.Food;
import org.guangchi.entity.Login;


@WebServlet("/SelectDifangmeishiServlet")
public class SelectDifangmeishiServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8" );
		ArrayList<Food> foodList=new ArrayList<>();
		System.out.println("servlet starting");
		SelectFoodTypeDao.SelectFoodType("地方美食",foodList);
		request.setAttribute("foodList",foodList);
		request.getRequestDispatcher("m-class-2dfms.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8" );
		ArrayList<Food> foodList=new ArrayList<>();
		System.out.println("servlet starting");
		SelectFoodTypeDao.SelectFoodType("地方美食",foodList);
		request.setAttribute("foodList",foodList);
		request.getRequestDispatcher("m-class-2dfms.jsp").forward(request, response);
	}
}