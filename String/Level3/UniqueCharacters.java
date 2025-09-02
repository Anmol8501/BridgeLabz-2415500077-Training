import java.util.Scanner;

public class UniqueCharacters {

    public static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static char[] findUnique(String s) {
        int n = getLength(s);
        char[] temp = new char[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            boolean found = false;
            for (int j = 0; j < index; j++) {
                if (temp[j] == c) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                temp[index++] = c;
            }
        }

        char[] unique = new char[index];
        for (int i = 0; i < index; i++)
            unique[i] = temp[i];
        return unique;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        char[] unique = findUnique(input);
        System.out.print("Unique characters: ");
        for (char c : unique)
            System.out.print(c + " ");
            sc.close();
    }
}
