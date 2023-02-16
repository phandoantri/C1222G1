package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        float width;
        float high;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu rong ");
        width = sc.nextFloat();
        System.out.println("nhap chieu cao ");
        high = sc.nextFloat();
        float aria = width * high;
        System.out.print(aria);

    }
}
