package ss9_personControll.controller;

import ss9_personControll.service.ITeacherService;
import ss9_personControll.service.TeacherService;

import java.util.Scanner;

public class TeacherController {
    TeacherService teacherService = new TeacherService();

    Scanner sc = new Scanner(System.in);
    String choice;

    public void teacherControll() {
        do {
            System.out.println("moi chon\n" +
                    "1.Hien thi danh sach giao vien \n" +
                    "2.Them moi giao vien\n" +
                    "3.Xoa giao vien\n" +
                    "4.Thoat \n" +
                    "Chon chuc nang : ");
            choice = sc.nextLine();
            switch (choice) {
                case "1":
                    teacherService.display();
                    break;
//                case "2":
//                    studentService.add();
//                    break;
//                case "3":
//                    System.out.println("nhap id can xoa ");
//                    String id = sc.nextLine();
//                    studentService.delete(id);
//                    break;
//            }
            }
        } while (true);

    }
}
