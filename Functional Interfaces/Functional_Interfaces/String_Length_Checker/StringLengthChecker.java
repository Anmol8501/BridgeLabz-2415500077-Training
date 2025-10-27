package Functional_Interfaces.String_Length_Checker;
import java.util.function.Function;
import java.util.Scanner;

public class StringLengthChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int charLimit = 10;
        
        Function<String, Integer> getLength = str -> str.length();
        
        System.out.println("Enter a message:");
        String message = sc.next();
        int length = getLength.apply(message);
        
        if (length > charLimit) {
            System.out.println("Message exceeds character limit: " + length);
        } else {
            System.out.println("Message is within limit: " + length);
        }

        sc.close();
    }
}
