package ss11_stack_queue.chuyenDoiNhiPhan;

import java.util.Scanner;
import java.util.Stack;

public class ChuyenDoi {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so can chuyen doi ");
        int num = sc.nextInt();
        while (num != 0) {
            int d = num % 2;
            stack.push(d);
            num /= 2;
        }
        while (!(stack.isEmpty())) {
            System.out.print(stack.pop());
        }
    }
}

