package ss9_personControll.service;

import ss9_personControll.repository.ITeacherRepository;
import ss9_personControll.repository.TeacherRepository;

public class TeacherService implements ITeacherService {
    ITeacherRepository teacherRepository = new TeacherRepository();

    @Override
    public void display() {
        teacherRepository.display();
    }
}
