package Strings.Level_3;

import java.util.Scanner;

public class Q4 {
    static String[][] frequency(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] != 0) {
                count++;
                freq[s.charAt(i)] = -freq[s.charAt(i)];
            }
        }

        String[][] result = new String[count][2];
        int idx = 0;
        freq = new int[256];

        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] > 0) {
                result[idx][0] = String.valueOf(s.charAt(i));
                result[idx][1] = String.valueOf(freq[s.charAt(i)]);
                freq[s.charAt(i)] = 0;
                idx++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[][] res = frequency(text);
        for (String[] r : res) {
            System.out.println(r[0] + " " + r[1]);
        }
        sc.close();
    }
}
