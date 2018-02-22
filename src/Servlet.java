import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/abc")
public class Servlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println ("witaj swiecie");
request.setCharacterEncoding("UTF-8");
String imie=request.getParameter("imie");
 String nazwisko=request.getParameter("nazwisko");
        System.out.println (imie+" "+nazwisko);
    }
}
