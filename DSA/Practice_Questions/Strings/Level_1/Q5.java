package Strings.Level_1;

import java.util.Scanner;

public class Q5 {
    static void generateException(String s) {
        s.charAt(s.length());
    }

    static void handleException(String s) {
        try {
            s.charAt(s.length());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        try {
            generateException(text);
        } catch (Exception e) {
            handleException(text);
        }
        sc.close();
    }
}
