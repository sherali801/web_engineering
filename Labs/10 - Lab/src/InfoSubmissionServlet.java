import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class InfoSubmissionServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String dob = request.getParameter("dob");
        String gender = request.getParameter("gender");
        String email = request.getParameter("email");
        FileWriter fw = new FileWriter("C:\\servers\\tomcat_8.5\\temp\\output.txt", true);
        fw.write(firstName + ",");
        fw.write(lastName + ",");
        fw.write(dob + ",");
        fw.write(gender + ",");
        fw.write(email + "\r\n");
        fw.close();
        PrintWriter pw = response.getWriter();
        pw.print("<!DOCTYPE html>");
        pw.print("<html>");
        pw.print("<head>");
        pw.print("<title>");
        pw.print("Info Submission");
        pw.print("</title>");
        pw.print("</head>");
        pw.print("<body>");
        pw.print("<h1>");
        pw.print("Info Submitted!");
        pw.print("</h1>");
        pw.print("</body>");
        pw.print("</html>");
    }

}
