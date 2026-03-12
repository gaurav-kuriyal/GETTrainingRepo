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
 * Servlet implementation class ViewAccountServlet
 */
@WebServlet("/ViewAccountServlet")
public class ViewAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LogManager.getLogger(AddAccountServlet.class);
    /**
     * Default constructor. 
     */
    public ViewAccountServlet() {
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
			out.println("<div>");
				out.println("<b>Account Number: </b>");
				out.println("<p>"+acc.getAccNo()+"</p>");
				
				out.println("<b>Account Holder Name: </b>");
				out.println("<p>"+acc.getAccHolderName()+"</p>");
				
				out.println("<b>Account Type: </b>");
				out.println("<p>"+acc.getAccType()+"</p>");
					
				out.println("<b>Balance: </b>");
				out.println("<p>"+acc.getBalance()+"</p>");
			out.println("</div>");
			out.println("<a href='ViewAccountsServlet'>View All Acounts</a>");
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
		doGet(request, response);
	}

}
