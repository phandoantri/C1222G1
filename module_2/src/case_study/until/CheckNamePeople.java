package case_study.until;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckNamePeople {

    private static final String PATH="^([A-Z][a-z]+)(\\s[A-Z][a-z]*)+$";
    public static boolean checkNamePeople(String name){
        Pattern pattern=Pattern.compile(PATH);
        Matcher matcher=pattern.matcher(name);
        return matcher.matches();

    }
}
