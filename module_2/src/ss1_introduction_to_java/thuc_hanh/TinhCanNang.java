package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class TinhCanNang {
    public static void main(String[] args) {
        float weight;
        float high;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap weight");
        weight = sc.nextFloat();
        System.out.println("nhap high");
        high = sc.nextFloat();
        float bmi = weight / (high * high);
        System.out.println(bmi);
        if (bmi >= 30) {
            System.out.println("Obese");

        } else if (bmi >= 25) {
            System.out.println("Overweight");
        } else if (bmi >= 18.5) {
            System.out.println("Normal");
        } else {
            System.out.println("Underweight");
        }
    }
}
