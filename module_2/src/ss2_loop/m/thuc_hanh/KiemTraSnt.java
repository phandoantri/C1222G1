package ss2_loop.m.thuc_hanh;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Scanner;

public class KiemTraSnt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap so can ktra");
        int number = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(number + "is a snt");
        } else {
            System.out.println(number + " is not a snt");
        }

    }
}
