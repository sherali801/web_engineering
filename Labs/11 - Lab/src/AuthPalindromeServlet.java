import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AuthPalindromeServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String expression = request.getParameter("expression");
		ServletConfig config = getServletConfig();
		String authUsername = config.getInitParameter("username");
		String authPassword = config.getInitParameter("password");
		PrintWriter pw = response.getWriter();
		if (username.equals(authUsername) && password.equals(authPassword)) {
			if (isPalindrome(expression.toCharArray())) {
				pw.println("<p>This expression " + expression + " is palindrome</p>");
			} else {
				pw.println("<p>This expression " + expression + " isn't palindrome</p>");
			}
		} else {
			pw.println("<p>You have entered wrong username or password</p>");
		}
		pw.close();
	}

	private boolean isPalindrome(char[] str) {
		for (int i = 0; i < str.length; i++) {
			if (str[i] != str[(str.length - 1) - i]) {
				return false;
			}
		}
		return true;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
