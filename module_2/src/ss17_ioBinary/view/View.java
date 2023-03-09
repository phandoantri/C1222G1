package ss17_ioBinary.view;

import ss17_ioBinary.controller.ProductController;
import ss17_ioBinary.repository.ProductRepo;

public class View {
    public static void main(String[] args) {
        ProductController productController=new ProductController();
        productController.productController();

    }

}
