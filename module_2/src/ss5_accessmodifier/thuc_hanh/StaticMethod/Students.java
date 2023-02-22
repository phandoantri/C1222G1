package ss5_accessmodifier.thuc_hanh.StaticMethod;

public class Students {
    private int rollno;
    private String name;
    private static String college = "BBDIT";
    Students(int r, String n) {
        rollno = r;
        name = n;
    }


    static void change() {

        college = "CODEGYM";
    }

    void display() {

        System.out.println(rollno + " " + name + " " + college);
    }
}
