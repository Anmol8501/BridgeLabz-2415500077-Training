import java.util.Scanner;

public class CharTypeTable {

    public static String checkCharType(char c) {
        if (c >= 'A' && c <= 'Z')
            c = (char) (c + 32);
        if (c >= 'a' && c <= 'z') {
            if ("aeiou".indexOf(c) != -1)
                return "Vowel";
            else
                return "Consonant";
        }
        return "Not a Letter";
    }

    public static String[][] analyzeString(String text) {
        String[][] arr = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            arr[i][0] = String.valueOf(text.charAt(i));
            arr[i][1] = checkCharType(text.charAt(i));
        }
        return arr;
    }

    public static void display(String[][] arr) {
        System.out.printf("%-10s %-15s%n", "Char", "Type");
        System.out.println("------------------------");
        for (String[] row : arr) {
            System.out.printf("%-10s %-15s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] table = analyzeString(input);
        display(table);
    }
}
