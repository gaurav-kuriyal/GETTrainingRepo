package com.coforge.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.coforge.dao.CustomerDao;
import com.coforge.entities.Customer;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CustomerServlet
 */
@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CustomerServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		try {
			String action = request.getParameter("action");
			if(action.equals("select")) {
				List<Customer> customers = CustomerDao.getAllCustomers();
				if(customers == null) {
					out.println("No Customers");
					return;
				}
				out.println(customers);
			}
			else if(action.equals("insert")) {
				Customer customer = CustomerDao.addCustomer(new Customer(2,"Rajat","Hyderabad","78678687","rajat@mail.com"));
				if(customer == null) {
					out.println("Failed to add customer");
					return;
				}
				out.println(customer);
			}
			else if(action.equals("get")) {
				String custId = request.getParameter("custId");
				long id = Long.parseLong(custId);
				Customer customer = CustomerDao.getCustomerById(id);
				if(customer == null) {
					out.println("Failed to get customer");
					return;
				}
				out.println(customer);
			}
			else {
				out.println("Invalid action");
			}
		} catch(Exception e) {
			System.out.println(e);
			out.println("Internal Servor Error");
		}
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
