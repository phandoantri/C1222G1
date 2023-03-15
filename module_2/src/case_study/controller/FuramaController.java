package case_study.controller;

import case_study.service.*;

import java.util.Scanner;

public class FuramaController {
    IEmployeeService iEmployeeService = new EmployeeService();
    ICustomerService iCustomerService = new CustomerService();
    IFacilityService iFacilityService = new FacilityService();

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
                                iFacilityService.display();
                                break;
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
