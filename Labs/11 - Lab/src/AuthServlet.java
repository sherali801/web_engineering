import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AuthServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		ServletConfig config = getServletConfig();
		String authUsername = config.getInitParameter("username");
		String authPassword = config.getInitParameter("password");
		PrintWriter pw = response.getWriter();
		if (username.equals(authUsername) && password.equals(authPassword)) {
			request.setAttribute("username", username);
			getServletContext().getRequestDispatcher("/WelcomeServlet").forward(request, response);
		} else {
			pw.println("<p>Sorry username or password error!</p>");
			getServletContext().getRequestDispatcher("/task2.html").include(request, response);
			pw.close();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
