package ss9_personControll.repository;

import ss9_personControll.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getOn();
    void add(Student student);
    void delete(String id);
}
