import java.util.Scanner;

public class ShortestLongestWord {

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

    public static String[] customSplit(String text) {
        int n = getLength(text);
        int wordCount = 1;
        for (int i = 0; i < n; i++)
            if (text.charAt(i) == ' ')
                wordCount++;
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

    public static String[][] wordWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static int[] findShortestLongest(String[][] table) {
        int minIdx = 0, maxIdx = 0;
        for (int i = 1; i < table.length; i++) {
            int len = Integer.parseInt(table[i][1]);
            if (len < Integer.parseInt(table[minIdx][1]))
                minIdx = i;
            if (len > Integer.parseInt(table[maxIdx][1]))
                maxIdx = i;
        }
        return new int[] { minIdx, maxIdx };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = customSplit(input);
        String[][] table = wordWithLength(words);
        int[] indices = findShortestLongest(table);

        System.out.println("Shortest word: " + table[indices[0]][0] + " (" + table[indices[0]][1] + ")");
        System.out.println("Longest word : " + table[indices[1]][0] + " (" + table[indices[1]][1] + ")");
    }
}
