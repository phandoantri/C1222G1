package ss4_lop_va_doi_tuong.bai_tap.fan;

public class main {
    public static void main(String[] args) {
        Fan fan1=new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setColor( "yellow");
        fan1.setRadius(10);
        fan1.getBat();
        System.out.println(fan1.fan());

    }
}
