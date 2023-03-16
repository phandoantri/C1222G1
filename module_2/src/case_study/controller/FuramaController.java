package case_study.controller;

import case_study.service.*;

import java.util.Scanner;

public class FuramaController {
    IEmployeeService iEmployeeService = new EmployeeService();
    ICustomerService iCustomerService = new CustomerService();
    IVillageService iVillageService= new VillageService();
    IHouseService iHouseService=new HouseService();
    IRoomService iRoomService=new RoomService();



    Scanner sc = new Scanner(System.in);
    int choice;
    int choice1;
    int choice2;
    int choice3;

    public void displayMainMenu() {
        do {
            System.out.println("choice  \n" +
                    "1.Employee Management\n" +
                    "2.Customer Management\n" +
                    "3.Facility Management \n" +
                    "4.Booking Management\n" +
                    "5.Promotion Management\n" +
                    "6.Exit\n" +
                    "please choice : ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    loop1:
                    do {
                        System.out.println("1.Display list employees");
                        System.out.println("2.Add new employee");
                        System.out.println("3.Edit employee");
                        System.out.println("4.Return main menu");
                        choice1 = Integer.parseInt(sc.nextLine());
                        switch (choice1) {
                            case 1:
                                iEmployeeService.display();
                                break;
                            case 2:
                                iEmployeeService.add();
                                break;
                            case 3:
                                System.out.println("enter name you want change ");
                                String name = sc.nextLine();
                                iEmployeeService.edit(name);
                                break;
                            case 4:
                                break loop1;
                        }
                    } while (true);
                    break;


                case 2:
                    loop2:
                    do {
                        System.out.println("1.Display list customers");
                        System.out.println("2.Add new customer");
                        System.out.println("3.Edit customer");
                        System.out.println("4.Return main menu");
                        choice2 = Integer.parseInt(sc.nextLine());
                        switch (choice2) {
                            case 1:
                                iCustomerService.display();
                                break;
                            case 2:
                                iCustomerService.add();
                                break;

                            case 4:
                                break loop2;
                        }
                    } while (true);
                    break;

                case 3:
                    loop3:
                    do {

                        System.out.println("1.Display list facility");
                        System.out.println("2.Add new facility");
                        System.out.println("3.Display list facility maintenance");
                        System.out.println("4.Return main menu");
                        choice3 = Integer.parseInt(sc.nextLine());
                        switch (choice3) {
                            case 1:
                                loop4:
                                do {
                                        System.out.println("1.Display list house\n"+
                                                "2.Display list room\n"+
                                                "3.Display list Village\n"+
                                                "4.exit");
                                        int choice4 =Integer.parseInt(sc.nextLine());

                                        switch (choice4){
                                            case 1:
                                                iHouseService.display();
                                                break ;
                                            case 2:
                                                iRoomService.display();
                                                break ;
                                            case 3:
                                                iVillageService.display();
                                                break ;
                                            case 4:
                                                break loop4;
                                    }



                                }while (true);
                                break;
                            case 2:
                                loop5:
                                do {
                                    System.out.println("1.Add new house\n"+
                                            "2.Add new room\n"+
                                            "3.Add new Village\n"+
                                            "4.Exit");
                                    int choice5=Integer.parseInt(sc.nextLine());
                                    switch (choice5){
                                        case 1:
                                            iHouseService.add();
                                            break ;
                                        case 2:
                                            iRoomService.add();
                                            break ;
                                        case 3:
                                            iVillageService.add();
                                            break ;
                                        case 4:
                                            break loop5;
                                    }
                                }while (true);
                                break ;
                            case 4:
                                break loop3;
                        }
                    } while (true);
                    break;
                case 4:
                    System.out.println("1.Add new booking");
                    System.out.println("2.Display list booking");
                    System.out.println("3.Create new contracts");
                    System.out.println("4.Display list contracts");
                    System.out.println("5.Edit contracts");
                    System.out.println("6.Return main menu");
                    break;
                case 5:
                    System.out.println("1.Display list customers use service");
                    System.out.println("2.Display list customers get voucher");
                    System.out.println("3.Return main menu");
                    break;
                case 6:
                    System.exit(0);
            }
        } while (true);

    }
}
