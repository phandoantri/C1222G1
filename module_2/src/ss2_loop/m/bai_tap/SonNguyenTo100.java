package ss2_loop.m.bai_tap;

public class SonNguyenTo100 {
    public static void main(String[] args) {
        int number = 2;
        while (number < 100) {
            if (number == 2 || number == 3) {
                System.out.println(number + "is a prime");
                number++;
                continue;
            }
            int count = 0;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(number + "is a prime");
            }
            number++;
        }


    }
}
