package Strings.Level_2;

import java.util.Scanner;

public class Q4 {
    static int findLength(String s) {
        int c = 0;
        try {
            while (true) {
                s.charAt(c);
                c++;
            }
        } catch (RuntimeException e) {
            return c;
        }
    }

    static String[] splitText(String text) {
        int len = findLength(text);
        int spaces = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') spaces++;
        }

        String[] words = new String[spaces + 1];
        int idx = 0;
        String temp = "";

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                words[idx++] = temp;
                temp = "";
            } else {
                temp += text.charAt(i);
            }
        }
        words[idx] = temp;
        return words;
    }

    static String[][] wordWithLength(String[] words) {
        String[][] arr = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            arr[i][0] = words[i];
            arr[i][1] = String.valueOf(findLength(words[i]));
        }
        return arr;
    }

    static int[] findShortLong(String[][] arr) {
        int min = Integer.parseInt(arr[0][1]);
        int max = min;

        for (int i = 1; i < arr.length; i++) {
            int len = Integer.parseInt(arr[i][1]);
            if (len < min) min = len;
            if (len > max) max = len;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = splitText(text);
        String[][] data = wordWithLength(words);
        int[] result = findShortLong(data);

        System.out.println("Shortest Length: " + result[0]);
        System.out.println("Longest Length: " + result[1]);
        sc.close();
    }
}
