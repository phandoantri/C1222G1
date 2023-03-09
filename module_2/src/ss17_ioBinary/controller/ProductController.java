package ss17_ioBinary.controller;

import ss17_ioBinary.service.IProductService;
import ss17_ioBinary.service.ProductService;

import java.util.Scanner;

public class ProductController {
    IProductService productService = new ProductService();
    Scanner sc = new Scanner(System.in);
    String choice;
    public void productController(){
        do {
            System.out.println("nhap chuc nang \n"+
                    "1.hien thi san pham ");
            choice=sc.nextLine();
            switch (choice){
                case "1":
                    productService.display();

            }


        }while (true);
    }

}
