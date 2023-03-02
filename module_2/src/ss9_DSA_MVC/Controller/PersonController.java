package ss9_DSA_MVC.Controller;

import ss9_DSA_MVC.Service.StudentSerce;

import java.util.Scanner;

public class PersonController {
    public static void Controller(){

        StudentSerce studentSerce=new StudentSerce();
        int choice;
        do {
            System.out.println("1.Them moi giang vien hoac hoc sinh ");
            System.out.println("2.Xóa giang vien hoac hoc sinh ");
            System.out.println("3.Xem danh sach giang vien hoac hoc sinh ");
            System.out.println("4. Thoat");
            System.out.println("Chon chuc nang ");
            Scanner sc=new Scanner(System.in);
             choice=Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    studentSerce.add();
                    break;
                case 2: break;
                case 3:
                    studentSerce.display();
                    break;
                case 4: break;
        }

        }while (choice!=4);

    }
}
