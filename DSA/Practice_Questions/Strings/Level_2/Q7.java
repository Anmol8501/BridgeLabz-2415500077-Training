package Strings.Level_2;

import java.util.Scanner;

public class Q7 {
    static int[] findTrimIndexes(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start <= end && s.charAt(start) == ' ') start++;
        while (end >= start && s.charAt(end) == ' ') end--;

        return new int[]{start, end + 1};
    }

    static String substringUsingCharAt(String s, int start, int end) {
        String r = "";
        for (int i = start; i < end; i++) {
            r += s.charAt(i);
        }
        return r;
    }

    static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int[] idx = findTrimIndexes(text);
        String s1 = substringUsingCharAt(text, idx[0], idx[1]);
        String s2 = text.trim();

        System.out.println(compare(s1, s2));
        sc.close();
    }
}
