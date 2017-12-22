import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class InfoRetrievalServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstNameInput = request.getParameter("firstName");
        FileReader fr = new FileReader("C:\\servers\\tomcat_8.5\\temp\\output.txt");
        BufferedReader br = new BufferedReader(fr);
        String firstName = "", lastName = "", dob = "", gender = "", email = "";
        String info;
        String[] arrayOfCommaSeparatedInfo;
        while ((info = br.readLine()) != null) {
            arrayOfCommaSeparatedInfo = info.split(",");
            if (firstNameInput.equals(arrayOfCommaSeparatedInfo[0])) {
                firstName = arrayOfCommaSeparatedInfo[0];
                lastName = arrayOfCommaSeparatedInfo[1];
                dob = arrayOfCommaSeparatedInfo[2];
                gender = arrayOfCommaSeparatedInfo[3];
                email = arrayOfCommaSeparatedInfo[4];
                break;
            }
        }
        br.close();
        fr.close();
        PrintWriter pw = response.getWriter();
        pw.print("<!DOCTYPE html>");
        pw.print("<html>");
        pw.print("<head>");
        pw.print("<title>");
        pw.print("Form");
        pw.print("</title>");
        pw.print("</head>");
        pw.print("<body>");
        pw.print("<p>First Name: " + firstName + "</p><br>");
        pw.print("<p>Last Name: " + lastName + "</p><br>");
        pw.print("<p>Date of Birth: " + dob + "</p><br>");
        pw.print("<p>Gender: " + gender + "</p><br>");
        pw.print("<p>Email: " + email + "</p><br>");
        pw.print("</body>");
        pw.print("</html>");
    }

}
