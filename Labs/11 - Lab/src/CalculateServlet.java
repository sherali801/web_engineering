import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CalculateServlet extends HttpServlet {
	private int price = 15;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		int bill = quantity * price;
		request.setAttribute("bill", bill + "");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
