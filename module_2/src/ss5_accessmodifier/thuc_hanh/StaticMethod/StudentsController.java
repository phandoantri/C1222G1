package ss5_accessmodifier.thuc_hanh.StaticMethod;

public class StudentsController {
    public static void main(String[] args) {
        Students.change();

        //creating objects
        Students s1 = new Students(111, "Hoang");
        Students s2 = new Students(222, "Khanh");
        Students s3 = new Students(333, "Nam");

        s1.display();
        s2.display();
        s3.display();
    }
}
