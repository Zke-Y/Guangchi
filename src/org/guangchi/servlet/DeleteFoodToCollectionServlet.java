package org.guangchi.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.guangchi.dao.DeleteFoodToCollectionDao;
import org.guangchi.entity.Login;


@WebServlet("/DeleteFoodToCollectionServlet")
public class DeleteFoodToCollectionServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8" );
		String fname=new String();
		fname=request.getParameter("fname");
		System.out.println("É¾³ý"+fname);
		DeleteFoodToCollectionDao.DeleteFoodToCollection(fname, Login.getName());
			response.sendRedirect("SelectFoodToCollectionServlet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			doGet(request, response);
	}

}
