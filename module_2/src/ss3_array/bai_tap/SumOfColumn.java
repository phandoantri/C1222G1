package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfColumn {
    static int symbols(int[][] nums, int n) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = n; j <= n; j++) {
                sum += nums[i][n];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[2][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("nhap phan tu cho mang " + (i + 1) + " " + (j + 1));
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("mang ban can tinh la " + Arrays.deepToString(array));
        System.out.println("nhap cot ban can tinh tong");
        int k = sc.nextInt();
        System.out.println("tong o cot" + " " + k + " " + "la" + " " + symbols(array, k));
    }
}

