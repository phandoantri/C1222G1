package ss18_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static final String PHONENUMBER_REGEX="^\\d{2}-0\\d{9}$";

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        System.out.println("nhap so dien thoai xx-0xxxxxxxxx");
        System.out.println(checkPhoneNumber(str));
    }
    public static boolean checkPhoneNumber(String regex){
        Pattern pattern=Pattern.compile(PHONENUMBER_REGEX);
        Matcher matcher= pattern.matcher(regex);
        return matcher.matches();
    }
}
