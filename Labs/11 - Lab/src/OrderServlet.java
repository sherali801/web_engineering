import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class OrderServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String quantity = request.getParameter("quantity");
		request.setAttribute("quantity", quantity);
		getServletContext().getRequestDispatcher("/CalculateServlet").include(request, response);
		PrintWriter pw = response.getWriter();
		pw.println("<p>Bill: " + request.getAttribute("bill") + "</p>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
