package ss9_DSA_MVC.Service;

import ss9_DSA_MVC.Repository.StudentRepository;

public class StudentSerce implements IStudentserce{
    StudentRepository studentRepository=new StudentRepository();

    @Override
    public void display() {
        studentRepository.display();
    }

    @Override
    public void add() {
        studentRepository.add();
    }
}
