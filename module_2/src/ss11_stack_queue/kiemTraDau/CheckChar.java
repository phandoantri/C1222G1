package ss11_stack_queue.kiemTraDau;

import java.util.Scanner;
import java.util.Stack;

public class CheckChar {
    public static void main(String args[]) {

        System.out.println(checkBalance("{(a,b)}"));
        System.out.println(checkBalance("{(a},b)"));
        System.out.println(checkBalance("{)(a,b}"));
    }

    public static boolean checkBalance(String s) {
        Stack<Character> stack  = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '[' || c == '(' || c == '{' ) {
                stack.push(c);
            } else if(c == ']') {
                if(stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            } else if(c == ')') {
                if(stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            } else if(c == '}') {
                if(stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
}
