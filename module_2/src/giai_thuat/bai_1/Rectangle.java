package giai_thuat.bai_1;

public class Rectangle {
    public static void main(String[] args) {
        int h = 5;
        for (int i = 1; i <= h; i++) {
            for (int j = h - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2; k++) {
                if (k == 1 || k == i * 2) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = h - 1; i >= 1; i--) {
            for (int j = h - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2; k++) {
                if (k == 1 || k == i * 2) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}