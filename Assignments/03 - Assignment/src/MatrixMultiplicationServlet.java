import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MatrixMultiplicationServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final int ROWS = 2;
		final int COLS = 2;
		int[][] a = new int[ROWS][COLS];
		int[][] b = new int[ROWS][COLS];
		int[][] c = new int[ROWS][COLS];
		String[] firstMatrixValues = request.getParameter("firstMatrix").split(",");
		String[] secondMatrixValues = request.getParameter("secondMatrix").split(",");
        int k = 0;
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLS; j++) {
				a[i][j] = Integer.parseInt(firstMatrixValues[k]);
				b[i][j] = Integer.parseInt(secondMatrixValues[k]);
                k++;
			}
		}
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLS; j++) {
				int sum = 0;
				for (k = 0; k < COLS; k++) {
					sum = sum + (a[i][k] * b[k][j]);
				}
				c[i][j] = sum;
			}
		}
		PrintWriter pw = response.getWriter();
		pw.print("<!DOCTYPE html>");
		pw.print("<html>");
		pw.print("<head>");
		pw.print("<title>");
		pw.print("Matrix");
		pw.print("</title>");
		pw.print("<style>");
		pw.print("td { padding: 10px; }");
		pw.print("td { text-align: right; }");
		pw.print("#bracket { font-size: 60px; }");
		pw.print("table, #bracket { float: left; }");
		pw.print("</style>");
		pw.print("</head>");
		pw.print("<body>");
		pw.print("<h1>");
		pw.print("Matrix Multiplication");
		pw.print("</h1>");
        pw.print("<span id=\"bracket\">[</span>");
        pw.print("<table>");
        for (int i = 0; i < ROWS; i++) {
            pw.print("<tr>");
            for (int j = 0; j < COLS; j++) {
                pw.print("<td>" + a[i][j] + "</td>");
            }
            pw.print("</tr>");
        }
        pw.print("</table>");
        pw.print("<span id=\"bracket\">]</span>");
        pw.print("<span id=\"bracket\">[</span>");
        pw.print("<table>");
        for (int i = 0; i < ROWS; i++) {
            pw.print("<tr>");
            for (int j = 0; j < COLS; j++) {
                pw.print("<td>" + b[i][j] + "</td>");
            }
            pw.print("</tr>");
        }
        pw.print("</table>");
        pw.print("<span id=\"bracket\">]</span>");
        pw.print("<span id=\"bracket\">=</span>");
		pw.print("<span id=\"bracket\">[</span>");
		pw.print("<table>");
		for (int i = 0; i < ROWS; i++) {
			pw.print("<tr>");
			for (int j = 0; j < COLS; j++) {
				pw.print("<td>" + c[i][j] + "</td>");
			}
			pw.print("</tr>");
		}
		pw.print("</table>");
		pw.print("<span id=\"bracket\">]</span>");
		pw.print("</body>");
		pw.print("</html>");
	}

}
