import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Calculator")
public class Calculator extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String number1 = request.getParameter("number1");
        String number2 = request.getParameter("number2");
        int n1 = Integer.parseInt(number1);
        int n2 = Integer.parseInt(number2);
        int suma = n1 + n2;
        int roznica = n1 - n2;
        int iloczyn = n1 * n2;
        int iloraz = n1/n2;

        System.out.println(n1 + "+"+n2 + "=" + suma);
        System.out.println(n1 + "-"+n2 + "=" + roznica);
        System.out.println(n1 + "*"+n2 + "=" + iloczyn);
        System.out.println(n1 + "/"+n2+" = "+iloraz);
    }
}
