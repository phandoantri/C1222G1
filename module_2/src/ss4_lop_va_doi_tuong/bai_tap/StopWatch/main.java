package ss4_lop_va_doi_tuong.bai_tap.StopWatch;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        StopWatch stopWatch=new StopWatch();
        stopWatch.start();
        int k=0;
        for (int i=0;i<10000000L;i++){
            k=i;
        }
        stopWatch.end();
        System.out.println(stopWatch.getElapsedTime());

    }
}
