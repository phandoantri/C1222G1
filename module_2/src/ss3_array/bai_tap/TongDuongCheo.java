package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TongDuongCheo {
    static int tongCheo(int[][] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (i == j || j == numbers[i].length - 1 - i) {
                    sum += numbers[i][j];
                }
            }
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
        System.out.println("mang vua nhap la" + Arrays.deepToString( array));
        System.out.println("tong duong cheo la" + tongCheo(array));
    }

}
