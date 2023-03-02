package ss9_DSA_MVC.Model;

public class Student extends Person{
    private  String className;
    private double point;

    public Student() {
    }

//    public Student(String className, double point) {
//        this.className = className;
//        this.point = point;
//    }

    public Student(String id, String name, String dayOfBirth, String gender, String className, double point) {
        super(id, name, dayOfBirth, gender);
        this.className = className;
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "className='" +super.toString()+ className + '\'' +
                ", point=" + point +
                '}';
    }
}
