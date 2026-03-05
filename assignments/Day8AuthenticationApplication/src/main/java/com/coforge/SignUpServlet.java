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
 * Servlet implementation class SignUpServlet
 */
@WebServlet("/SignUpServlet")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SignUpServlet() {
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
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		
		RequestDispatcher rd = null;
		try {
			User u = new User(uname, pwd, email, mobile);
			UserCollection.add_to_db(u);
			rd = request.getRequestDispatcher("/signin.jsp");
			rd.forward(request, response);
		}
		catch(Exception e) {
			request.setAttribute("error", e.getMessage());
			rd = request.getRequestDispatcher("/error.jsp");
			rd.forward(request, response);
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
