package controller;

import model.User;
import service.IUserService;
import service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "userServlet", value = "/user")
public class userServlet extends HttpServlet {
    private IUserService iUserService = new UserService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                request.getRequestDispatcher("/view/create.jsp").forward(request,response);
                break;
            case "delete":
                int idDelete=Integer.parseInt(request.getParameter("id"));
                iUserService.delete(idDelete);
                response.sendRedirect("/user");
                break;
            default:
                request.setAttribute("userList", iUserService.getOn());
                request.getRequestDispatcher("/view/list.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action==null){
            action="";
        }
        switch (action){
            case "create":
                int id=Integer.parseInt(request.getParameter("id"));
                String name=request.getParameter("name");
                String email=request.getParameter("email");
                String country=request.getParameter("country");
                User user=new User(id,name,email,country);
                iUserService.save(user);
                request.setAttribute("user",iUserService.getOn());
                request.getRequestDispatcher("/view/list.jsp").forward(request,response);
                break;
        }
    }
}
