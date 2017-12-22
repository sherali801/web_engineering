import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloWorldServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter pw = response.getWriter();
        pw.print("<!DOCTYPE html>");
        pw.print("<html>");
        pw.print("<head>");
        pw.print("<title>");
        pw.print("Hello, World!");
        pw.print("</title>");
        pw.print("</head>");
        pw.print("<body>");
        String color = request.getParameter("color");
        pw.print("<h1 style=\"color: " + color + ";\">");
        pw.print("Hello, World!");
        pw.print("</h1>");
        pw.print("</body>");
        pw.print("</html>");
    }

}
