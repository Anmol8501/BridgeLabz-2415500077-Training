package Strings.Level_3;

import java.util.Scanner;

public class Q5 {
    static char[] unique(String s) {
        char[] temp = new char[s.length()];
        int k = 0;

        for (int i = 0; i < s.length(); i++) {
            boolean u = true;
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    u = false;
                    break;
                }
            }
            if (u) temp[k++] = s.charAt(i);
        }

        char[] res = new char[k];
        for (int i = 0; i < k; i++) res[i] = temp[i];
        return res;
    }

    static String[][] frequency(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;

        char[] u = unique(s);
        String[][] res = new String[u.length][2];

        for (int i = 0; i < u.length; i++) {
            res[i][0] = String.valueOf(u[i]);
            res[i][1] = String.valueOf(freq[u[i]]);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[][] res = frequency(text);
        for (String[] r : res) System.out.println(r[0] + " " + r[1]);
        sc.close();
    }
}
