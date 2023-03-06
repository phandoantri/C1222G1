package ss14_thuatToanSapXep;

public class ViewInsertSort {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 9, 8, 5};
        insertSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }


    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j];
                System.out.println(arr[j]);
            }
            arr[j + 1] = key;
            System.out.println(key);
        }
    }
}

