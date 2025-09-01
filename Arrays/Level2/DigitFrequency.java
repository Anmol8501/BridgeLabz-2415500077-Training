import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        // Step 2: Convert number to digits array
        String numStr = Long.toString(number);
        int length = numStr.length();
        int[] digits = new int[length];

        for (int i = 0; i < length; i++) {
            digits[i] = numStr.charAt(i) - '0';  // convert char to digit
        }

        // Step 3: Create frequency array of size 10
        int[] freq = new int[10];

        // Step 4: Count frequency
        for (int d : digits) {
            freq[d]++;
        }

        // Step 5: Display frequency
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) { // only show digits that appear
                System.out.println("Digit " + i + " occurs " + freq[i] + " times.");
            }
        }

        sc.close();
    }
}

