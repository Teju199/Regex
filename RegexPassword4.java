package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPassword4 {
    private static Pattern p = Pattern.compile("(?=.*[0-9])(?=.*[A-Z])(?=.*[$%*@^&#])" +
            "[A-Za-z0-9].{8,20}$");

    public static boolean validatePassword(String password) throws RegexPasswordException {
        Matcher match = p.matcher(password);
        if (match.matches()) {
            return true;
        }
        else{
            throw new RegexPasswordException("Please enter valid password.");
        }
    }

    public static void main(String[] args) throws RegexPasswordException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password");
        String password = sc.next();
        System.out.println(validatePassword(password));
    }
}

