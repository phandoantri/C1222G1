package giai_thuat.bai_2;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] arr1 = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhap phan tu cho mang arr");
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length-1 ; j++) {
               int temp=arr[j]-arr[i];
            }

        }
    }
}
