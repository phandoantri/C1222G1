package ss9_personControll.service;

import ss9_personControll.repository.TeacherRepository;

public class TeacherService implements ITeacherService {
    TeacherRepository teacherRepository = new TeacherRepository();

    @Override
    public void display() {
        teacherRepository.display();
    }
}
