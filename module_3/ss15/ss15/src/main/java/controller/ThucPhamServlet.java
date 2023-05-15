package controller;

import service.IThucPhamService;
import service.ThucPhamService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ThucPhamServlet", value = "/thucpham")
public class ThucPhamServlet extends HttpServlet {
    private IThucPhamService iThucPhamService=new ThucPhamService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");
        if (action==null){
            action="";
        }
        switch (action){
            case "delete":
                int idDelete= Integer.parseInt(request.getParameter("id"));
                iThucPhamService.delete(idDelete);
                response.sendRedirect("/thucpham");
                break;
            default:
                request.setAttribute("thucPhamList",iThucPhamService.getAll());
                request.getRequestDispatcher("/view/list.jsp").forward(request,response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
