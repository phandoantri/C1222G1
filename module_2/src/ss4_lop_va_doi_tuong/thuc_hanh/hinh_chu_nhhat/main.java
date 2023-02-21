package ss4_lop_va_doi_tuong.thuc_hanh.hinh_chu_nhhat;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the width");
        double width=sc.nextDouble();
        System.out.println("enter the height");
        double height=sc.nextDouble();
        Rectangle rectangle=new Rectangle(width,height);
        System.out.println("rectangle"+rectangle.display());
        System.out.println(rectangle.getAria());
        System.out.println(rectangle.getPerimeter());
    }
}
