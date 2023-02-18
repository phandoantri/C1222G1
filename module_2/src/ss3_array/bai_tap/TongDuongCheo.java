package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TongDuongCheo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[4][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("nhap phan tu cho mang" + (i + 1) + " " + (j + 1));
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(array));
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || j == array[i].length - 1 - i) {
                    sum = sum + array[i][j];
                }
            }
        }
        System.out.println("tong cac so tren duong cheo la " + sum);
    }
}
