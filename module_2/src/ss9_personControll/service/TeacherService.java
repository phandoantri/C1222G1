package ss9_personControll.service;

import bai_tap_lam_them.Teacher;
import ss9_personControll.repository.ITeacherRepository;
import ss9_personControll.repository.TeacherRepository;

import java.util.List;

public class TeacherService implements ITeacherService {
    TeacherRepository teacherRepository = new TeacherRepository();

    @Override
    public void display() {
        List<Teacher> teacherList=teacherRepository.display();
        for (Teacher teacher:teacherList){
            System.out.println(teacher);
        }

    }
}
