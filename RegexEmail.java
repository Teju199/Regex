package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEmail {
    private static final String EMAIL_PATTERN =
            "^[a-zA-Z0-9_*+-]+(?:\\.[a-zA-Z0-9_*+-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";

    private static Pattern p = Pattern.compile(EMAIL_PATTERN);

    public static boolean validateEmail(String email) throws RegexEmailException {
        Matcher match = p.matcher(email);
        if (match.matches()) {
            return true;
        }else
            throw new RegexEmailException("Please enter valid email address.");
    }

    public static void main(String[] args) throws RegexEmailException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the email address");
        String email = sc.next();
        System.out.println(validateEmail(email));
    }
}
