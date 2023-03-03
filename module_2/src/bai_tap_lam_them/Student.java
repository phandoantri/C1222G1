package bai_tap_lam_them;

public class Student extends Teacher {
    private String classes;
    private int point;

    public Student(){

        super("hue", "123", "03/07/1997", "nu", "van hoc");
    }
    public Student( String name,String id,String dayOfBirth,boolean gender ,  String classes, int point) {
        super(name,id,dayOfBirth,gender);
        this.classes = classes;
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "classes='" + classes + '\'' +
                ", point=" + point +
                '}';
    }
}
