package controller;

import service.CongViecService;
import service.ICongViecService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "QuanLyCongViecServlet", value = "/quanlycongviec")
public class QuanLyCongViecServlet extends HttpServlet {
    private ICongViecService iCongViecService = new CongViecService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "delete":
                int idDelete = Integer.parseInt(request.getParameter("id"));
                iCongViecService.delete(idDelete);
                response.sendRedirect("/quanlycongviec");
                break;
            case "create":
                request.getRequestDispatcher("/view/create.jsp");
                break;

            default:
                request.setAttribute("congViecList", iCongViecService.getAll());
                request.getRequestDispatcher("/view/list.jsp").forward(request, response);
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
