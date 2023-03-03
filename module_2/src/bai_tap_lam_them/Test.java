package bai_tap_lam_them;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        System.out.println("1.them moi giang vien va hoc sinh ");
        System.out.println("2.Xoa giang vien hoac hoc sinh ");
        System.out.println("3.Xem danh sach giang vien va hoc sinh ");
        System.out.println("4. Thoat ");
        System.out.println("chon chuc nang ");

        Scanner sc=new Scanner(System.in);

        int number= Integer.parseInt(sc.nextLine());
        if (number==1){
            Set<Student> students=new LinkedHashSet<>();
            System.out.println("nhap ten ");
            String name=sc.nextLine();
            System.out.println("nhap ID ");
            String id=sc.nextLine();
            System.out.println("nhap ngay thang nam sinh");
            String dayOfBirth=sc.nextLine();
            System.out.println("nhap gioi tinh ");
            String gender=sc.next();
            System.out.println("nhap lop  ");
            String classes=sc.nextLine();


        }

        Teacher teacher1=new Teacher("hue", "123", "03/07/1997", "nu", "van hoc");
        String specialize=sc.nextLine();

    }

}
