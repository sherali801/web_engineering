import bean.UserBean;
import dao.UserDAO;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/displaycontact"})
public class DisplayContactServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        if (session != null) {
            UserBean user = (new UserDAO()).read((String) session.getAttribute("logInName"));
            request.setAttribute("user", user);
            getServletContext().getRequestDispatcher("/WEB-INF/displayContact.jsp").forward(request, response);
        } else {
            getServletContext().getRequestDispatcher("/WEB-INF/logIn.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}
