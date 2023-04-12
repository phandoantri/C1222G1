package ss10_bai_2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CalculatorServlet", value = "/calculator")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int number1 = Integer.parseInt(request.getParameter("number1"));
        String operator = request.getParameter("operator");
        int number2 = Integer.parseInt(request.getParameter("number2"));
        int result = 0;
        switch (operator) {
            case "cong":
                result = number1 + number2;
                break;
            case "tru":
                result = number1 - number2;
                break;
            case "nhan":
                result = number1 * number2;
                break;
            case "chia":
                try {
                    number2 = 0;
                } catch (ArithmeticException e) {
                    System.out.println(e);
                }
                result = number1 / number2;
                break;
        }
        request.setAttribute("number1", number1);
        request.setAttribute("number2", number2);
        request.setAttribute("result", result);
        request.getRequestDispatcher("/ss10_bai_2.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
