package Strings.Level_3;

import java.util.Scanner;

public class Q3 {
    static char findChar(String s) {
        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) return s.charAt(i);
        }
        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        System.out.println(findChar(text));
        sc.close();
    }
}
