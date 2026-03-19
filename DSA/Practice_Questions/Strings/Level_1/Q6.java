package Strings.Level_1;

import java.util.Scanner;

public class Q6 {
    static void generateException(String s) {
        s.substring(5, 2);
    }

    static void handleException(String s) {
        try {
            s.substring(5, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
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
