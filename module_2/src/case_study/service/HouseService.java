package case_study.service;

import case_study.model.House;
import case_study.repository.HouseRepository;
import case_study.until.CheckName;

import java.util.List;
import java.util.Scanner;

public class HouseService implements IHouseService{
    Scanner sc=new Scanner(System.in);
    HouseRepository houseRepository=new HouseRepository();
    @Override
    public void display() {
        List<House> houseList=houseRepository.display();
        for (House house:houseList){
            System.out.println(house);
        }
    }

    @Override
    public void add() {
        System.out.println("enter service name ");
        String serviceName=sc.nextLine();
        while (!CheckName.checkName(serviceName)) {
            System.out.println("enter Xxxxxxx");
            serviceName = sc.nextLine();
        }
        System.out.println("enter usable aria ");
        double usableAria=Double.parseDouble(sc.nextLine());
        while (usableAria < 30) {
            System.out.println("usable area must be greater than  30 ");
            System.out.println("enter again ");
            usableAria = Double.parseDouble(sc.nextLine());
        }
        System.out.println("enter rant cost ");
        double rantCost=Double.parseDouble(sc.nextLine());
        while (rantCost < 0) {
            System.out.println("rant cost must be greater than 0 ");
            System.out.println("enter again ");
            rantCost = Double.parseDouble(sc.nextLine());
        }
        System.out.println("enter max people ");
        int maxPeople=Integer.parseInt(sc.nextLine());
        while (maxPeople < 0 || maxPeople > 20) {
            System.out.println("max people must be greater than 0 and less than 20");
            System.out.println("enter again ");
            maxPeople = Integer.parseInt(sc.nextLine());
        }
        System.out.println("enter rental type ");
        String rentalType=sc.nextLine();
        while (!CheckName.checkName(rentalType)) {
            System.out.println("enter Xxxxxx");
            System.out.println("enter again ");
            rentalType = sc.nextLine();
        }
        System.out.println("enter room standard ");
        String roomStandard=sc.nextLine();
        while (!CheckName.checkName(roomStandard)){
            System.out.println("enter Xxxxxx");
            System.out.println("enter again");
            roomStandard=sc.nextLine();
        }
        System.out.println("enter number floor ");
        int numberOfFloor=Integer.parseInt(sc.nextLine());
        while (numberOfFloor<0){
            System.out.println("number floor must be greater 0 and integer ");
            System.out.println("enter again ");
            numberOfFloor = Integer.parseInt(sc.nextLine());
        }
        House house=new House(serviceName,usableAria,rantCost,maxPeople,rentalType,roomStandard,numberOfFloor);
        houseRepository.add(house);

    }


}
