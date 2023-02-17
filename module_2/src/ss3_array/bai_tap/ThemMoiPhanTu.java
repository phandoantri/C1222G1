package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemMoiPhanTu {
    public static void main(String[] args) {
        int[] array = new int[5];
        int[] array1 = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhap phan tu cho mang " + (i + 1));
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        System.out.println("nhap index");
        int index = sc.nextInt();
        System.out.println("nhap so muon chen");
        int x = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (i >= index) {
                array1[i + 1] = array[i];

            } else {
                array1[i] = array[i];
            }
        }
        array1[index] = x;
        System.out.println(Arrays.toString(array1));

    }
}