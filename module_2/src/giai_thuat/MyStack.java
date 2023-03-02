package giai_thuat;


import java.util.Stack;

class MyStack{
            public static void main(String[] agrs){
                Stack<Integer> s = new Stack<Integer>();
                for (int i=0; i<10; i++)
                    s.push(i);
                System.out.println("Index of number 6 in Stack : " + s.search(6));
                System.out.println("Index of number 15 in Stack : " + s.search(15));
                while(!s.isEmpty()){
                    System.out.print(s.peek() + "   ");
                    s.pop();
                    System.out.println(s);
                }
            }
        }


