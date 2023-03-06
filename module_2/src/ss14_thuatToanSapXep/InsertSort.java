package ss14_thuatToanSapXep;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = {1, 4, 5, 9, -2};
        insertSort(array);
        System.out.print(Arrays.toString(array));
    }

    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = key;
        }
    }
}
