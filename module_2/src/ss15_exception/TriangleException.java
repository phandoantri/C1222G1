package ss15_exception;

import java.util.Scanner;

public class TriangleException {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập cạnh a");
        int a=scanner.nextInt();
        System.out.println("nhập cạnh b ");
        int b=scanner.nextInt();
        System.out.println("nhập cạnh c");
        int c=scanner.nextInt();
        TriangleException triangleException=new TriangleException();
        triangleException.illtriangleException(a,b,c);

    }

    public void illtriangleException(int a, int b, int c) {
        try {
 if (a<0||b<0||c<0||(a+b<=c)||(a+c<=b)||(b+c<=a)){
    throw new IndexOutOfBoundsException("khong phai 3 cạnh tam giác");
}

        }catch (Exception e){
            System.out.println("xảy ra ngoại lệ " +e.getMessage());
        }


    }
}
