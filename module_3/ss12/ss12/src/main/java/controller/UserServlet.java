package controller;

import model.User;
import service.IUserService;
import service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "UserServlet", value = "/user")
public class UserServlet extends HttpServlet {
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
            case "search":
                String countryName=request.getParameter("countryName");
                request.setAttribute("userList",iUserService.findByCountry(countryName));
                request.getRequestDispatcher("/view/list.jsp").forward(request,response);
                break;
            case "update":
                int idUpdate=Integer.parseInt(request.getParameter("id"));
                User user=iUserService.findById(idUpdate);
                request.setAttribute("user",user);
                request.getRequestDispatcher("/view/update.jsp").forward(request,response);
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
            case "update":
                int idUpdate=Integer.parseInt(request.getParameter("id"));
                String nameUpdate=request.getParameter("name");
                String emailUpdate=request.getParameter("email");
                String countryUpdate=request.getParameter("country");
                User user1=new User(idUpdate,nameUpdate,emailUpdate,countryUpdate);
                iUserService.update(idUpdate,user1);
                response.sendRedirect("/user");
                break;

        }
    }
}
