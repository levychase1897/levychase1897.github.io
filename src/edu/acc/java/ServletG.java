package edu.acc.java;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletG
 */

/*
 * Lab: 
 *   - Write a new JavaBean named HeaderBean that holds three header types 
 *     (your choice, use getHeader())
 *   - Write a new servlet (ServletG) that creates a HeaderBean and loads it
 *     and passes to to a JSP (servletG.jsp)
 *   - Write a JSP that prints the headers passed in HeaderBean
 * 
 */
@WebServlet("/ServletG")
public class ServletG extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletG() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get some header data
		
		String host = request.getHeader("host");
		String accept = request.getHeader("accept");
		String userAgent = request.getHeader("user-agent");
		// put data in HeaderBean container
		HeaderBean bean = new HeaderBean(host, userAgent, accept);
		// store bean where JSP can get to it
		request.setAttribute("binky", bean);
		// forward to the JSP
		this.getServletContext()
		    .getRequestDispatcher("/servletG.jsp")
		    .forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
