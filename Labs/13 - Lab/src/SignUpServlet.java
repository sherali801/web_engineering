import bean.UserBean;
import dao.UserDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/signup"})
public class SignUpServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/signUp.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName").trim();
        String lastName = request.getParameter("lastName").trim();
        String name = firstName + " " + lastName;
        String mobile = request.getParameter("mobile").trim();
        String email = request.getParameter("email").trim();
        String logInName = request.getParameter("logInName").trim();
        String password = request.getParameter("password").trim();
        UserBean user = new UserBean();
        user.setName(name);
        user.setMobile(mobile);
        user.setEmail(email);
        user.setLogInName(logInName);
        user.setPassword(password);
        if ((new UserDAO()).create(user)) {
            getServletContext().getRequestDispatcher("/WEB-INF/logIn.jsp").forward(request, response);
        } else {
            doGet(request, response);
        }
    }
    
}
