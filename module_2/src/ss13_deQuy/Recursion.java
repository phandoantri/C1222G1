package ss13_deQuy;

import java.util.Arrays;
import java.util.Scanner;

public class Recursion {
    public static int binarySearch(int[] arr, int left, int right, int value) {

        int mid = (left + right) / 2;
        if (arr[mid] == value) {
            return mid;
        } else if (value > arr[mid]) {
            return binarySearch(arr, left = mid + 1, right, value);
        } else if (value < arr[mid]) {
            return binarySearch(arr, left, right = mid - 1, value);
        }
        return -1;
    }


    public static void main(String[] args) {

        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhap phan tu cho mang ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr, 0, 5, 2));
    }


}
