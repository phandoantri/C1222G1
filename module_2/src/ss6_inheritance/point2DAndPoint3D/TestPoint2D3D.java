package ss6_inheritance.point2DAndPoint3D;

public class TestPoint2D3D {
    public static void main(String[] args) {
        Point2D point2D=new Point2D();
        point2D.setX(2);
        point2D.setY(5);
        System.out.println(point2D);
        Point3D point3D=new Point3D();
        point3D.setXYZ(2,4,6);
        System.out.println(point3D.toString());
    }
}
