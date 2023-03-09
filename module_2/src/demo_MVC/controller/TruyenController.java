package demo_MVC.controller;

import demo_MVC.repository.ITruyenRepository;
import demo_MVC.service.ITruyenService;
import demo_MVC.service.TruyenService;

import java.util.Scanner;

public class TruyenController {
   private ITruyenService truyenService = new TruyenService();
    Scanner sc=new Scanner(System.in);
    String luaChon;
    public void quanLy(){
        String luaChon;
        do {
            System.out.println("Quan ly truyen :\n" +
            "1.Hien Thi \n" +
            "2.Them Moi \n"+
            "3.Xoa \n"+
             "4.Exit\n"+
            "Moi chon chuc nang: ");
            luaChon=sc.nextLine();
            switch (luaChon){
                case "1":
                    truyenService.hienThi();
                    break;
                case "2":
                    System.out.println("nhap ma truyen ");
                    String ma=sc.nextLine();
                    truyenService.xoa(ma);
                    break;
                case "4":
                    System.exit(0);
            }

        }while (true);
    }

}
