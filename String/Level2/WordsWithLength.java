import java.util.Scanner;

public class WordsWithLength {

    // Method to get length without using length()
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    // Method to split string manually
    public static String[] customSplit(String text) {
        int n = getLength(text);
        int wordCount = 1;

        // count spaces
        for (int i = 0; i < n; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int start = 0, index = 0;

        for (int i = 0; i < n; i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[index] = text.substring(start, n);
        return words;
    }

    // Method to create 2D array with word and its length
    public static String[][] wordWithLength(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i]; // word
            result[i][1] = String.valueOf(getLength(words[i])); // length as string
        }
        return result;
    }

    // Method to display in tabular format
    public static void display(String[][] arr) {
        System.out.printf("%-15s %-10s%n", "Word", "Length");
        System.out.println("-------------------------");
        for (String[] row : arr) {
            System.out.printf("%-15s %-10d%n", row[0], Integer.parseInt(row[1]));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = customSplit(input);
        String[][] table = wordWithLength(words);

        display(table);
    }
}
