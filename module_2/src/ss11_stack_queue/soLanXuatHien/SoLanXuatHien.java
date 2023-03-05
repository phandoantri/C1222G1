package ss11_stack_queue.soLanXuatHien;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SoLanXuatHien {
    public static void main(String[] args) {
        Map<Character, Integer> map = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi muon kiem tra ");
        String str = sc.nextLine();
        Character key;
        for (int i = 0; i < str.length(); i++) {
            key=str.toUpperCase().charAt(i);
            int count=0;
            if (map.containsKey(key)){
                count=map.get(key);
                map.put(key,count+1);
            }else {
                map.put(key,1);
            }
        }

        System.out.println(map);
    }
}
