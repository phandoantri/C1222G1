package ss4_lop_va_doi_tuong.bai_tap.fan;

public class main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setspeed(fan1.FAST);
        fan1.setcolor("yellow");
        fan1.setradius(10);
        fan1.geton();
        System.out.println(fan1.fan());
        Fan fan2 = new Fan();
        fan2.setspeed(fan2.MEDIUM);
        fan2.setradius(5);
        fan2.setcolor("blue");
        fan2.getoff();
        System.out.println(fan2.fan());
    }
}
