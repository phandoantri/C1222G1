package ss9_DSA_MVC.Repository;

import ss9_DSA_MVC.Model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentRepository implements IStudentRepository {
    static List<Student> studentList=new ArrayList<>();
    static {
        studentList.add(new Student("123","nam","12/2/2013","nam","c12",9));
        studentList.add(new Student("1234","trung","12/2/2013","nu","c12",9));
    }
    public void display() {
        for (Student student:studentList){
            System.out.println(student);
        }
    }

    @Override
    public void add() {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap id");
        String id=sc.nextLine();
        System.out.println("nhap ten");
        String name=sc.nextLine();
        System.out.println("nhap ngay sinh ");
        String dayOfBirth=sc.nextLine();
        System.out.println("nhap gioi tinh ");
        String gender=sc.nextLine();
        System.out.println("nhap lop ");
        String className=sc.nextLine();
        System.out.println("nhap diem ");
        double point=Double.parseDouble(sc.nextLine());
        Student student=new Student(id,name,dayOfBirth, gender,className,point);
        System.out.println("them hoc vien thanh cong ");
        studentList.add(student);


    }
}