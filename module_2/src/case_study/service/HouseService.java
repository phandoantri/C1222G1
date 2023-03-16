package case_study.service;

import case_study.model.House;
import case_study.repository.HouseRepository;

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
        System.out.println("enter usable aria ");
        double usableAria=Double.parseDouble(sc.nextLine());
        System.out.println("enter rant cost ");
        double rantCost=Double.parseDouble(sc.nextLine());
        System.out.println("enter max people ");
        int maxPeople=Integer.parseInt(sc.nextLine());
        System.out.println("enter rental type ");
        String rentalType=sc.nextLine();
        System.out.println("enter room standard ");
        String roomStandard=sc.nextLine();
        System.out.println("enter number floor ");
        int numberOfFloor=Integer.parseInt(sc.nextLine());
        House house=new House(serviceName,usableAria,rantCost,maxPeople,rentalType,roomStandard,numberOfFloor);
        houseRepository.add(house);

    }


}
