package case_study.until;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckName {
    private static final String CHECKNAME_REGEX="^[A-Z][a-z]*$";
    public static boolean checkName(String name){
        Pattern pattern=Pattern.compile(CHECKNAME_REGEX);
        Matcher matcher=pattern.matcher(name);
        return matcher.matches();
    }
}
