import java.util.Scanner;

public class SplitCompare {

    // Find length without length()
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

    // Split manually
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

    // Compare arrays
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length)
            return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] custom = customSplit(input);
        String[] builtin = input.split(" ");

        // Compare
        boolean same = compareArrays(custom, builtin);

        // Display
        System.out.println("Custom split:");
        for (String w : custom)
            System.out.println(w);

        System.out.println("\nBuilt-in split:");
        for (String w : builtin)
            System.out.println(w);

        System.out.println("\nAre both equal? " + same);
    }
}
