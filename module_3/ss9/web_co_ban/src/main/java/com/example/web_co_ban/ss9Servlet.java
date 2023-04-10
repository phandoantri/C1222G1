package com.example.web_co_ban;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ss9", value = "/ss9Servlet")
public class ss9Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productDescription=request.getParameter("productDescription");
        int listPrice = Integer.parseInt(request.getParameter("listPrice"));
        int discountPercent = Integer.parseInt(request.getParameter("discountPercent"));
        double discountAmount = listPrice * discountPercent * 0.01;
        double discountPrice=listPrice-discountAmount;
        request.setAttribute("productDescription",productDescription);
        request.setAttribute("listPrice",listPrice);
        request.setAttribute("discountPercent",discountPercent);
        request.setAttribute("discountAmount",discountAmount);
        request.setAttribute("discountPrice",discountPrice);
        request.getRequestDispatcher("/ss9.jsp").forward(request,response);
    }
}
