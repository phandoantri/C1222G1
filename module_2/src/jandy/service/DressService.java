package jandy.service;

import jandy.model.Dress;
import jandy.repository.DressRepository;
import jandy.repository.IDressRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DressService implements IDressService{
      private IDressRepository iDressRepository=new DressRepository();
      Scanner sc=new Scanner(System.in);
    @Override
    public void display() {
        List<Dress> dressList=iDressRepository.display();
        for (Dress dress:dressList){
            System.out.println(dress);
        }
    }

    @Override
    public void add() {
       List<Dress> dressList=iDressRepository.display();
        System.out.println("enter name ");
        String name=sc.nextLine();
        System.out.println("enter color ");
        String color=sc.nextLine();
        System.out.println("enter cost ");
        double cost=Double.parseDouble(sc.nextLine());
        Dress dress=new Dress(name,color,cost);
       dressList.add(dress);
       iDressRepository.add(dressList);

    }

    @Override
    public void delete() {
        List<Dress> dressList =iDressRepository.display();
        System.out.println("Nhap name");
        String name = sc.nextLine();
        for (int i = 0; i < dressList.size(); i++) {
            if (dressList.get(i).getName().equals(name)){
                iDressRepository.delete(i);
                return;
            }

        }
    }


}
