import java.util.Scanner;

public class FrequencyUnique {

    public static String uniqueCharacters(String text) {
        String unique = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (unique.indexOf(ch) == -1) {
                unique += ch;
            }
        }
        return unique;
    }

    public static String[][] frequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        String unique = uniqueCharacters(text);
        String[][] result = new String[unique.length()][2];

        for (int i = 0; i < unique.length(); i++) {
            char ch = unique.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = String.valueOf(freq[ch]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] result = frequency(text);

        System.out.println("Character | Frequency");
        for (String[] row : result) {
            System.out.println(row[0] + " → " + row[1]);
        }
        sc.close();
    }
}
