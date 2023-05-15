package controller;


import model.Customer;
import service.CustomerService;
import service.ICustomerService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Date;

@WebServlet(name = "CustomerServlet", value = "/customer")
public class CustomerServlet extends HttpServlet {
    private ICustomerService iCustomerService = new CustomerService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "delete":
                int idDelete = Integer.parseInt(request.getParameter("id"));
                iCustomerService.delete(idDelete);
                response.sendRedirect("/customer");
                break;
            case "create":
                request.getRequestDispatcher("/customerList/create.jsp").forward(request,response);
                break;
            default:
                request.setAttribute("customerList", iCustomerService.getOn());
                request.getRequestDispatcher("/customerList/list.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                String nameCustomer = request.getParameter("name_customer");
                Date dayOfBirth = java.sql.Date.valueOf(request.getParameter("day_of_birth"));
                boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
                int idTypeCustomer = Integer.parseInt(request.getParameter("id_type_customer"));
                String nameTypeCustomer = request.getParameter("nameTypeCustomer");
                Customer customer = new Customer(nameCustomer, dayOfBirth, gender, idTypeCustomer, nameTypeCustomer);
                iCustomerService.save(customer);
                response.sendRedirect("/customer");

        }
    }
}
