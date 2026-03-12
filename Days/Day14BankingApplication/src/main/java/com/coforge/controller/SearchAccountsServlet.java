package com.coforge.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.coforge.dao.AccountDAO;
import com.coforge.model.Account;

import jakarta.servlet.ServletContext;

/**
 * Servlet implementation class SearchAccountsServlet
 */
@WebServlet("/SearchAccountsServlet")
public class SearchAccountsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LogManager.getLogger(AddAccountServlet.class);
    /**
     * Default constructor. 
     */
    public SearchAccountsServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			ServletContext context = getServletContext();
			Connection con = (Connection) context.getAttribute("connection");
			String query = request.getParameter("query");
			List<Account> accList;
			accList = AccountDAO.getAccountFromQuery(con,query);
		
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<form action='SearchAccountsServlet'>");
				out.println("<input type='text' name='query' placeholder='Please enter Account Number, Account Type, Account Holder Name to search' />");
				out.println("<button>Search</button>");
			out.println("</form>");
			out.println("<a href='ViewAccountsServlet'>View All Acounts</a>");
			out.println("<table border='2px'>");
			out.println("<thead>");
				out.println("<tr>");
					out.println("<th> Account Number</th> ");
					out.println("<th> Account Type</th> ");
					out.println("<th> Account Holder Name</th> ");
					out.println("<th> Balance</th> ");
					out.println("<th colspan='3'> Actions</th> ");
					out.println("<th colspan='2'> Transaction Actions</th> ");
				out.println("</tr>");
			out.println("</thead>");
			out.println("<tbody>");		
				for(Account a: accList) {
					out.println("<tr>");
						out.println("<td> "+a.getAccNo()+"</td> ");
						out.println("<td> "+a.getAccType()+"</td> ");
						out.println("<td> "+a.getAccHolderName()+"</td> ");
						out.println("<td> "+a.getBalance()+"</td> ");
						out.println("<td><a href='EditAccountServlet?accNo="+a.getAccNo()+"'>Edit</a></td> ");
						out.println("<td><a href='ViewAccountServlet?accNo="+a.getAccNo()+"'>View</a></td> ");
						out.println("<td><a href='DeleteAccountServlet?accNo="+a.getAccNo()+"'>Delete</a></td> ");
						out.println("<td><a href='DepositServlet?accNo="+a.getAccNo()+"'>Deposit</a></td> ");
						out.println("<td><a href='WithdrawServlet?accNo="+a.getAccNo()+"'>Withdraw</a></td> ");
					out.println("</tr>");
				}
			out.println("</tbody>");		
			out.println("</table>");
			out.println("</html>");
			out.println("</body>");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.info(e);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
