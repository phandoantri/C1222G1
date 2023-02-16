package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class SoNgayTrongNam {
    public static void main(String[] args) {
        int month;
        Scanner sc = new Scanner(System.in);
        month = sc.nextInt();
        switch (month) {
            case 2:
                System.out.println("28 or 29 day");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 day");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 day");
            default:
                System.out.println("not month in year");
        }
    }
}
