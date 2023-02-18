package ss3_array.bai_tap;

import java.util.Scanner;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] array = new char[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhap phan tu cho mang " + (i + 1));
            array[i] = sc.next().charAt(0);
        }
        System.out.println("moi ban nhap tu can kiem tra ");
        char chu = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (chu == array[i]) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("khong co ky tu can tim trong mang ");
        } else {
            System.out.println("co" + count + chu + "trong mang");
        }

    }
}
