package case_study.controller;

import java.util.Scanner;

public class FuramaController {
    Scanner sc=new Scanner(System.in);
    int choice;
    public void displayMainMenu(){
        do {
            System.out.println("nhap chuc nang \n"+
                    "1.Employee Management\n"+
                    "2.Customer Management\n"+
                    "3.Facility Management \n"+
                    "4.Booking Management\n"+
                    "5.Promotion Management\n"+
                    "6.Exit");
            switch (choice){
                case 1:
                    System.out.println("1.Display list employees");
                    System.out.println("2.Add new employee");
                    System.out.println("3.Edit employee");
                    System.out.println("4.Return main menu");
                case 2:
                    System.out.println("1.Display list customers");
                    System.out.println("2.Add new customer");
                    System.out.println("3.Edit customer");
                    System.out.println("4.Return main menu");
                case 3:
                    System.out.println("1.Display list facility");
                    System.out.println("2.Add new facility");
                    System.out.println("3.Display list facility maintenance");
                    System.out.println("4.Return main menu");
                case 4:
                    System.out.println("1.Add new booking");
                    System.out.println("2.Display list booking");
                    System.out.println("3.Create new contracts");
                    System.out.println("4.Display list contracts");
                    System.out.println("5.Edit contracts");
                    System.out.println("6.Return main menu");
                case 5:
                    System.out.println("1.Display list customers use service");
                    System.out.println("2.Display list customers get voucher");
                    System.out.println("3.Return main menu");
                case 6:
                    System.exit(0);

            }
        }while (true);

    }
}
