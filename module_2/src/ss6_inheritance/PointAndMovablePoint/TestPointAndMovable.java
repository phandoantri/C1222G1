package ss6_inheritance.PointAndMovablePoint;

public class TestPointAndMovable {
    public static void main(String[] args) {
        Point point=new Point(1,2);
        System.out.println(point.toString());
       point.setXY(2,5);
        System.out.println(point.toString());
        MovablePoint movablePoint=new MovablePoint(2,2,2,2);
        System.out.println(movablePoint.move()); ;
    }
}
