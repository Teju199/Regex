package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPhoneNumber {
    private static Pattern p = Pattern.compile("^[9][1][7-9][0-9]{9}");

    public static boolean validatePhoneNumber(String phoneNumber){
        Matcher match = p.matcher(phoneNumber);
        if(match.matches()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the contact number");
        String phoneNumber = sc.next();
        System.out.println(validatePhoneNumber(phoneNumber));
    }
}
