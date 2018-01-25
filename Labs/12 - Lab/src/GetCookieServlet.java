import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class GetCookieServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		Cookie[] cookies = request.getCookies();
		Cookie c = null;
		for (int i = 0; i < cookies.length; i++) {
			c = cookies[i];
			if (c.getName().equals("username") && !c.getValue().equals("")) {
				pw.println("<p>Cookie Name: " + c.getName() + "</p>");
				pw.println("<p>Cookie Value: " + c.getValue() + "</p>");
			}
			if (c.getName().equals("password") && !c.getValue().equals("")) {
				pw.println("<p>Cookie Name: " + c.getName() + "</p>");
				pw.println("<p>Cookie Value: " + c.getValue() + "</p>");
			}

		}
		pw.println("<p>Click on the below button to delete cookies.<p>");
		pw.println("<form action=\"/12 - Lab/DeleteCookieServlet\" method=\"post\">"
				+ "<input type=\"submit\" value=\"Delete Cookie\">"
				+ "</form>");
		pw.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
