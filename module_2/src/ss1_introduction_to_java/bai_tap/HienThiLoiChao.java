package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class HienThiLoiChao {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap ten");
        name = sc.nextLine();
        System.out.println("Hello :" + name);
    }
}
