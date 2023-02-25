package ss6_inheritance.CircleAndCylinder;

public class CheckInheritance {
    public static void main(String[] args) {
       CircleAndCylinder circleAndCylinder=new CircleAndCylinder();
        circleAndCylinder.setColor("red");
        circleAndCylinder.setRadius(2);
        System.out.println(circleAndCylinder.toString());
        Cylinder cylinder=new Cylinder();
       cylinder.setRadius(2);
       cylinder.getColumn();
        System.out.println(cylinder.toString());

    }
}
