package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfDiagonal {
    static int sumOfDiagonal(int[][] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
                sum+=numbers[i][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[4][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("nhap phan tu cho mang" + (i + 1) + " " + (j + 1));
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("mang vua nhap la" + Arrays.deepToString(array));
        System.out.println("tong duong cheo la" + sumOfDiagonal(array));
    }

}
