import bean.UserBean;
import dao.UserDAO;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/login"})
public class LogInServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/logIn.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String logInName = request.getParameter("logInName").trim();
        String password = request.getParameter("password").trim();
        UserBean user = (new UserDAO()).read(logInName);
        if (user != null &&  logInName.equals(user.getLogInName()) && password.equals(user.getPassword())) {
            HttpSession session = request.getSession(true);
            session.setAttribute("logInName", user.getLogInName());
            getServletContext().getRequestDispatcher("/WEB-INF/welcome.jsp").forward(request, response);
        } else {
            getServletContext().getRequestDispatcher("/WEB-INF/signUp.jsp").forward(request, response);
        }
    }

}
