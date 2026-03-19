package Strings.Level_2;

import java.util.Scanner;

public class Q8 {
    static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = (int)(Math.random() * 100);
        }
        return ages;
    }

    static String[][] checkVoting(int[] ages) {
        String[][] arr = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            arr[i][0] = String.valueOf(ages[i]);
            if (ages[i] >= 18) arr[i][1] = "true";
            else arr[i][1] = "false";
        }
        return arr;
    }

    static void display(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t" + arr[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] ages = generateAges(n);
        String[][] data = checkVoting(ages);
        display(data);
        sc.close();
    }
}
