package Strings.Level_3;

import java.util.Scanner;

public class Q6 {
    static String[] frequency(String s) {
        char[] chars = s.toCharArray();
        int[] freq = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') continue;
            freq[i] = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') count++;
        }

        String[] res = new String[count];
        int idx = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                res[idx++] = chars[i] + " " + freq[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] res = frequency(text);
        for (String r : res) System.out.println(r);
        sc.close();
    }
}
