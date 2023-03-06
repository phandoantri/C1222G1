package ss13_sort;

import java.util.Arrays;

public class DemoSort {
    public static void main(String[] args) {
        int[] array={1,2,0,-3,9,8};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void bubbleSort(int[] arr) {
        boolean isSwap = true; //Kiểm tra mảng đã được sort hay chưa
        for (int i = 0; i < arr.length - 1 && isSwap; i++) {
            isSwap = false; // đã sắp xếp
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) { // Mảng chưa được sắp xếp xong
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    isSwap = true; // Chưa được sắp xếp
                }
            }
        }
    }
public static void sort(int[] arr){
    for (int i = 0; i < arr.length; i++) {
        for (int j = i+1; j < arr.length; j++) {
            if (arr[j]<arr[i]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }

    }
}

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i; // Giả sử minIndex = i
            for (int j = i + 1; j < arr.length; j++) { // Tìm vị trí index nhỏ nhất
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) { // Tùy chọn => Giúp tăng tốc độ
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

}
