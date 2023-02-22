package ss4_lop_va_doi_tuong.bai_tap.fan;

public class FanController {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setColor("yellow");
        fan1.setRadius(10);
        fan1.getOn();
        System.out.println(fan1.fan());
        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.getOff();
        System.out.println(fan2.fan());
    }
}
