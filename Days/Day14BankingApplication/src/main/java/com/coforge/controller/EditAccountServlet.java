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
 * Servlet implementation class EditAccountServlet
 */
@WebServlet("/EditAccountServlet")
public class EditAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LogManager.getLogger(AddAccountServlet.class);

    /**
     * Default constructor. 
     */
    public EditAccountServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext context = getServletContext();
		Connection con = (Connection) context.getAttribute("connection");
		PrintWriter out = response.getWriter();
		try {
			int accNo = Integer.parseInt(request.getParameter("accNo"));
			Account acc = AccountDAO.getAccount(con, accNo);
			out.println("<html>");
			out.println("<body>");
			out.println("<form action='EditAccountServlet' method='post'>");
				out.println("<label>Account Number: </label>");
				out.println("<input type='text' readOnly value='"+acc.getAccNo()+"' name='accNo' /><br>");
				
				out.println("<label>Account Holder Name: </label>");
				out.println("<input type='text' value='"+acc.getAccHolderName()+"'  name='accHolderName' /><br>");
				
				out.println("<label>Account Type: </label>");
				
				out.println("<select name='accType' >");
					out.println("<option value='savings' "+(acc.getAccType().equals("savings")?"selected":"")+">Savings</option>");
					out.println("<option value='current' "+(acc.getAccType().equals("current")?"selected":"")+">Current</option>");
				out.println("</select><br>");
	
				out.println("<label>Balance: </label>");
				out.println("<input type='number' value='"+acc.getBalance()+"'  name='balance' value='0' /><br>");
				
				out.println("<button>Submit</button>");
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
			String accHolderName = request.getParameter("accHolderName");
			String accType = request.getParameter("accType");
			double balance = Double.parseDouble(request.getParameter("balance"));
			AccountDAO.editAccount(con,new Account(accNo, accHolderName, accType, balance) );
			response.sendRedirect("ViewAccountsServlet");
		}
		catch (Exception e) {
			e.printStackTrace();
			PrintWriter out = response.getWriter();
			logger.info(e);
			out.println("Error");
		}
	}

}
