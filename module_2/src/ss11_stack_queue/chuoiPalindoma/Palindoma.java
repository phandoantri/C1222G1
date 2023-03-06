package ss11_stack_queue.chuoiPalindoma;

import java.util.Scanner;

public class Palindoma {
    public static void main(String[] args) {
        String string;
        char chars;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi muon kiem tra ");
        string = sc.nextLine();
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            chars = string.charAt(string.length() - i - 1);
            if (string.charAt(i) == chars) {
                count++;

            }
        }
        if (count == string.length()) {
            System.out.println("la palidoma");
        } else {
            System.out.println("khong phai");
        }
    }
}