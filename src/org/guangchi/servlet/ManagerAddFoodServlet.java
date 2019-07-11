package org.guangchi.servlet;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.guangchi.dao.ManagerAddFoodDao;
import org.guangchi.entity.Food;
import org.guangchi.entity.NewFood;
@WebServlet("/ManagerAddFoodServlet")
public class ManagerAddFoodServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8" );
		String fname=request.getParameter("foodname");
		String ftype=request.getParameter("foodtype");
		int fprice=Integer.parseInt(request.getParameter("foodprice"));
		NewFood food=new NewFood(fname,ftype,fprice);
		response.sendRedirect("bc-add-photo.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
