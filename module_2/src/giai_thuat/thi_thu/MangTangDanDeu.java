package giai_thuat.thi_thu;

import java.util.ArrayList;
import java.util.List;

public class MangTangDanDeu {
    public static void main(String[] args) {
        int[] arr = {0, 2, 4, 6, 8};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            list.add(arr[i + 1] - arr[i]);
        }
        int count = 0;
        int n = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == n) {
                count++;
            }
        }
        if (count == list.size()) {
            System.out.println("ok");
        } else {
            System.out.println("nit");
        }
    }

}
