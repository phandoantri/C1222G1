package ss9_personControll.controller;

import ss9_personControll.service.IStudentService;
import ss9_personControll.service.ITeacherService;
import ss9_personControll.service.StudentService;
import ss9_personControll.service.TeacherService;

import java.util.Scanner;

public class StudentController {
    IStudentService studentService = new StudentService();
    ITeacherService teacherService=new TeacherService();
    Scanner sc = new Scanner(System.in);
    String choice;

    public void studentControll() {
        do {
            System.out.println("moi chon\n" +
                    "1.Hien thi danh sach hoc vien \n" +
                    "2.Them moi hoc vien\n" +
                    "3.Xoa hoc vien\n" +
                    "4.Thoat \n"+
                    "Chon chuc nang : ");
            choice = sc.nextLine();
            switch (choice) {
                case "1":
                    studentService.getOn();
                    teacherService.display();
                    break;
                case "2":
                    studentService.add();
                    break;
                case "3":
                    System.out.println("nhap id can xoa ");
                    String id = sc.nextLine();
                    studentService.delete(id);
                    break;
            }
        } while (true);
    }
}


