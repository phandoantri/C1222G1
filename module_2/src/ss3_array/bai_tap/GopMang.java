package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[4];
        int[] array3 = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array1.length; i++) {
            System.out.println("nhap phan tu cho mang array1 " + (i + 1));
            array1[i] = sc.nextInt();
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println("nhap phan tu cho mang array2" + (i + 1));
            array2[i] = sc.nextInt();
        }
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i =0; i < array2.length; i++) {
            array2[i] =array3[i+3];
        }
        System.out.println(Arrays.toString(array3));
    }
}
