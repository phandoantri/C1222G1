package jandy.controller;

import jandy.service.DressService;
import jandy.service.IDressService;

import java.util.Scanner;

public class DressController {
   private IDressService iDressService=new DressService();
   Scanner sc=new Scanner(System.in);
   int choice;
   public void dressConTroll(){
       System.out.println("1.Dress display\n"+
               "2.Dress add\n"+
               "3.Dress remove\n"+
               "4.Exit\n"+
               "Please choice : ");
       choice=Integer.parseInt(sc.nextLine());
       switch (choice){
           case 1:
               iDressService.display();
               break;
           case 2:
               iDressService.add();
               break;
       }

   }
}
