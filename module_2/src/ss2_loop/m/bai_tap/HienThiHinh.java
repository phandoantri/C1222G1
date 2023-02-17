package ss2_loop.m.bai_tap;

import java.util.Scanner;

public class HienThiHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu cao");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= 7; j++) {
                System.out.print(" * ");

            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= number; i++) {
            for (int j = number; j >= i; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

}
