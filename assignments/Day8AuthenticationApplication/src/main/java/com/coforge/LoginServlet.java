package com.coforge;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		
		RequestDispatcher rd = null;
		User u = UserCollection.fetch_from_db(uname);
		if(u == null) {
			request.setAttribute("error", "User not found");
			rd = request.getRequestDispatcher("/error.jsp");
			rd.forward(request, response);
		}
		else if(u.checkPassword(pwd)) {
			
//			out.println("Welcome "+uname);
			request.setAttribute("uname", u.getUsername());
			request.setAttribute("email", u.getEmail());
			request.setAttribute("mobile", u.getMobile());
			rd = request.getRequestDispatcher("/welcome.jsp");
			rd.forward(request, response);
		}
		else {
			request.setAttribute("error", "Invalid Credentials");
			rd = request.getRequestDispatcher("/error.jsp");
			rd.forward(request, response);
//			out.println("<html><body><h1 style=\"color:red;\" >Invalid Credentials</h1></body></html>");
		}
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
