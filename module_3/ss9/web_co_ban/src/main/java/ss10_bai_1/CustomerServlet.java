package ss10_bai_1;

import ss10_bai_1.model.Customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/customer")
public class CustomerServlet extends HttpServlet {
    List<Customer> customerList = new ArrayList<>();

    public void init() {
        customerList.add(new Customer("Nguyen Van A", "1996-02-02", "hue","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQNgRZzcuF-UDy283P9GMnw2BaDCsZyy4zRzwJcKTws&s"));
        customerList.add(new Customer("Nguyen Van B", "1997-03-02", "da nang","https://nld.mediacdn.vn/thumb_w/540/2020/5/29/doi-hoa-tim-8-15907313395592061395682.png"));
        customerList.add(new Customer("Nguyen Van C", "1998-04-02", "ha noi","https://hanoimoi.com.vn/Uploads/tuandiep/2018/4/8/1(1).jpg"));

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customerList", customerList);
        request.getRequestDispatcher("/ss10_bai_1.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
