package ss12_ArrayList.controller;

import ss12_ArrayList.service.IProductService;
import ss12_ArrayList.service.ProductService;

import java.util.Scanner;

public class ProductController {
    IProductService productService = new ProductService();
    Scanner sc = new Scanner(System.in);
    String choice;

    public void productController() {
        do {
            System.out.println("moi chon : \n" +
                    "1.Hien thi san pham \n" +
                    "2.Xoa san pham \n" +
                    "3.Tim san pham\n" +
                    "4.them moi san pham\n"+
                    "chon chuc nang : ");
            choice = sc.nextLine();
            switch (choice) {
                case "1":
                    productService.display();
                    break;
                case "2":
                    System.out.println("nhap ID muon xoa ");
                    String id = sc.nextLine();
                    productService.delete(id);
                    break;
                case "3":
                    System.out.println("nhap ten tim kiem san pham ");
                    String product = sc.nextLine();
                    productService.search(product);
                    break;
                case "4":
                    productService.addProduct();
                    break;
            }

        } while (true);
    }

}
