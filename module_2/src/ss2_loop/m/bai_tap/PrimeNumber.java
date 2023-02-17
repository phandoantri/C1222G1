package ss2_loop.m.bai_tap;

public class PrimeNumber {
    public static void main(String[] args) {
        int countOfPrime = 0;
        int number = 2;
        while (countOfPrime < 20) {
            if (number == 2 || number == 3) {
                System.out.println(number + "is a prime");
                countOfPrime++;
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
                countOfPrime++;
            }
            number++;
        }
    }
}
