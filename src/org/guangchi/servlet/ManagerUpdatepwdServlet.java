package org.guangchi.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.guangchi.dao.CustomerInfoDao;
import org.guangchi.dao.ManagerUpdatepwd;
import org.guangchi.entity.Customer;


@WebServlet("/ManagerUpdatepwdServlet")
public class ManagerUpdatepwdServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8" );
		String oldpwd=request.getParameter("oldpwd");
		String newpwd=request.getParameter("newpwd");
		System.out.println(oldpwd+"  "+newpwd);
		int flag=ManagerUpdatepwd.Updatepwd(oldpwd, newpwd);
		request.setAttribute("flag",flag);
		request.getRequestDispatcher("bc-psd.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
