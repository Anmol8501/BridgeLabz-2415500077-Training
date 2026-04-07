package Strings.Level_2;

import java.util.Scanner;

public class Q5 {
    static String checkChar(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c >= 'a' && c <= 'z') {
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return "Vowel";
            return "Consonant";
        }
        return "Not";
    }

    static int[] countVC(String s) {
        int v = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            String r = checkChar(s.charAt(i));
            if (r.equals("Vowel")) v++;
            else if (r.equals("Consonant")) c++;
        }
        return new int[]{v, c};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int[] res = countVC(text);
        System.out.println(res[0]);
        System.out.println(res[1]);
        sc.close();
    }
}
