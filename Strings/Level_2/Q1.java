package Strings.Level_2;

import java.util.Scanner;

public class Q1 {
    static int findLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (RuntimeException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        int len1 = findLength(text);
        int len2 = text.length();

        System.out.println(len1);
        System.out.println(len2);
        sc.close();
    }
}
