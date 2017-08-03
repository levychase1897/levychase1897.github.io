package edu.acc.java;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletGArray
 */
@WebServlet("/ServletGArray")
public class ServletGArray extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletGArray() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// put them in an array
    	HeaderBeanSingle[] my_3_beans = new HeaderBeanSingle[3];
    	my_3_beans[0] = new HeaderBeanSingle("host", request.getHeader("host"));
    	my_3_beans[1] = new HeaderBeanSingle("accept", request.getHeader("accept"));
    	my_3_beans[2] = new HeaderBeanSingle("user_agent", request.getHeader("user-agent"));

    	// save array in attributes
    	request.setAttribute("binky", my_3_beans);

		// store bean where JSP can get to it
		this.getServletContext()
		    .getRequestDispatcher("/servletGArray.jsp")
		    .forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
