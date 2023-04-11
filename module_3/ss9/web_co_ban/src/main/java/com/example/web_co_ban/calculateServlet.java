package com.example.web_co_ban;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "calculateServlet", value = "/calculateServlet")
public class calculateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double usd = Double.parseDouble(request.getParameter("usd"));
        double rate = usd * 22000;
        request.setAttribute("usd", usd);
        request.setAttribute("rate", rate);
        request.getRequestDispatcher("/calculate.jsp").forward(request,response);
    }
}
