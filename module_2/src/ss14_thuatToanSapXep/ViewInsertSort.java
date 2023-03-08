package ss14_thuatToanSapXep;

public class ViewInsertSort {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 9, 8, 5};
        insertSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

        }
    }


    public static void insertSort(int[] arr) {
        boolean needNextPass = true;
        for (int i = 1; i < arr.length&&needNextPass; i++) {
            needNextPass=false;
            int key = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j];

            }
            arr[j + 1] = key;
            needNextPass=true;
            if (needNextPass==false){
                System.out.println("Array may be sorted and next pass not needed");
                break;
        }
            System.out.println("list after the "+ i+ " sort ");
            for (int k=0;k<arr.length;k++){
                System.out.print(arr[k]);
            }
            System.out.println();


        }
    }

}

