package giai_thuat.bai_3;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Demo {
    public static void main(String[] args) {
        String s = "CodeGym";

        String[] strings = s.split("");
        List<String> string1 = new ArrayList<>();
        System.out.println(Arrays.toString(strings));
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(strings[i].toUpperCase())) {
                string1.add(" "+strings[i].toLowerCase());
            } else {
                string1.add(strings[i]);
            }
        }
       String result=" ";
        for ( int i=0;i<string1.size();i++){
            result+=string1.get(i);
        }
        System.out.println(result.trim());


    }
}
