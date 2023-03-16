package case_study.service;

import case_study.model.Villa;
import case_study.repository.VillageRepository;

import java.util.List;
import java.util.Scanner;

public class VillageService implements IVillageService {
    Scanner sc = new Scanner(System.in);
    VillageRepository villageRepository = new VillageRepository();


    @Override
    public void display() {
        List<Villa> villaList = villageRepository.display();
        for (Villa villa : villaList) {
            System.out.println(villa);
        }
    }

    @Override
    public void add() {
        System.out.println("enter service name ");
        String serviceName = sc.nextLine();
        System.out.println("enter usable aria  ");
        double usableAria = Double.parseDouble(sc.nextLine());
        System.out.println("enter rant cost ");
        double rantCost = Double.parseDouble(sc.nextLine());
        while (rantCost<0||rantCost>20){
            System.out.println("rant cost must be greater than 0 and less than 20");
            System.out.println("enter again ");
            rantCost = Double.parseDouble(sc.nextLine());
        }
        System.out.println("enter max people ");
        int maxPeople = Integer.parseInt(sc.nextLine());
        System.out.println("enter rental type  ");
        String rentalType = sc.nextLine();
        System.out.println("enter room standard ");
        String roomStandard = sc.nextLine();
        System.out.println("enter number floor ");
        int numberFloor = Integer.parseInt(sc.nextLine());
        while (numberFloor<0){
            System.out.println("number floor must be greater 0 and integer ");
            System.out.println("enter again ");
            numberFloor = Integer.parseInt(sc.nextLine());
        }
        System.out.println("enter swimming pool area");
        double swimmingPoolAria = Double.parseDouble(sc.nextLine());
        while (swimmingPoolAria<30){
            System.out.println("swimming pool area must be greater than 30 ");
            System.out.println("enter again ");
            swimmingPoolAria = Double.parseDouble(sc.nextLine());
        }

        Villa villa = new Villa(serviceName, usableAria, rantCost, maxPeople, rentalType, roomStandard, swimmingPoolAria, numberFloor);
        villageRepository.add(villa);


    }
}
