package case_study.service;

import case_study.model.Room;
import case_study.repository.RoomRepository;
import case_study.until.CheckName;

import java.util.List;
import java.util.Scanner;

public class RoomService implements IRoomService {
    Scanner sc = new Scanner(System.in);
    RoomRepository roomRepository = new RoomRepository();

    @Override
    public void display() {
        List<Room> roomList = roomRepository.display();
        for (Room room : roomList) {
            System.out.println(room);
        }
    }

    @Override
    public void add() {
        System.out.println("enter service name ");
        String serviceName = sc.nextLine();
        while (!CheckName.checkName(serviceName)) {
            System.out.println("enter Xxxxxxx");
            serviceName = sc.nextLine();
        }
        System.out.println("enter usable aria ");
        double usableAria = Double.parseDouble(sc.nextLine());
        while (usableAria < 30) {
            System.out.println("usable area must be greater than  30 ");
            System.out.println("enter again ");
            usableAria = Double.parseDouble(sc.nextLine());
        }
        System.out.println("enter rant cost ");
        double rantCost = Double.parseDouble(sc.nextLine());
        while (rantCost < 0) {
            System.out.println("rant cost must be greater than 0 ");
            System.out.println("enter again ");
            rantCost = Double.parseDouble(sc.nextLine());
        }
        System.out.println("enter max people ");
        int maxPeople = Integer.parseInt(sc.nextLine());
        while (maxPeople < 0 || maxPeople > 20) {
            System.out.println("max people must be greater than 0 and less than 20");
            System.out.println("enter again ");
            maxPeople = Integer.parseInt(sc.nextLine());
        }
        System.out.println("enter rental type ");
        String rentalType = sc.nextLine();
        while (!CheckName.checkName(rentalType)) {
            System.out.println("enter Xxxxxx");
            System.out.println("enter again ");
            rentalType = sc.nextLine();
        }
        System.out.println("enter free service included ");
        String freeServiceIncluded = sc.nextLine();
        while (!CheckName.checkName(freeServiceIncluded)) {
            System.out.println("enter Xxxxxx");
            System.out.println("enter again ");
            freeServiceIncluded = sc.nextLine();
            Room room = new Room(serviceName, usableAria, rantCost, maxPeople, rentalType, freeServiceIncluded);
            roomRepository.add(room);
        }
    }
}