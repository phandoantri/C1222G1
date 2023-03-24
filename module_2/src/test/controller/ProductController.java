package test.controller;

import test.service.IProductService;
import test.service.ProductService;

import java.util.Scanner;

public class ProductController {
    IProductService iProductService=new ProductService();
    Scanner sc=new Scanner(System.in);
    String choice;
    public void productControll(){
        do {
            System.out.println("1.display product\n"+
                    "2.Add product\n"+
                    "3.delete product\n"+
                    "4.search product\n"+
                    "5.Exit");
            choice=sc.nextLine();
            switch (choice){
                case "1":
                    iProductService.display();
                    break;
                case "2":
                    iProductService.add();
                    break;
                case "3":
                    iProductService.delete();
                    break;
                case "4":
                    iProductService.search();
                    break;
                case "5":
                    System.exit(0);
            }
        }while (true);

    }

}
