package case_study.service;

import case_study.model.Room;
import case_study.repository.RoomRepository;

import java.util.List;
import java.util.Scanner;

public class RoomService implements IRoomService{
    Scanner sc=new Scanner(System.in);
    RoomRepository roomRepository=new RoomRepository();

    @Override
    public void display() {
        List<Room> roomList=roomRepository.display();
        for (Room room:roomList){
            System.out.println(room);
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
        System.out.println("enter free service included ");
        String freeServiceIncluded=sc.nextLine();
        Room room=new Room(serviceName,usableAria,rantCost,maxPeople,rentalType,freeServiceIncluded);
        roomRepository.add(room);
    }
}
