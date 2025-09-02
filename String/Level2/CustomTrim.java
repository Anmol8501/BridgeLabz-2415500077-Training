import java.util.Scanner;

public class CustomTrim {

    public static int[] findBounds(String text) {
        int start = 0, end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ')
            start++;
        while (end >= start && text.charAt(end) == ' ')
            end--;
        return new int[] { start, end };
    }

    public static String substring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length())
            return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String input = sc.nextLine();

        int[] bounds = findBounds(input);
        String customTrim = substring(input, bounds[0], bounds[1]);

        String builtinTrim = input.trim();

        System.out.println("Custom Trim : [" + customTrim + "]");
        System.out.println("Built-in Trim: [" + builtinTrim + "]");
        System.out.println("Are they equal? " + compareStrings(customTrim, builtinTrim));
    }
}
