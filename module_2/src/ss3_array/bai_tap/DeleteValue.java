package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteValue {
    public static void main(String[] args) {
        int[] array=new int[10];
        Scanner sc=new Scanner(System.in);
        for ( int i=0;i<array.length;i++){
            System.out.println("nhap phan tu cho mang" + (i+1));
            array[i]=sc.nextInt();
        }
        System.out.println("nhap so can ktra");
        int number=sc.nextInt();
        int index=0;
        for (int i=0;i<array.length;i++){
            if (number==array[i]){
                index=i;
            }
        }
        for (int j=index;j<array.length-1;j++){
            array[j]=array[j+1];

        }
        array[array.length-1]=0;
        System.out.println(Arrays.toString(array));

    }
}
