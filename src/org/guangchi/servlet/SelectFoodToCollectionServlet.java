package org.guangchi.servlet;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.guangchi.dao.SelectFoodToCollectionDao;
import org.guangchi.entity.Food;
import org.guangchi.entity.Login;



@WebServlet("/SelectFoodToCollectionServlet")
public class SelectFoodToCollectionServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8" );
		ArrayList<Food> foodList=new ArrayList<>();
		SelectFoodToCollectionDao.SelectFoodToCollection(Login.getName(),foodList);
		request.setAttribute("foodList",foodList);
		request.getRequestDispatcher("u-collection.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);	
	}

}
