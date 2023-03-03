package ss9_personControll.repository;

import bai_tap_lam_them.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository implements ITeacherRepository {
    static List<Teacher> teachers=new ArrayList<>();
    static {
        teachers.add(new Teacher("nu","123","03/09/1999","nu","van hoc"));
        teachers.add(new Teacher("hung","133","04/07/1997","nam","toan hoc"));
    }
    @Override
    public void display() {
        for(Teacher teacher:teachers){
            System.out.println(teacher);
        }
    }
}
