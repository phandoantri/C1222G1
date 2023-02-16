package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class TinhTienVND {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so tien USD");
        float usd = sc.nextFloat();
        float vnd = usd * 23000;
        System.out.println(vnd);

    }
}
