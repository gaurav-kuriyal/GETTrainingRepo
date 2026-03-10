package com.coforge.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.List;

import com.coforge.dao.EmployeeDAO;
import com.coforge.models.Employee;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public EmployeeServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		RequestDispatcher rd = null;
		switch(action) {
		case "list":
			List<Employee> empList = EmployeeDAO.getAllEmployees();
			request.setAttribute("empList", empList);
			rd = request.getRequestDispatcher("employee-list.jsp");
			rd.forward(request, response);
			break;
		case "new":
			rd = request.getRequestDispatcher("employee-form.jsp");
			rd.forward(request, response);
			break;
		case "edit":
			int eid = Integer.parseInt(request.getParameter("eid"));
			Employee emp = EmployeeDAO.getEmployeeById(eid);
			request.setAttribute("employee", emp);
			rd = request.getRequestDispatcher("employee-form.jsp");
			rd.forward(request, response);
			break;
		}
	}
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String eid = request.getParameter("eid");
		String ename = request.getParameter("ename");
		long salary = Long.parseLong(request.getParameter("salary"));
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		LocalDate doj = LocalDate.parse(request.getParameter("doj"));
		LocalDate dob = LocalDate.parse(request.getParameter("dob"));
		
		PrintWriter out = response.getWriter();
		RequestDispatcher rd = null;
		if(eid==null || eid.isEmpty()) {
			Employee e = new Employee(ename,salary,email,mobile,doj,dob);
			if(EmployeeDAO.addEmployee(e) == null) {
				out.println("Data not added");
			}

		} else {
			
		}

		response.sendRedirect("EmployeeServlet?action=list");

	}

}
