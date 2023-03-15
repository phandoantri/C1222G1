package ss18_binary.controller;

import ss18_binary.service.IProductService;
import ss18_binary.service.ProductService;

import java.util.Scanner;

public class ProductController {
    IProductService iProductService=new ProductService();
Scanner sc=new Scanner(System.in);
String choice;
public void productControll(){
    do {
        System.out.println("1.hien thi san pham\n"+
                "2.them san pham\n"+
                "3.tim san pham\n"+
                "4.thoat\n"+
                "moi ban chon chuc nang");
        choice=sc.nextLine();
        switch (choice){
            case "1":
                iProductService.display();
                break;
            case "2":
                iProductService.add();
                break;
            case "3":
                System.out.println("nhap ten san pham can tim kiem ");
                String name=sc.nextLine();
                iProductService.search(name);
                break;
            case "4":
                System.exit(0);
        }
    }while (true);
}



}
