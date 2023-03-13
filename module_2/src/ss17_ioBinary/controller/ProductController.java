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
                    "1.hien thi san pham \n"+
                    "2.them san pham\n"+
                    "3.xoa san pham\n"+
                    "4.thoat\n"+
                    "moi chon chuc nang ");
            choice=sc.nextLine();
            switch (choice){
                case "1":
                    productService.display();
                    break;
                case "2":
                    productService.add();
                    break;
                case "3":
                    System.out.println("nhap id can tim kiem");
                    String id=sc.nextLine();
                    productService.search(id);

            }


        }while (true);
    }

}
