package ss3_array.bai_tap;

import java.util.Scanner;

public class DemSoLanXuatHien {
    static String kyTu(char[] nums,char n) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (n == nums[i]) {
                count++;
            }
        }
        if (count == 0) {
            return "khong co trung phan tu trong mang";
        } else {
            return "co" + " " + count + " " + n + " " + "trong mang";
        }
    }
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            char[] array = new char[5];
            for (int i = 0; i < array.length; i++) {
                System.out.println("nhap phan tu cho mang " + (i + 1));
                array[i] = sc.next().charAt(0);
            }
            System.out.println("moi ban nhap tu can kiem tra ");
            char chu = sc.next().charAt(0);
        System.out.println(kyTu(array,chu));

        }

}
