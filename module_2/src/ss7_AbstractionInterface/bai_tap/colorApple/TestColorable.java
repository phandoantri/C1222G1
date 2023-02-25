package ss7_AbstractionInterface.bai_tap.colorApple;

import java.util.Arrays;

public class TestColorable {
    public static void main(String[] args) {
        Circle circle=new Circle(2,"red",false);
        Rectangle rectangle=new Rectangle(3.0,2.0);
        Shape[] shapes=new Shape[]{circle,rectangle};





        for (Shape shape:shapes){
            if (shape instanceof IColorable){
                System.out.println(rectangle.getArea());
                ( (IColorable) shape).howToColor();
            }
        }
    }
}
