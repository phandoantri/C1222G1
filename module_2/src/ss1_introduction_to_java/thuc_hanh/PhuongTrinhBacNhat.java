package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class PhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,b,c;
        System.out.println("nhap a");
        a=sc.nextDouble();
        System.out.println("nhap b");
        b=sc.nextDouble();
        System.out.println("nhap c");
        c=sc.nextDouble();
        if (a!=0){
            double answer=(c-b)/a;
            System.out.println("Equation pass with x = " + answer);
        }else {
            if (b==0){
                System.out.println("The solution is al x");
            }else {
                System.out.println("No solution");
            }
        }

    }
}
