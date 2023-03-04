package ss9_personControll.view;

import ss9_personControll.controller.StudentController;
import ss9_personControll.controller.TeacherController;

public class View {
    public static void main(String[] args) {
        StudentController studentController =new StudentController();
        studentController.studentControll();
        TeacherController teacherController=new TeacherController();
        teacherController.teacherControll();
    }


}
