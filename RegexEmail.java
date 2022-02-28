package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEmail {
    private static final String EMAIL_PATTERN =
            ("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" +
            "[^-][A-Za-z0-9-]+(\\.[A-Za-z]{3})+(\\.[A-Za-z0-9]+)*$");

    private static Pattern p = Pattern.compile(EMAIL_PATTERN);

    public static boolean validateEmail(String email) {
        Matcher match = p.matcher(email);
        if (match.matches()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the email address");
        String email = sc.next();
        System.out.println(validateEmail(email));
    }
}
