package ss9_personControll.service;

import ss9_personControll.model.Student;
import ss9_personControll.repository.StudentRepository;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private StudentRepository studentRepository = new StudentRepository();
    Scanner sc = new Scanner(System.in);

    @Override
    public void getOn() {
       List<Student> studentList = studentRepository.getOn();
        for (Student student:studentList){
            System.out.println(student);
        }
    }

    @Override
    public void add() {
        System.out.println("nhap ten ");
        String name = sc.nextLine();
        System.out.println("nhap id ");
        String id = sc.nextLine();
        System.out.println("nhap ngay sinh ");
        String dayOfBirth = sc.nextLine();
        System.out.println("nhap gioi tinh ");
        String gender = sc.nextLine();
        System.out.println("nhap lop ");
        String ClassName = sc.nextLine();
        System.out.println("nhap diem");
        double point = Double.parseDouble(sc.nextLine());
        Student student = new Student(name, id, dayOfBirth, gender, ClassName, point);
        studentRepository.add(student);
    }

    @Override
    public void delete(String id) {
        studentRepository.delete(id);
    }
}
