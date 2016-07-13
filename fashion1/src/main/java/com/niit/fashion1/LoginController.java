package com.niit.fashion1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("doget");
		String userid=request.getParameter("userid");
		String password=request.getParameter("password");
		LoginDAO loginDAO=new LoginDAO();
		RequestDispatcher dispatcher;
		if(loginDAO.isValidUser(userid,password) == true)
		{
			dispatcher = request.getRequestDispatcher("home.html");
			dispatcher.include(request,response );
		}
		else
		{
			dispatcher = request.getRequestDispatcher("login.html");
			PrintWriter writer = response.getWriter();
			writer.append("invalid credential .... please enter correct values");
			dispatcher.include(request, response);
			
		}
		 
	}
 
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

}
