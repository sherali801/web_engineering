import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DeleteCookieServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		Cookie[] cookies = request.getCookies();
		for (int i = 0; i < cookies.length; i++) {
			cookies[i].setMaxAge(0);
			cookies[i].setPath("/");
			cookies[i].setValue("");
			response.addCookie(cookies[i]);
		}
		for (int i = 0; i < cookies.length; i++) {
			pw.println("<p>Cookie Name: " + cookies[i].getName() + ": Cookie Value: " + cookies[i].getValue() + "</p>");
		}
		
		pw.println("Deleted!");
		pw.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
