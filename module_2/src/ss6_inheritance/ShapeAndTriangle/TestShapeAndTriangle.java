package ss6_inheritance.ShapeAndTriangle;

import java.util.Scanner;

public class TestShapeAndTriangle {
    public static void main(String[] args) {
        double side1;
        double side2;
        double side3;
        String color;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap side1");
        side1=Double.parseDouble(sc.nextLine());
        System.out.println("nhap side2");
        side2=Double.parseDouble(sc.nextLine());
        System.out.println("nhap side3");
        side3=Double.parseDouble(sc.nextLine());
        System.out.println("nhap color");
        color=sc.nextLine();


        if ((side1+side2>side3 )&&( side2+side3>side1) && (side1+side3>side2)){
            Triangle triangle=new Triangle(side1,side2,side3);
            triangle.setColor(color);
            triangle.getPerimeter();
            triangle.getAria();
            System.out.println(triangle.toString());
        }else {
            System.out.println("khong phai 3 canh tam giac");
        }


    }
}
