package edu.acc.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class OCAtest
 */
@WebServlet("/OCAtest")
public class OCAtest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public OCAtest() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		HttpSession session = request.getSession();
		List<Path> questions = null; // the question paths

		if (session.getAttribute("questions") == null) {
			// get question root path and build question list
			String questionRoot = request.getParameter("questionRoot");
			if (questionRoot == null) {
				out.println("<p>missing questionRoot parameter");
				return;
			}
			questions = new ImageVisitor("jpg", questionRoot).getCollection();
			session.setAttribute("questions", questions);
			out.println("question count:" + questions.size());
		} else {
			// send a random question from map to JSP
			questions = (List<Path>) session.getAttribute("questions");
		}

		if (questions.isEmpty()) {
			out.println("<p>done");
			return;
		}
		// still more questions
		Random rand = new Random();
		Path randomQuestionPath = questions.remove(rand.nextInt(questions.size()));
		// make next question accessible to JSP
		String appRoot = getServletContext().getRealPath("/");
		out.println("<br>app root: " + appRoot);
		Path questionsFolderPath = Paths.get(appRoot).resolve("questions"); // questions
																			// folder
																			// path
		out.println("<br>questions folder path: " + questionsFolderPath);
		if (!Files.exists(questionsFolderPath)) { // make sure a place to put
													// questions exists or
													// create one
			Files.createDirectory(questionsFolderPath);
			out.println("<br>making questions folder path");
		}
		Path nextQuestionPath = questionsFolderPath.resolve("nextQuestion.jpg");
		out.println("<br>next question path: " + nextQuestionPath);
		Files.copy(randomQuestionPath, nextQuestionPath, java.nio.file.StandardCopyOption.REPLACE_EXISTING);
		this.getServletContext().getRequestDispatcher("/OCAtest.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
