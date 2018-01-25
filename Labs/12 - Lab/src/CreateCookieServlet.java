import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CreateCookieServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		ServletConfig config = getServletConfig();
		String authUsername = config.getInitParameter("username");
		String authPassword = config.getInitParameter("password");
		PrintWriter pw = response.getWriter();
		if (username.equals(authUsername) && password.equals(authPassword)) {
			Cookie cUsername = new Cookie("username", username);
			cUsername.setMaxAge(60);
			Cookie cPassword = new Cookie("password", password);
			cPassword.setMaxAge(60);
			response.addCookie(cUsername);
			response.addCookie(cPassword);
			pw.println("<p>Cookies are created. Click on the below button to get cookies.<p>");
			pw.println("<form action=\"/12 - Lab/GetCookieServlet\" method=\"post\">"
					+ "<input type=\"submit\" value=\"Get Cookie\">"
					+ "</form>");
		} else {
			pw.println("<p>Sorry username or password error!</p>");
			getServletContext().getRequestDispatcher("/task2.html").include(request, response);
		}
		pw.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
