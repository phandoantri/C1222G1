package jandy.controller;

import jandy.service.DressService;
import jandy.service.IDressService;

import java.util.Scanner;

public class DressController {
    private IDressService iDressService = new DressService();
    Scanner sc = new Scanner(System.in);
    String choice;


    public void dressConTroll() {
        do {
            System.out.println("1.Dress display\n" +
                    "2.Dress add\n" +
                    "3.Dress remove\n" +
                    "4.Exit\n" +
                    "Please choice : ");
            choice = sc.nextLine();
            switch (choice) {
                case "1":
                    iDressService.display();
                    break;
                case "2":
                    iDressService.add();
                    break;
                case "3":
                    iDressService.delete();
                    break;
                case "4":
                    System.exit(0);
            }
        } while (true);


    }
}
