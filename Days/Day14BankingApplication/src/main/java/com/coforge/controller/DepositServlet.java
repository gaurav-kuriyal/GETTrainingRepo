package com.coforge.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.coforge.dao.AccountDAO;
import com.coforge.model.Account;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DepositServlet
 */
@WebServlet("/DepositServlet")
public class DepositServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LogManager.getLogger(AddAccountServlet.class);
    /**
     * Default constructor. 
     */
    public DepositServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		try {
			int accNo = Integer.parseInt(request.getParameter("accNo"));
			out.println("<html>");
			out.println("<body>");
			out.println("<form action='DepositServlet?accNo="+accNo+"'  method='post'>");
				out.println("<label>Amount: </label>");
				out.println("<input type='number' name='amount' /><br>");
				out.println("<button>Deposit</button>");
			out.println("</form>");
			out.println("</html>");
			out.println("</body>");
		}catch (Exception e) {
			e.printStackTrace();
			logger.info(e);
			out.println("error");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext context = getServletContext();
		Connection con = (Connection) context.getAttribute("connection");
		try {
			int accNo = Integer.parseInt(request.getParameter("accNo"));
			double amount= Double.parseDouble(request.getParameter("amount"));
	
			AccountDAO.transactAccount(con,accNo,"deposit",amount);
			response.sendRedirect("ViewAccountServlet?accNo="+accNo);
		}
		catch (Exception e) {
			e.printStackTrace();
			PrintWriter out = response.getWriter();
			logger.info(e);
			out.println("Error");
		}
	}

}
