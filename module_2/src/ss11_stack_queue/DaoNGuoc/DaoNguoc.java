package ss11_stack_queue.DaoNGuoc;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguoc {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
       Stack<Integer> stack1=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
for ( int i=stack.size()-1;i>=0;i--){
    stack1.push(stack.peek());
    stack.pop();
}
        System.out.println(stack1);







    }
}
