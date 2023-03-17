package case_study.until;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckEmail {
    public static final String REGEX="^\\w+@\\w+.\\w+$";
    public static boolean checkEmail(String email){
        Pattern pattern=Pattern.compile(REGEX);
        Matcher matcher= pattern.matcher(email);
        return matcher.matches();
    }
}
