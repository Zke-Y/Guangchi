package org.guangchi.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.guangchi.dao.CustomerInfoByNameDao;
import org.guangchi.dao.CustomerInfoDao;
import org.guangchi.entity.Customer;

@WebServlet("/GetCustomerInfoByNameServlet")
public class GetCustomerInfoByNameServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8" );
		String name=request.getParameter("uname");
		ArrayList<Customer> customerList=new ArrayList<>();
		CustomerInfoByNameDao.GetInfo(name,customerList);
		request.setAttribute("customerList",customerList);
		request.getRequestDispatcher("bc-user.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
