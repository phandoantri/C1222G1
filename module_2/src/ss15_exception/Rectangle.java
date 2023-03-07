package ss15_exception;

import ss6_inheritance.ShapeAndTriangle.Triangle;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap canh a cua tam giac ");
        int a = sc.nextInt();
        System.out.println("nhap canh b cua tam giac ");
        int b = sc.nextInt();
        System.out.println("nhap canh c cua tam giac ");
        int c = sc.nextInt();
        if ((a < 0 || b < 0 || c < 0)) {
            throw new IndexOutOfBoundsException("cạnh tam giác không được nhỏ hơn 0");
        } else if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
            throw new IndexOutOfBoundsException("không phải 3 cạnh tam giác");
        }else {
            System.out.println("là 3 cạnh của tam giác" );
        }

    }
}
