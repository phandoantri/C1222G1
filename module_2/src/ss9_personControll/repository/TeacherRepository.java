package ss9_personControll.repository;

import bai_tap_lam_them.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository implements ITeacherRepository {
    static List<Teacher> teacherList=new ArrayList<>();
    static {
        teacherList.add(new Teacher("nu","123","03/09/1999","nu","van hoc"));
        teacherList.add(new Teacher("hung","133","04/07/1997","nam","toan hoc"));
    }
    @Override
    public List<Teacher> display() {
        return teacherList;

        }

}
