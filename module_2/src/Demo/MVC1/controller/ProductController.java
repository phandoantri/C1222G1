package Demo.MVC1.controller;

import Demo.MVC1.model.Product;
import Demo.MVC1.service.IProductService;
import Demo.MVC1.service.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductController {
   IProductService productService=new ProductService();
   Scanner sc= new Scanner(System.in);
   String choice;
   public void quanLy(){
      do {
          System.out.println("moi chon\n"+
                  "1.hien thi danh sach san pham \n"+
                  "2.them san pham \n"+
                  "3.Xoa san pham ");
          choice=sc.nextLine();
          switch (choice){
              case "1":
                  productService.display();
                  break;
              case "2":
                  productService.add();
              case "3":
                  System.out.println("nhap id can xoa");
                  String id=sc.nextLine();
                  productService.delete(id);
          }

      }while (true);
    }

}
