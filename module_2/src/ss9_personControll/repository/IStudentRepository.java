package ss9_personControll.repository;

import ss9_personControll.model.Student;

public interface IStudentRepository {
    void display();
    void add(Student student);
    void delete(String id);
}
