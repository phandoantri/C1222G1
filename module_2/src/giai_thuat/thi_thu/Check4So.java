package giai_thuat.thi_thu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Check4So {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();

        String[] string = number.split("");
        List<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < string.length; i++) {
            count++;
        }
        if (count == 4) {
            for (int i = 0; i < string.length; i++) {
                int a = Integer.parseInt(string[i]);
                list.add(a);
            }
            int min = 0;
            for (int i = 0; i < list.size(); i++) {
                min = list.get(0);
                if (list.get(i) < min) {
                    min = list.get(i);
                }
            }
            System.out.println(min);
            String result = "";
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) != min) {
                    result += list.get(i);
                }
            }
            System.out.println(result);

        } else {
            System.out.println("not");
        }
    }
}



