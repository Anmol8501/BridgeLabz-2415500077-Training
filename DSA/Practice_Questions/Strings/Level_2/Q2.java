package Strings.Level_2;

import java.util.Scanner;

public class Q2 {
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

    static String[] splitText(String text) {
        int len = findLength(text);
        int spaces = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') spaces++;
        }

        int[] indexes = new int[spaces + 2];
        indexes[0] = -1;
        int idx = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                indexes[idx++] = i;
            }
        }
        indexes[idx] = len;

        String[] words = new String[spaces + 1];
        for (int i = 0; i < words.length; i++) {
            String w = "";
            for (int j = indexes[i] + 1; j < indexes[i + 1]; j++) {
                w += text.charAt(j);
            }
            words[i] = w;
        }
        return words;
    }

    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] arr1 = splitText(text);
        String[] arr2 = text.split(" ");

        System.out.println(compareArrays(arr1, arr2));
        sc.close();
    }
}
