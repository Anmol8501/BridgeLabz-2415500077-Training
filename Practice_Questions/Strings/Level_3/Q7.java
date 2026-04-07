package Strings.Level_3;

import java.util.Scanner;

public class Q7 {
    static boolean logic1(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    static boolean logic2(String s, int i, int j) {
        if (i >= j) return true;
        if (s.charAt(i) != s.charAt(j)) return false;
        return logic2(s, i + 1, j - 1);
    }

    static char[] reverse(String s) {
        char[] r = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            r[i] = s.charAt(s.length() - 1 - i);
        }
        return r;
    }

    static boolean logic3(String s) {
        char[] o = s.toCharArray();
        char[] r = reverse(s);
        for (int i = 0; i < o.length; i++) {
            if (o[i] != r[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        System.out.println(logic1(text));
        System.out.println(logic2(text, 0, text.length() - 1));
        System.out.println(logic3(text));
        sc.close();
    }
}
