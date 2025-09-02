import java.util.Scanner;

public class CharFrequency {

    public static String[][] frequency(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i)]++;

        int count = 0;
        for (int f : freq)
            if (f > 0)
                count++;

        String[][] result = new String[count][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(freq[i]);
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String[][] res = frequency(input);
        System.out.printf("%-10s %-10s%n", "Char", "Freq");
        for (String[] row : res) {
            System.out.printf("%-10s %-10s%n", row[0], row[1]);

        }
        sc.close();
    }
}
