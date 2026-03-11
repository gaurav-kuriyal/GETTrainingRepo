package com.coforge;

import java.io.IOException;
import java.time.LocalDate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoggingServlet
 */
@WebServlet("/LoggingServlet")
public class LoggingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LogManager.getLogger(LoggingServlet.class);
    /**
     * Default constructor. 
     */
    public LoggingServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String clientIp = request.getRemoteAddr();
		String header = request.getHeader("User-Agent");
		String method = request.getMethod();
		logger.info("Form Submitted at {}",LocalDate.now());
		logger.info("User Name: {}",uname);
		logger.info("Client IP: {}",clientIp);
		logger.info("User Agent: {}",header);
		logger.info("Request Method: {}",method);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
