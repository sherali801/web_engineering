import com.google.gson.Gson;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/getcities"})
public class GetCitiesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/cities.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String province = request.getParameter("province");
        ArrayList<String> cities = getCities(province);
        String jsonResponse = new Gson().toJson(cities);
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(jsonResponse);
    }

    private ArrayList<String> getCities(String province) {
        ArrayList<String> cities = new ArrayList<>();
        switch (province) {
            case "1":
                cities.add("Lahore");
                cities.add("Multan");
                break;
            case "2":
                cities.add("Peshawar");
                cities.add("Mardan");
                break;
            case "3":
                cities.add("Quetta");
                cities.add("Gawadar");
                break;
            case "4":
                cities.add("Karachi");
                cities.add("Hyderabad");
                break;
            default:
                break;
        }
        return cities;
    }

}
