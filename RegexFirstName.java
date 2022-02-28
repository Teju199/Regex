package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFirstName {
    private static Pattern p = Pattern.compile("^[A-Z][a-zA-Z]{3,}$");

    public static boolean validateUserName(String userName){

        Matcher match = p.matcher(userName);
        if(match.matches()){
            return true;
        }
        return false;
    }

    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First name");
        String name = sc.next();
        System.out.println(validateUserName(name));
    }
}

