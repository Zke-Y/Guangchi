package org.guangchi.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.guangchi.dao.AddFoodToCollectionDao;
import org.guangchi.entity.Login;


@WebServlet("/AddFoodToCollectionServlet")
public class AddFoodToCollectionServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8" );
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html,charset=UTF-8");
		String fname=request.getParameter("fname");
		System.out.println(fname);
		AddFoodToCollectionDao.AddFoodToCollection(fname, Login.getName());
		
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			doGet(request, response);
	}

}
