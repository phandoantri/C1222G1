package test_1.controller;

import test_1.service.IShoesService;
import test_1.service.ShoesService;

import java.util.Scanner;

public class ShoesController {
   private IShoesService iShoesService=new ShoesService();
   Scanner sc=new Scanner(System.in);
   String choice;
   public void shoesController(){
      do {
         System.out.println("1.Shoes display\n"+
                 "2 Shoes add\n"+
                 "3.Shoes delete\n"+
                 "4.Shoes search\n"+
                 "5.Exit.\n"+
                 "please choice ");
         choice=sc.nextLine();
         switch (choice){
            case "1":
               iShoesService.display();
               break;
            case "2":
               iShoesService.add();
               break;
            case "3":
               iShoesService.delete();
               break;
            case "4":
               iShoesService.search();
               break;
            case "5":
               System.exit(0);
         }

      }while (true);
   }
}
