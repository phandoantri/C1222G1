package test_1.service;

import test_1.model.Shoes;
import test_1.repositpry.IShoesRepository;
import test_1.repositpry.ShoesRepository;

import java.util.List;
import java.util.Scanner;

public class ShoesService implements IShoesService{
    private IShoesRepository iShoesRepository=new ShoesRepository();
    Scanner sc=new Scanner(System.in);
    @Override
    public void display() {
        List<Shoes> shoesList=iShoesRepository.display();
        for (Shoes shoes:shoesList){
            System.out.println(shoes);
        }

    }

    @Override
    public void add() {
        List<Shoes> shoesList=iShoesRepository.display();
        System.out.println("enter name");
        String name=sc.nextLine();
        System.out.println("enter id");
        String id=sc.nextLine();
        System.out.println("enter cost");
        double cost=Double.parseDouble(sc.nextLine());
        Shoes shoes=new Shoes(name,id,cost);
        shoesList.add(shoes);
        iShoesRepository.add(shoesList);

    }

    @Override
    public void delete() {
        List<Shoes> shoesList=iShoesRepository.display();
        System.out.println("enter id you want delete ");
        String id=sc.nextLine();
        for (int i=0;i<shoesList.size();i++){
            if (shoesList.get(i).getId().equals(id)){
                iShoesRepository.delete(i);
                return;
            }else {
                System.out.println("khong tim thay");
            }
        }
    }

    @Override
    public void search() {
        List<Shoes> shoesList=iShoesRepository.display();
        System.out.println("enter name you want search ");
        String name=sc.nextLine();
        for (int i=0;i<shoesList.size();i++){
            if (shoesList.get(i).getName().equals(name)){
                iShoesRepository.search(i);
                return;
            }
        }
    }
}
