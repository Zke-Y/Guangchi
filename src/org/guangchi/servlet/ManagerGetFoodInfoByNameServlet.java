package org.guangchi.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.guangchi.dao.ManagerGetFoodInfoByName;
import org.guangchi.entity.Food;

/**
 * Servlet implementation class ManagerGetFoodInfoByNameServlet
 */
@WebServlet("/ManagerGetFoodInfoByNameServlet")
public class ManagerGetFoodInfoByNameServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8" );
		ArrayList<Food> foodList=new ArrayList<>();
		String fname=request.getParameter("foodname");
		ManagerGetFoodInfoByName.MGetFoodInfo(fname,foodList);
		request.setAttribute("foodList",foodList);
		request.getRequestDispatcher("bc-goods.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
