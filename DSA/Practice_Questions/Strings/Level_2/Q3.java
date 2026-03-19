package Strings.Level_2;

import java.util.Scanner;

public class Q3 {
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
        int index = 0;
        String temp = "";

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = temp;
                temp = "";
            } else {
                temp += text.charAt(i);
            }
        }
        words[index] = temp;
        return words;
    }

    static String[][] wordWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = splitText(text);
        String[][] data = wordWithLength(words);

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + Integer.parseInt(data[i][1]));
        }
        sc.close();
    }
}
