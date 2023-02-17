package ss3_array.bai_tap;

import java.util.Scanner;

public class IndexLonNhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] array=new int[2][3];
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                System.out.println("nhap phan tu chu mang " +(i+1) +"   " +(j+1));
                array[i][j]=sc.nextInt();

            }
        }
        int max=array[0][0];
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                if (array[i][j]>max){
                    max=array[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
