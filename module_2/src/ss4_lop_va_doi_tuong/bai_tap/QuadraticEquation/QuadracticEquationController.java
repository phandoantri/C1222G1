package ss4_lop_va_doi_tuong.bai_tap.QuadraticEquation;

import java.util.Scanner;

public class QuadracticEquationController {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap a");
        double a= sc.nextDouble();
        System.out.println("nhap b");
        double b= sc.nextDouble();
        System.out.println("nhap c");
        double c= sc.nextDouble();
        QuadraticEquation quadraticEquation=new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant()>0){
            System.out.println("nghiem 1 la: " + quadraticEquation.getRoot1() +"nghiem 2 la " +quadraticEquation.getRoot2());
        }else if(quadraticEquation.getDiscriminant() == 0){
            System.out.println("nghiem chung la" + quadraticEquation.getRoot1());
        }else {
            System.out.println("phuong trinh vo nhiem");
        }
    }
}
