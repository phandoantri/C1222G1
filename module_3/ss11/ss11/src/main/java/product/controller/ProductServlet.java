package product.controller;

import product.model.Product;
import product.service.IProductService;
import product.service.ProductService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ProductServlet", value = "/product")
public class ProductServlet extends HttpServlet {
    private IProductService iProductService = new ProductService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                request.getRequestDispatcher("/view/create.jsp").forward(request, response);
                break;
            case "search":
                String name=request.getParameter("name");
                request.setAttribute("productList", iProductService.findByName(name));
                request.getRequestDispatcher("/view/list.jsp").forward(request, response);
                break;
            case "delete":
                int idDelete=Integer.parseInt(request.getParameter("id"));
                iProductService.deleteId(idDelete);
                response.sendRedirect("/product");
                break;
            default:
                request.setAttribute("productList", iProductService.getOn());
                request.getRequestDispatcher("/view/list.jsp").forward(request, response);
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
                int id = Integer.parseInt(request.getParameter("id"));
                String name = request.getParameter("name");
                int cost = Integer.parseInt(request.getParameter("cost"));
                Product product = new Product(id, name, cost);
                iProductService.save(product);
                request.setAttribute("product", iProductService.getOn());
                request.getRequestDispatcher("/view/create.jsp").forward(request, response);
                break;
            case "update":
                int idUpdate=Integer.parseInt(request.getParameter("id"));
                String nameUpdate=request.getParameter("name");
                int costUpdate= Integer.parseInt(request.getParameter("cost"));
                Product product1=new Product(idUpdate,nameUpdate,costUpdate);
                iProductService.update(product1);


        }
    }
}
