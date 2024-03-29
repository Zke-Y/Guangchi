package org.guangchi.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.guangchi.dao.CustomerUpdatepwd;

@WebServlet("/CustomerUpdatepwdServlet")
public class CustomerUpdatepwdServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8" );
		String newpwd=request.getParameter("newpwd");
		String oldpwd=request.getParameter("oldpwd");
		System.out.println(oldpwd+" "+newpwd);
		int flag=CustomerUpdatepwd.Updatepwd(oldpwd, newpwd);
		request.setAttribute("flag",flag);
		request.getRequestDispatcher("success.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
