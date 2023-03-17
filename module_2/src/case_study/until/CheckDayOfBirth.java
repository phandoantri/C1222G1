package case_study.until;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckDayOfBirth {
    private static final String REGEX="^\\d{2}-\\d{2}-\\d{4}$";
    public static boolean checkDayOfBirth(String dayOfBirth){
        Pattern pattern=Pattern.compile(REGEX);
        Matcher matcher=pattern.matcher(dayOfBirth);
         return    matcher.matches();
        }
    }

