package org.guangchi.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.guangchi.dao.CustomerInfoDao;
import org.guangchi.dao.ManagerGetFoodInfo;
import org.guangchi.entity.Food;


@WebServlet("/ManagerGetFoodInfoServlet")
public class ManagerGetFoodInfoServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8" );
		ArrayList<Food> foodList=new ArrayList<>();
		ManagerGetFoodInfo.MGetFoodInfo(foodList);
		
		request.setAttribute("foodList",foodList);
		request.getRequestDispatcher("bc-goods.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
