package ss9_personControll.repository;

import ss9_personControll.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    static List<Student> studentList = new ArrayList<>();

    static {
        studentList.add(new Student("trung", "1234", "02/03/1999", "nam", "C1222", 7));
        studentList.add(new Student("hang", "1334", "03/03/1999", "nu", "C1222", 5));
        studentList.add(new Student("nam", "1434", "04/03/1999", "nam", "C1222", 8));

    }

    @Override
    public List<Student> getOn() {
        return studentList;
    }

    @Override
    public void add(Student student) {
        studentList.add(student);

    }

    @Override
    public void delete(String id) {
        for (int i= 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id)){
                studentList.remove(studentList.get(i));
            }


        }
    }
}
